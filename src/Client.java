import java.util.Random;

public class Client {
    String nume;
    String prenume;
    int varsta;

    static String[] numeS = {"Ana","Maria","Ion","Vasile","Mirela","Nicolae","Maxim","Madalina","Ioana"};
    static String[] prenum = {"A","M","I","V","J","N","P","B","C"};

    Client(){
        Random random = new Random();
        this.nume= numeS[random.nextInt(0, numeS.length)] ;
        this.prenume = prenum[random.nextInt(0, prenum.length)];
        this.varsta = random.nextInt(17,80);
    }

    public String getNume(){ return nume; }
    public String getPrenume(){ return prenume; }
    public int getVarsta(){ return varsta;}

    public void setNume(String numeNou){ this.nume = numeNou;}
    public void setPrenume(String prenumeNou){ this.prenume = prenumeNou; }
    public void setVarsta(int varstaNou){if (varstaNou>0&& varstaNou<110){ this.varsta = varstaNou; } }
}