/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexception;
import java.lang.NullPointerException;
/**
 *
 * @author admin
 */
public class NullPointer {

    /**
     * @param args
     */
     public static void main(String[] args) throws NullPointerException {
        String name=null;
        name.equals("abc");
    }
}
