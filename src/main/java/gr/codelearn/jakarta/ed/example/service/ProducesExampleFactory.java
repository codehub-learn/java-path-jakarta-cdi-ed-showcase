package gr.codelearn.jakarta.ed.example.service;

import jakarta.enterprise.inject.Produces;
import java.io.Serializable;

public class ProducesExampleFactory implements Serializable{

    @Produces
    private String randomText = "Random text with value " + (int) (Math.random() * 1000) + 100;

}
