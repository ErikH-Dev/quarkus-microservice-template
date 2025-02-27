package controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/env")
public class EnvResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getEnv() {
        String dbUsername = System.getenv("DB_USERNAME");
        String dbPassword = System.getenv("DB_PASSWORD");
        String dbUrl = System.getenv("DB_URL");

        return "DB_USERNAME: " + dbUsername + "\n" +
               "DB_PASSWORD: " + dbPassword + "\n" +
               "DB_URL: " + dbUrl;
    }
}