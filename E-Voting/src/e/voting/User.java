/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.voting;

import java.io.Serializable;


abstract class User {
    
    public String username;
    public String password;
    
    public User(String username, String Password) {
        this.username = username;
        this.password = Password;
    }
    
}
