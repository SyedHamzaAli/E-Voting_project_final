/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.voting;

import java.io.Serializable;
import java.util.ArrayList;

class Accounts {
    
    public ArrayList<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public User getUser(String username) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).username.equals(username)) {
                return users.get(i);
            }
        }
        return null;
    }

    public User getUser(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).username.equals(user.username)) {
                return users.get(i);
            }
        }
        return null;
    }
    
}
