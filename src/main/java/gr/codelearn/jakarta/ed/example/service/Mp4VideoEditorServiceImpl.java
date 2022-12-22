package gr.codelearn.jakarta.ed.example.service;

import gr.codelearn.jakarta.ed.example.domain.Video;
import gr.codelearn.jakarta.ed.example.qualifier.MP4;
import gr.codelearn.jakarta.ed.example.qualifier.ViewLogInterceptor;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@MP4
public class Mp4VideoEditorServiceImpl implements VideoEditorService{
private Integer randomViews;
    @PostConstruct
    private void init(){
        randomViews = (int)(Math.random()*10000)+100;
        System.out.println("Class "+ getClass().getSimpleName() + " has been initialized");
    }

    @Override
    @ViewLogInterceptor
    public String edit(Video video) {
        System.out.println("Method edit was invoked.");
        video.setViews(randomViews);
        return "Editing MP4 video: " + video;
    }

    @Override
    public String save(Video video) {
        video.setName(video.getName().toUpperCase());
        return "Saving MP4 video: " + video;
    }  
}
