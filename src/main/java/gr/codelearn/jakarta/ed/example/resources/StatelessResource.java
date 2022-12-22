package gr.codelearn.jakarta.ed.example.resources;

import gr.codelearn.jakarta.ed.example.service.ejbexample.ViewCounter;
import jakarta.ejb.EJB;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;


@Path("/stateless")
public class StatelessResource {
    
    @EJB(beanName = "ViewCounterStatelessBean")
    ViewCounter viewCounterStateless;
    
    @GET
    @Produces("text/plain")
    @Path("/views")
    public String getTotalViews(){
        return viewCounterStateless.getNumberOfViews().toString();
    }
    
    @GET
    @Produces("text/plain")
    @Path("/increment")
    public String increment(){
        viewCounterStateless.incrementNumberOfViews();
        return "Views icremented!";
    }
}
