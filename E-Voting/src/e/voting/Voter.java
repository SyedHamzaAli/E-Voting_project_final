/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.voting;

import java.io.Serializable;


class Voter extends User{
    
    //save voter data
    public Party vote;
    public String cnic;
    public String name;
    public String password;
    // save user data
    public Voter(String username, String Password) {
        super(username, Password);
    }
    //save vote
    public void castVote(Party vote) {
        this.vote = vote;
     //   vote.voters.add(this);
    }
    
}
