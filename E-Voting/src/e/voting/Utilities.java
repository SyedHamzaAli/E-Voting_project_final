/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.voting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Utilities{
    
    static Scanner xyz = new Scanner(System.in);

    public static void Serialize(EVote system,String file) throws IOException {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        try {
            fout = new FileOutputStream(file);
            oos = new ObjectOutputStream(fout);
            oos.writeObject(system);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (oos != null) {
                oos.close();
            }
        }
    }

    public static EVote Deserialize(String file) throws IOException {
        ObjectInputStream objectinputstream = null;
        if(new File(file).exists())
        try {
            FileInputStream streamIn = new FileInputStream(file);
            objectinputstream = new ObjectInputStream(streamIn);
            EVote readCase = (EVote) objectinputstream.readObject();
            return readCase;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (objectinputstream != null) {
                objectinputstream.close();
            }
        }
        return null;
    }

    public static String getString() {
        return xyz.next();
    }

    public static int getInteger() {
        return xyz.nextInt();
    }
    
}
