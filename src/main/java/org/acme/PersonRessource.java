package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/student")
public class PersonRessource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Person getOnePerson() {

        Person p = new Person();
        p.setCountry("Denmark");
        p.setName("Nicolai");

        return p;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response updatePerson(Person p) {
        //Its not like we can hit a db so we just modify the person here
        p.setName("New name");
        p.setCountry("new country");
    }
    
}
