package emailapp;

import java.util.Scanner;

public class email {
    private String fname;
    private String lname;
    private String dept;
    private String password;
    private String email;
    private int mailboxCap;
    private String altEmail;
    final int defPassLen = 8;
    final String emailSuff = "company.com";

    // constructor to get fname & lname
    public email(String firstName, String lastName) {
        this.fname = firstName;
        this.lname = lastName;
        System.out.println(firstName + "\t\t" + lastName);
        this.dept = setDept();
        System.out.println("Your Dept set to : " + this.dept);
        this.password = genRandomPass(defPassLen);
        System.out.println("Default password:" + this.password);
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase()+ "@" +this.emailSuff;
        System.out.println("Your new company email: " + this.email);
    }

    private String setDept(){
        String ret_string = "\0";
        System.out.println("Enter Choice\n A. Sales\n B. Dev\n C. Accounts\n");
        Scanner in = new Scanner(System.in);
        char deptChosen = in.next().charAt(0);
        switch (deptChosen)
        {
            case 'A':
                ret_string = "Sales";
                break;
            case 'B':
                ret_string = "Dev";
                break;
            case 'C':
                ret_string = "Accounts";
                break;
            default:
                ret_string = "Unknown";
                break;
        }
        return  ret_string;
    }

    private String genRandomPass(int len){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+";
        char[] pass = new char[len];
        for (int i =0; i<len;i++)
        {
            int random = (int)(Math.random() * passwordSet.length());
            pass[i] = passwordSet.charAt(random);
        }
        return new String(pass);
    }

public void setMailboxCap(int cap){
        this.mailboxCap = cap;
}

public void setAltEmail(String altemail){
        this.altEmail = altemail;
}

public void changePass(String pass){
        this.password = password;
}

public int getMailboxCap(){
        return this.mailboxCap;
}
public String getAltEmail(){
        return this.altEmail;
}
public String getPassword(){
        return this.password;
}
}
