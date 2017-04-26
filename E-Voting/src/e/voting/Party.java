/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.voting;

import java.io.Serializable;
import java.util.ArrayList;


class Party{
    
    public String partyName;
    //voters arrylist  type  voters
    ArrayList<Voter> voters = new ArrayList<>();
    //Get total no of ucote casted
   
    public int getVoteCount() {
        return voters.size();
    }
    
}
