package Grupy;

import Database.DataMaker;
import Przedmioty.Przedmiot;
import java.util.List;

public class Grupa implements GrupaBL{
	
	public enum Types {
		Wyklad,
		Cwiczenia,
		Laboratorium,
		Projekt,
		Seminarium
	}
	
	public enum Days {
		Poniedzialek,
		Wtorek,
		Sroda,
		Czwartek,
		Piatek,
		Sobota,
		Niedziela
	}
	
	public int group_id;
	public String przedmiot;
	public Types type;
	public Days day;
	public int time;
	public int prowadzacy_id;
	public int ilosc_studentow;
	public List<Integer> zapisani_studenci;
	public int max_ilosc_studentow;
	
	public Grupa(){
		group_id = DataMaker.group_id_count++;
		przedmiot = null;
		type = null;
		day = null;
		time = 0;
		prowadzacy_id = 0;
		ilosc_studentow = 0;
		zapisani_studenci = null;
		max_ilosc_studentow = 0;
	}
	
	public Grupa(int[] data, Types set_type, Days set_day, Przedmiot set_przedmiot){
		group_id = DataMaker.group_id_count++;
		przedmiot = set_przedmiot.przedmiot_name;
		type = null;
		day = null;
		time = data[0];
		prowadzacy_id = data[1];
		ilosc_studentow = 0;
		zapisani_studenci = null;
		max_ilosc_studentow = data[2];
	}
	
	public String getPrzedmiot() {
		return przedmiot;
	}
	
	public void setPrzedmiot(String new_przedmiot) {
		przedmiot = new_przedmiot;
	}
	
	public Types getType() {
		return type;
	}
	
	public void setType(Types new_type) {
		type = new_type;
	}
	
	public Days getDay() {
		return day;
	}
	
	public void setDay(Days new_day) {
		day = new_day;
	}
	
	public int getTime() {
		return time;
	}
	
	public void setTime(int new_time) {
		time = new_time;
	}
	
	public int getProwadzacy_id() {
		return prowadzacy_id;
	}
	
	public void setProwadzacy_id(int new_prowadzacy_id) {
		prowadzacy_id = new_prowadzacy_id;
	}
	
	public int setMax_ilosc_studentow() {
		return max_ilosc_studentow;
	}
	
	public void setMax_ilosc_studentow(int new_max_ilosc_studentow) {
		max_ilosc_studentow = new_max_ilosc_studentow;
	}

	public void showGroupInfo() {
		System.out.println("\n Dane grupy: \n Przemiot: " + przedmiot + "\n Dzien: " + day +
    			"\n Godzina: " + time/100 + ":" + time%100 + "\n Prowadzacy: " + prowadzacy_id);
	}
	
	public boolean findId(int id) {
		return zapisani_studenci.contains(id);
	}
	
	public int enroll(int student_id) {
		if(zapisani_studenci.contains(student_id)) {
			return 1;
		}
		else if(ilosc_studentow >= max_ilosc_studentow) {
			return 2;
		}
		else {
			zapisani_studenci.add(student_id);
			ilosc_studentow++;
			return 0;
		}
		
	}
	
	public boolean unenroll(int student_id) {
		if(zapisani_studenci.contains(student_id)) {
			zapisani_studenci.remove(zapisani_studenci.indexOf(student_id));
			ilosc_studentow--;
			return true;
		}
		else {
			return false;
		}
	}

	
	public void enrollAdmin(int student_id) {
		//nie ma potrzeby implementacji
	}

	
	public void unenrollAdmin(int student_id) {
		//nie ma potrzeby implementacji
	}

}
