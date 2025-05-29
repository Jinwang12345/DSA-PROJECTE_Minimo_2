package edu.upc.dsa.services;

import edu.upc.dsa.models.Issue;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/issue")
public class IssueService {

    private static List<Issue> dummyIssues = new ArrayList<>();

    static {
        dummyIssues.add(new Issue("2024-05-29", "Abuso", "Jugador insultando", "admin"));
        dummyIssues.add(new Issue("2024-05-30", "Cheats", "Jugador usando hacks", "moderador"));
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response reportIssue(Issue issue) {
        System.out.println("DENUNCIA RECIBIDA:");
        System.out.println("Fecha: " + issue.date);
        System.out.println("Título: " + issue.title);
        System.out.println("Mensaje: " + issue.message);
        System.out.println("Remitente: " + issue.sender);

        dummyIssues.add(issue);

        return Response.status(200).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Issue> getIssues() {
        return dummyIssues;
    }
}
