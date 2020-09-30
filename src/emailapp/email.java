package emailapp;

import java.util.Scanner;

public class email {
    private String fname;
    private String lname;
    private String dept;
    private String password;
    private int mailboxCap;
    private String altEmail;
    final int defPasslen = 8;

    // constructor to get fname & lname
    public email(String firstName, String lastName) {
        this.fname = firstName;
        this.lname = lastName;
        System.out.println(firstName + "\t\t" + lastName);
        this.dept = setDept();
        System.out.println("Your Dept set to : " + this.dept);
        this.password = genRandompass(defPasslen);
        System.out.println("Default password:" + this.password);
    }

    private String setDept(){
        String ret_string = "\0";
        System.out.println("Enter Choice\n A. for Sales\n B. for Dev\n C. Accounts\n");
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

    private String genRandompass(int len){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+";
        char[] pass = new char[len];
        for (int i =0; i<len;i++)
        {
            int random = (int)(Math.random() * passwordSet.length());
            pass[i] = passwordSet.charAt(random);
        }
        return new String(pass);
    }

}
