package org.acme;

import java.io.Serializable;

//

public class Person implements Serializable { //What does serializeable do?
    private String name;
    private String Country;

    public Person() {}  

    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }

    public String getCountry() { 
        return Country; 
    }
    public void setCountry(String Country) { 
        this.Country = Country; 
        
    }


}


