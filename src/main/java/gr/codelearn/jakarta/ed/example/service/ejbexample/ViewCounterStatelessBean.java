package gr.codelearn.jakarta.ed.example.service.ejbexample;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.Stateless;

@Stateless
public class ViewCounterStatelessBean implements ViewCounter {

    private Integer numberOfViews;

    public ViewCounterStatelessBean() {
        numberOfViews = 0;
    }

    @PostConstruct
    private void init() {
        System.out.println("Created class " + getClass().getSimpleName());
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Destroyed class " + getClass().getSimpleName());
    }

    @Override
    public Integer getNumberOfViews() {
        return numberOfViews;
    }

    @Override
    public void incrementNumberOfViews() {
        numberOfViews++;
        System.out.println("Views | " + getClass().getSimpleName() + " | incremented to total of " + numberOfViews);
    }

}
