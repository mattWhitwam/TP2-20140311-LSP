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
public class Citizen extends Human {
    private String name;
    private String country;
    private String id;

    public Citizen() {
        Random r = new Random();
        String[] names;
        if (this.getSex() == 'M') {
            names = new String[] {"Matt", "Ian", "Peter"};
        }
        else {
            names = new String[] {"Bid", "Connie", "Claire"};
        }
        
        name = names[r.nextInt(names.length)];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
