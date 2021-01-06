package Grupy;

import java.util.List;

public class Plan implements PlanBL{
	public int owner_id;
	public List <Grupa> lista_grup;
	
	public Plan(int set_id){
		owner_id = set_id;
		lista_grup = null;
	}

	public void fillGroups() {
		lista_grup.clear();
		for(Grupa x : all_groups) {
			if(x.findId(owner_id))
				lista_grup.add(x);
		}
	}
	
	public void showSchedule() {
		if(lista_grup.isEmpty()) {
			System.out.println("\n Twoj plan jest pusty.");
		}
		else {
			for(Grupa x : lista_grup)
				x.showGroupInfo();
		}
	}
	
}
