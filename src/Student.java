public class Student {
    static int student_idIT = 0;
    static int peselIT = 0;
    public String role;
    private int student_id;
    public String first_name;
    public String last_name;
    private String username;
    private String password;
    private int pesel;

    public Student(String[] data){
        student_id = student_idIT++;
        role = data[0];
        first_name = data[1];
        last_name = data[2];
        username = data[3];
        password = data[4];
        pesel = peselIT++;
    }

    public static int getStudent_idIT() {
        return student_idIT;
    }

    public int getStudent_id() {
        return student_idIT;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public static int getPeselIT() {
        return peselIT;
    }

    public int getPesel() {
        return pesel;
    }
}
