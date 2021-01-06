package Konta;

import Grupy.Plan;

public class Student extends Konto implements StudentBL{
	public static int student_id_count = 100000;
    private int id;
    private int pesel;
    private String username;
    private String password;
    private Plan student_plan;
    private Plan nowy_plan;

    public Student(){
        role = "Student";
        id = student_id_count++;
        username = null;
        password = null;
        first_name = null;
        last_name = null;
        pesel = 0;
        student_plan = null;
    }
    
    public Student(String[] data) {
    	role = "Student";
        id = student_id_count++;
        username = data[0];
        password = data[1];
        first_name = data[2];
        last_name = data[3];
        pesel = 0;
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
		nowy_plan = new Plan(id);
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
	
}
