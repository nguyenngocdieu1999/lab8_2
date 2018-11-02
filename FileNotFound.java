/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexception;

import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author admin
 */
public class FileNotFound {
    public static void main(String[] args) throws FileNotFoundException{
        
        File file = new File("file.txt");
        
    }
}
