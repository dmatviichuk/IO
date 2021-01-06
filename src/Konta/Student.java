package Konta

public class Student extends Konto implements StudentBL{
	public static int student_id_count = 100000;
	
    private int pesel;
    private Plan student_plan;

    public Student(){
        role = "Student";
        id = student_id_count++;
        username = NULL;
        password = NULL;
        first_name = NULL;
        last_name = NULL;
        pesel = 0;
        student_plan = NULL;
    }
    
    public Student(String[] data) {
    	role = "Student";
        id = student_id_count++;
        username = data[0];
        password = data[1];
        first_name = data[2];
        last_name = data[3];
        pesel = data[4];
        student_plan = NULL;
    }
    
    public Plan getStudent_plan() {
    	return student_plan
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
		if(student_plan == NULL) {
			generateSchedule();
		}
		else {
			student_plan.fillGroups();
		}
		student_plan.showSchedule();
	}
	
}
