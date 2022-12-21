package gr.codelearn.jakarta.ed.example.resources;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;



@Path("example")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class JakartaExample {
    private List<String> names = new ArrayList<>();
    
    @GET
    public List<String> getNames(){
        return names;
    }
    
    @POST
    public Response createName(@QueryParam("name")String name){
        names.add(name);
        return Response
                .ok("Name " + name + " added!")
                .build();
    }
}
