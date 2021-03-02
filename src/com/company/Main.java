package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("____________________________________________________________________________________");

        Mobile user1 = new Mobile("Deepak Mondol", "01911321535", 125f,"Android", false);

        user1.showinfo();

        System.out.println("____________________________________________________________________________________");

        Mobile user2 = new Mobile("Monke", "01696969699", 69.69f,"Monke++", true);

        user2.showinfo();

        System.out.println("____________________________________________________________________________________");

        Mobile user3 = new Mobile("Remon", "01972345321", 2.25f,"Raspberry pi(Rainbow edition)", false);

        user3.showinfo();

        System.out.println("____________________________________________________________________________________");

    }
}
