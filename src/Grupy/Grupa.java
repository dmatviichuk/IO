
public class Grupa {
	public static int group_id_count = 0;
	
	public int group_id;
	public String name;
	public Date date;
	public int time;
	public int prowadzacy_id;
	public int ilosc_studentow;
	public List<int> zapisani_studenci;
	public int max_ilosc_studentow;
	public Przedmiot przedmiot;
	
	Grupa(){
		group_id = group_id_count++;
		name = NULL;
		date = NULL
		time = 0;
		prowadzacy_id = 0;
		ilosc_studentow = 0;
		zapisani_studenci = NULL
		max_ilosc_studentow = 0;
		przedmiot = NULL;
	}
	
	Grupa(String[] data, Date set_date, Przedmiot set_przedmiot){
		group_id = group_id_count++;
		name = data[0];
		date = set_date
		time = data[1];
		prowadzacy_id = data[2];
		ilosc_studentow = 0;
		zapisani_studenci = NULL
		max_ilosc_studentow = data[3];
		przedmiot = set_przedmiot
	}
}
