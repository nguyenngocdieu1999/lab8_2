/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexception;
import java.lang.ClassCastException;
/**
 *
 * @author admin
 */
public class ClassCast {
    public static void main(String[] args) throws ClassCastException {
        Object obj = new Integer(100);
        System.out.println((String) obj);
    }
}
