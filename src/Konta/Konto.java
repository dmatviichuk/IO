package Konta

public class Konto implements KontoBL{	
    public String role;
    private int id;
    private String username;
    private String password;
    public String first_name;
    public String last_name;
    public int pesel

    public Konto(){
        role = NULL;
        id = 0;
        username = NULL;
        password = NULL;
        first_name = NULL;
        last_name = NULL;
        pesel = 0;
    }
    
    public Konto(String[] data) {
    	role = NULL;
        id = 0;
        username = data[0];
        password = data[1];
        first_name = data[2];
        last_name = data[3];
        pesel = data[4];
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
    
    public String getPesel() {
    	return pesel
    }

    public void setPesel(int new_pesel) {
    	pesel = new_pesel;
    }
        
    public void showData() {
    	System.out.println("\n Twoje dane: \n Rola: " + role + "\n Id: " + id +
    			"\n Imie: " + first_namie + "\n Nazwisko: " + last_ name + 
    			+ "\n Pesel: " + pesel)
    }
}
