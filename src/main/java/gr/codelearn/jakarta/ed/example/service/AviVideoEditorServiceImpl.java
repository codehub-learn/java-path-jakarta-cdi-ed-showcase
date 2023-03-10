package gr.codelearn.jakarta.ed.example.service;

import gr.codelearn.jakarta.ed.example.domain.Video;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
//One instance
@ApplicationScoped
//One instance per browse
//@SessionScoped
//Different instance for each request
//@RequestScoped
public class AviVideoEditorServiceImpl implements VideoEditorService,Serializable{
    private Integer randomViews;
    
    @PostConstruct
    private void init(){
        randomViews = (int)(Math.random()*10000)+100;
        System.out.println("Class "+ getClass().getSimpleName() + " has been initialized");
    }
    
    @PreDestroy
    private void destroy(){
        System.out.println("Class "+ getClass().getSimpleName() + " is being destroyed");
    }

    @Override
    public String edit(Video video) {
        video.setViews(randomViews);
        return "Editing Avi video: " + video;
    }

    @Override
    public String save(Video video) {
        video.setName(video.getName().toUpperCase());
        return "Saving Avi video: " + video;
    }
    
}
