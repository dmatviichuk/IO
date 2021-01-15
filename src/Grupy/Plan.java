package Grupy;

import Database.DataMaker;

import java.util.ArrayList;
import java.util.List;

public class Plan implements PlanBL{
	
	public int owner_id;
	public List <Grupa> lista_grup = new ArrayList<Grupa>() ;
	
	public Plan(int set_id){
		owner_id = set_id;
		lista_grup = new ArrayList<Grupa>();
	}

	public Plan() {
		owner_id = 0;
		lista_grup = new ArrayList<Grupa>();
	}

	public void fillGroups() {
		lista_grup.clear();
		for(Grupa x : DataMaker.all_groups) {
			if(x.findId(owner_id))
				lista_grup.add(x);
		}
	}
	
	public boolean showSchedule() {
		if(lista_grup.isEmpty()) {
			//System.out.println("\n Twoj plan jest pusty.");
			return false;
		}
		else {
			for(Grupa x : lista_grup)
				x.showGroupInfo();
			return true;
		}
	}
	
}
