package gr.codelearn.jakarta.ed.example.service.ejbexample;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.ConcurrencyManagement;
import jakarta.ejb.ConcurrencyManagementType;
import jakarta.ejb.Lock;
import jakarta.ejb.LockType;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;

@Singleton
@Startup
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
public class ViewCounterSingletonBean implements ViewCounter{
    
    private Integer numberOfViews;

    public ViewCounterSingletonBean() {
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
    @Lock(LockType.READ)
    public Integer getNumberOfViews() {
        return numberOfViews;
    }

    @Override
    @Lock(LockType.WRITE)
    public void incrementNumberOfViews() {
        numberOfViews++;
        System.out.println("Views | " + getClass().getSimpleName() + " | incremented to total of " + numberOfViews);
    }
}
