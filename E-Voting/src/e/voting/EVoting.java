/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.voting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class EVoting{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Enter \n1 - Region \n 2- National\n Enter: ");
        //Take input
       int k = Utilities.getInteger();
        Party p1 = new Party();
        //Object of party class
        p1.partyName = "TTT";
        //Object of party class
        Party p2 = new Party();
        p2.partyName = "FFF";
       
        Parties parties = new Parties("Karachi");
        parties.addParty(p1);
        parties.addParty(p2
        );
        //admin id pass check
        Accounts accounts = new Accounts();
        Admin account = new Admin("admin", "admin");
        //add new user
        accounts.addUser(account);
        if (k == 1) {
            EVote system = new EVote(parties, accounts, "region");
//            EVote sys = Utilities.Deserialize("region");
        //    if(sys != null)
          //      system = sys;
            while (true) {
                System.out.println("1- Login 2- Exit");
                //take input
                int index = Utilities.getInteger();
                //match selection
                if (index == 1) {
                    System.out.println("Enter User");
                    String user = Utilities.getString();
                    System.out.println("Enter Pass");
                    String pass = Utilities.getString();
                    system.authenticate(user, pass);
                } else if (index == 2) {
                    break;
                }
            }
        } else if (k == 2) {
            EVote system = new EVote(parties, accounts, "national");
  //          EVote sys = Utilities.Deserialize("national");
      //      if(sys != null)
    //            system = sys;
            while (true) {
                System.out.println("1- Login 2- Exit");
                int index = Utilities.getInteger();
                if (index == 1) {
                    System.out.println("Enter User");
                    String user = Utilities.getString();
                    System.out.println("Enter Pass");
                    String pass = Utilities.getString();
                    system.authenticate(user, pass);
                } else if (index == 2) {
                    break;
                }
            }
        }
    }
}
