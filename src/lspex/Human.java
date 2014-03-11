/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lspex;

import java.util.Random;

/**
 *
 * @author Matt Whitwam
 */
public class Human {
    private int age = 0;
    private char sex = 'M';

    public Human() {
        Random r = new Random();
        age = r.nextInt(99);
        int s = r.nextInt(2);
        
        if (s == 1) {
            sex = 'F';
        }
    }
    
    public void growOlder() {
        age++;
    }
    
    public int getAge() {
        return age;
    }
    
    public char getSex() {
        return sex;
    }
}
