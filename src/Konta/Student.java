package Konta;

import Database.DataMaker;
import Grupy.*;

public class Student extends Konto implements StudentBL{
	
	private Plan student_plan;

    public Student(){
        role = "Student";
        id = DataMaker.student_id_count++;
        username = null;
        password = null;
        first_name = null;
        last_name = null;
        pesel = 0L;
        student_plan = null;
    }
    
    public Student(String[] data, long set_pesel) {
    	role = "Student";
        id = DataMaker.student_id_count++;
        username = data[0];
        password = data[1];
        first_name = data[2];
        last_name = data[3];
        pesel = set_pesel;
        student_plan = null;
    }
    
    public Plan getStudent_plan() {
    	return student_plan;
    }
    
    public void setStudent_plan(Plan new_student_plan) {
    	student_plan = new_student_plan;
    }
    
    public void checkMarks() {
    	//nie ma potrzeby implementacji
    }
    
	public void generateSchedule() {
		Plan nowy_plan = new Plan(id);
		nowy_plan.fillGroups();
		setStudent_plan(nowy_plan);
	}
	
	public void checkSchedule() {
		if(student_plan == null) {
			generateSchedule();
		}
		else {
			student_plan.fillGroups();
		}
		student_plan.showSchedule();
	}

	
	public void enroll(Grupa grupa) {
		int status = grupa.enroll(id);
		
		switch(status) {
		case 0:
			System.out.println("\n Poprawnie zapisano do wybranej grupy.");
			break;
		case 1:
			System.out.println("\n Wystapil blad podczas zapisu - jestes juz zapisany do tej grupy.");
			break;
		case 2:
			System.out.println("\n Wystapil blad podczas zapisu - nie ma juz wolnych miejsc.");
			break;
		}
	}

	
	public void unenroll(Grupa grupa) {
		if(grupa.unenroll(id)) {
			System.out.println("\n Poprawnie wypisano z wybranej grupy.");
		}
		else {
			System.out.println("\n Nie jestes zapisany do tej grupy.");
		}
	}
	
}
