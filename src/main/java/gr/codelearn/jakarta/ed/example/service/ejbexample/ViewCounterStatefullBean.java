package gr.codelearn.jakarta.ed.example.service.ejbexample;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.PostActivate;
import jakarta.ejb.PrePassivate;
import jakarta.ejb.Remove;
import jakarta.ejb.Stateful;


@Stateful
public class ViewCounterStatefullBean implements ViewCounter{
    
    private Integer numberOfViews;

    public ViewCounterStatefullBean() {
        numberOfViews = 0;
    }

    @PostConstruct
    private void init() {
        System.out.println("Created class " + getClass().getSimpleName());
    }
    
    @PostActivate
    private void postActivate() {
        System.out.println("Post activate class " + getClass().getSimpleName());
    }
    
    @PrePassivate
    private void prePassivate() {
        System.out.println("Pre passivate class " + getClass().getSimpleName());
    }


    @Override
    public Integer getNumberOfViews() {
        return numberOfViews;
    }

    @Override
//    @Remove
    public void incrementNumberOfViews() {
        numberOfViews++;
        System.out.println("Views | " + getClass().getSimpleName() + " | incremented to total of " + numberOfViews);
    }
}
