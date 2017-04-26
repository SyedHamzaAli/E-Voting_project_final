/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.voting;

import java.io.Serializable;
import java.util.ArrayList;


class Parties {
    public String site;
    public ArrayList<Party> parties = new ArrayList<>();

    public Parties(String site) {
        this.site = site;
    }

    public void addParty(Party party) {
        parties.add(party);
    }
    
}
