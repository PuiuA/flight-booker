import java.util.Random;

public class Client {
    String nume;
    String prenume;

    static String[] numeS = {"Ana","Maria","Ion","Vasile","Mirela","Nicolae","Maxim","Madalina","Ioana"};
    static String[] prenum = {"A","M","I","V","J","N","P","B","C"};

    Client(){
        Random random = new Random();
        this.nume= numeS[random.nextInt(0, numeS.length)] ;
        this.prenume = prenum[random.nextInt(0, prenum.length)];
    }
}