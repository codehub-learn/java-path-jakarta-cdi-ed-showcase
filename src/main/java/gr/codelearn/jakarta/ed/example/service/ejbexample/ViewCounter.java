package gr.codelearn.jakarta.ed.example.service.ejbexample;

import jakarta.ejb.Remote;


@Remote
public interface ViewCounter {
    Integer getNumberOfViews();
    void incrementNumberOfViews();
}
