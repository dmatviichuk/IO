package Grupy

public class Grupa implements GrupaBL{
	public static int group_id_count = 0;
	
	enum Types {
		Wyklad,
		Laboratorium,
		Projekt,
		Seminarium
	}
	
	enum Days {
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
	public List<int> zapisani_studenci;
	public int max_ilosc_studentow;
	
	Grupa(){
		group_id = group_id_count++;
		name = NULL;
		type = NULL;
		day = NULL;
		time = 0;
		prowadzacy_id = 0;
		ilosc_studentow = 0;
		zapisani_studenci = NULL;
		max_ilosc_studentow = 0;
		przedmiot = NULL;
	}
	
	Grupa(String[] data, Type set_type, Days set_day, Przedmiot set_przedmiot){
		group_id = group_id_count++;
		name = set_przedmiot.przedmiot_name;
		type = set_type
		day = set_day;
		time = data[0];
		prowadzacy_id = data[1];
		ilosc_studentow = 0;
		zapisani_studenci = NULL
		max_ilosc_studentow = data[2];
		przedmiot = set_przedmiot
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
		System.out.println("\n Dane grupy: \n Przemiot: " + przedmiot + "\n Dzien: " + id +
    			"\n Godzina: " + time/100 + ":" + time%100 + "\n Prowadzacy: " + prowadzacy_id)
	}
	
	public boolean findId(int id) {
		return zapisani_studenci.contains(id);
	}
	
	public void enroll(int student_id) {
		if(ilosc_studentow < max_ilosc_studentow) {
			zapisani_studenci.add(student_id);
			ilosc_studentow++;
		}
		else {
			System.out.println("\n Wystapil blad podczas zapisu - przekroczono dozwolona liczbe miejsc.");
		}
		
	}
	
	public void unenroll(int student_id) {
		zapisani_studenci.remove(zapisani_studenci.indexOf(student_id));
		ilosc_studentow--;
	}

}
