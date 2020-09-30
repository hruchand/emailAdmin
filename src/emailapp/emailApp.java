package emailapp;

// Main class of the project
public class emailApp {
    public static void main(String[] args) {
        email email1 = new email("Harsh", "Ruch");
        email1.setAltEmail("xx.yy@gmail.com");
        email1.setMailboxCap(email1.defMailboxCap);
        //System.out.println("Alt Email is "+ email1.getAltEmail());
        System.out.println(email1.getInfo());

    }
}
