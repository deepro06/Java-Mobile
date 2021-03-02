package com.company;

public class Mobile {

   private String mobileOwnerName;

   private String mobileNumber;

   private float mobileBalance;

   private String mobileOsName;

   boolean lock;

   public Mobile(String mobileOwnerName, String mobileNumber, float mobileBalance, String mobileOsName, boolean lock){
    this.mobileOwnerName = mobileOwnerName;
    this.mobileNumber = mobileNumber;
    this.mobileBalance = mobileBalance;
    this.mobileOsName = mobileOsName;
    this.lock = lock;
    }

  public void showinfo(){

    if(!lock){
        System.out.println("Name :-" + mobileOwnerName);
        System.out.println("Mobile number:-" + mobileNumber);
        System.out.println("Mobile balance:-" + mobileBalance);
        System.out.println("Mobile Os :-" + mobileOsName);
    }

    else{
        System.out.println("** Error **");
        System.out.println("Cause:- Phone is locked(true)");
    }
 }



}