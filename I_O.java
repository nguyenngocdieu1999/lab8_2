/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexception;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class I_O {
    public static void main(String[] args) throws IOException
    {
            FileReader fd = new FileReader("file.txt");
            fd.close();
    }
}

