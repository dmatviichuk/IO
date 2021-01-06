package Przedmioty;

public class Przedmiot {
	public static int przedmiot_id_count = 0;
	
	public int przedmiot_id;
	public String przedmiot_name;
	
	Przedmiot(){
		przedmiot_id = przedmiot_id_count++;
		przedmiot_name = null;
	}
	
	Przedmiot(String set_przedmiot_name){
		przedmiot_id = przedmiot_id_count++;
		przedmiot_name = set_przedmiot_name;
	}
	
	public String getPrzedmiot_name(){
		return przedmiot_name;
	}
	
	public void setPrzedmiot_name(String new_przedmiot_name){
		przedmiot_name = new_przedmiot_name;
	}
	
}
