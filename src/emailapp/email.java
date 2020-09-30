package emailapp;

import java.util.Scanner;

// email class to handle and manipulate user information
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
    final int defMailboxCap = 500;

    // constructor to get fname & lname
    public email(String firstName, String lastName) {
        this.fname = firstName;
        this.lname = lastName;
        //System.out.println(firstName + "\t\t" + lastName);
        this.dept = setDept();
        //System.out.println("Your Dept set to : " + this.dept);
        this.password = genRandomPass(defPassLen);
        //System.out.println("Default password:" + this.password);
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.emailSuff;
        //System.out.println("Your new company email: " + this.email);
    }

    // Set Dept by taking input from the user
    private String setDept() {
        String ret_string = "\0";
        System.out.println("Enter Choice\n A. Sales\n B. Dev\n C. Accounts\n");
        Scanner in = new Scanner(System.in);
        char deptChosen = in.next().charAt(0);
        switch (deptChosen) {
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
        return ret_string;
    }
// Random password generation for the account
    private String genRandomPass(int len) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+";
        char[] pass = new char[len];
        for (int i = 0; i < len; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            pass[i] = passwordSet.charAt(random);
        }
        return new String(pass);
    }

    // setter for mailbox cap
    public void setMailboxCap(int cap) {
        this.mailboxCap = cap;
    }
    // setter for alternate email
    public void setAltEmail(String altemail) {
        this.altEmail = altemail;
    }
// setter for chnage password
    public void changePass(String pass) {
        this.password = password;
    }
//getter for mailbox cap
    public int getMailboxCap() {
        return this.mailboxCap;
    }
// getter for alt email
    public String getAltEmail() {
        return this.altEmail;
    }
// getter for get password
    public String getPassword() {
        return this.password;
    }
// get info function to display account info to the user
    public String getInfo() {
        return "\nFirstname = " + fname + "\nLastname = " +
                lname + "\nEmail = " + email + "\nAlt email = " + altEmail +
                "\nPassword = " + password + "\nMailbox cap = " + mailboxCap;
    }
}
