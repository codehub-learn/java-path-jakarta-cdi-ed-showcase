package gr.codelearn.jakarta.ed.example.resources;

import gr.codelearn.jakarta.ed.example.service.ejbexample.ViewCounter;
import jakarta.ejb.EJB;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/singleton")
public class SingletonResource {
            
    @EJB(beanName = "ViewCounterSingletonBean")
    ViewCounter viewCounterSingleton;
    
    @GET
    @Produces("text/plain")
    @Path("/views")
    public String getTotalViews(){
        return viewCounterSingleton.getNumberOfViews().toString();
    }
    
    @GET
    @Produces("text/plain")
    @Path("/increment")
    public String increment(){
        viewCounterSingleton.incrementNumberOfViews();
        return "Views icremented!";
    }
}
