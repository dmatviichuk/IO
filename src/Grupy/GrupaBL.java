package Grupy;

public interface GrupaBL {
	public void showGroupInfo();
	public boolean findId(int id);
	public int enroll(int student_id);
	public boolean unenroll(int student_id);
	public void enrollAdmin(int student_id);
	public void unenrollAdmin(int student_id);
}
