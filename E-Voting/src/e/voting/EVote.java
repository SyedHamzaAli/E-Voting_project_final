/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.voting;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;


class EVote {
    public String system;
    public Parties parties;
    public Accounts accounts;
    public EVote(Parties party, Accounts accounts, String system) {
        this.parties = party;
        this.accounts = accounts;
        this.system = system;
    }
    //check use id pass
    public void authenticate(String username, String password) throws IOException {
        User b = accounts.getUser(username);
        if (b != null && b.password.equals(password)) {
            if (b instanceof Voter) {
                getVoterMenu((Voter) b);
            } else {
                getAdminMenu((Admin) b);
            }
        } else {
            System.out.println("Invalid Auth");
        }
    }
    //select party to vote
    public void getVoterMenu(Voter V) throws IOException {
        while (true) {
            System.out.println("\n\n1- Cast Votes");
            System.out.print("2- Logout\n");
            int number = Utilities.getInteger();
            if (number == 1) {
                showParties();
                // check previous vote
                if (V.vote == null) {
                    System.out.println("Vote for your Party");
                    int party = Utilities.getInteger();
                    parties.parties.get(party).voters.add(V);
                    V.castVote(parties.parties.get(party));
                    System.out.println("Vote casted!");
     //               Utilities.Serialize(this,system);
                } else {
                    System.out.println("You have already Voted!");
                }
            } else if (number == 2) {
                break;
            }
        }
    }
    //Admin menu
    public void getAdminMenu(Admin Y) throws IOException {
        while (true) {
            System.out.println("\n\n1- Show Votes");
            System.out.println("2- Create Voter Account");
            System.out.print("3- Logout\n");
            int number = Utilities.getInteger();
            if (number == 1) {
                showStats();
            } else if (number == 2) {
                createVoter();
            } else {
                break;
            }
        }
    }
    //user/admin login
    public void createVoter() throws IOException {
        System.out.println("Enter CNIC of voter: ");
        String cnic = Utilities.getString();
        System.out.println("Enter username of voter: ");
        String username = Utilities.getString();
        System.out.println("Enter password of voter: ");
        String password = Utilities.getString();
        Voter m = new Voter(username, password);
        m.cnic = cnic;
        accounts.addUser(m);
       // Utilities.Serialize(this,system);
    }

    public void showParties() {
        for (int i = 0; i < parties.parties.size(); i++) {
            System.out.println(i + ": " + parties.parties.get(i).partyName);
        }
    }

    public void showStats() {
        for (int i = 0; i < parties.parties.size(); i++) {
            System.out.println(i + ": " + parties.parties.get(i).partyName + "\tVotes : " + parties.parties.get(i).voters.size());
        }
    }
    
}
