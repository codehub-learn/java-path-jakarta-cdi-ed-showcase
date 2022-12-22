package gr.codelearn.jakarta.ed.example.resources;

import gr.codelearn.jakarta.ed.example.service.ejbexample.ViewCounter;
import jakarta.ejb.EJB;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/stateful")
public class StatefullResource {
        
    @EJB(beanName = "ViewCounterStatefullBean")
    ViewCounter viewCounterStatefull;
    
    @GET
    @Produces("text/plain")
    @Path("/views")
    public String getTotalViews(){
        return viewCounterStatefull.getNumberOfViews().toString();
    }
    
    @GET
    @Produces("text/plain")
    @Path("/increment")
    public String increment(){
        viewCounterStatefull.incrementNumberOfViews();
        viewCounterStatefull.incrementNumberOfViews();
        return "Views icremented!";
    }
}
