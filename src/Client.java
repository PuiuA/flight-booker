import java.util.Random;

public class Client {
    private String firstName;
    private String lastName;
    private int age;

    static String[] numeS = {"Ana","Maria","Ion","Vasile","Mirela","Nicolae","Maxim","Madalina","Ioana"};
    static String[] prenum = {"A","M","I","V","J","N","P","B","C"};

    Client(){
        Random random = new Random();
        this.firstName= numeS[random.nextInt(0, numeS.length)] ;
        this.lastName = prenum[random.nextInt(0, prenum.length)];
        this.age = random.nextInt(17,80);
    }

    public String getFirstName(){ return firstName; }
    public String getLastName(){ return lastName; }
    public int getAge(){ return age;}

    public void setFirstName(String newFirstName){ this.firstName = newFirstName;}
    public void setLastName(String newLastName){ this.lastName = newLastName; }
    public void setAge(int newAge){if (newAge>0 && newAge<110){ this.age = newAge; } }
}