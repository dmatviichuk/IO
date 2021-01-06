package Konta;

public class Konto implements KontoBL{
    protected int id;
    protected int pesel;
    public String role;
    protected String username;
    protected String password;
    public String first_name;
    public String last_name;

    public Konto(){
        role = null;
        id = 0;
        username = null;
        password = null;
        first_name = null;
        last_name = null;
        pesel = 0;
    }
    
    public Konto(String[] data) {
    	role = null;
        id = 0;
        username = data[0];
        password = data[1];
        first_name = data[2];
        last_name = data[3];
        pesel = 0;
    }

    public String getUsername() {
        return username;
    }
    
    public void setUsername(String new_username) {
        username = new_username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String new_password) {
        password = new_password;
    }
    
    public String getFirst_Name() {
        return first_name;
    }

    public void setFirst_Name(String new_first_name){
        first_name = new_first_name;
    }
    
    public String getLast_Name() {
        return last_name;
    }
   
    public void setLast_Name(String new_last_name) {
        last_name = new_last_name;
    }
    
    public int getPesel() {
    	return pesel;
    }

    public void setPesel(int new_pesel) {
    	pesel = new_pesel;
    }
        
    public void showData() {
    	System.out.println("\n Twoje dane: \n Rola: " + role + "\n Id: " + id +
    			"\n Imie: " + first_name + "\n Nazwisko: " + last_name
                + "\n Pesel: " + pesel);
    }
}
