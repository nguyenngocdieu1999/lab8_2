/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexception;

import static testexception.ArrayIndexOfBound.nub;


/**
 *
 * @author admin
 */
public class ArrayIndexOfBound {
    public static int nub[] = new int[3];
    public static void getNub() throws ArrayIndexOutOfBoundsException{
        nub[5]=5;
    }
    public static void main(String[] args) {
        try{
            getNub();
            }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
         
    }
}
