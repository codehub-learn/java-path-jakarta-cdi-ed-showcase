/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codelearn.jakarta.ed.example.domain;

public class Video {
    private String name;
    private Integer year;
    private Integer views;

    public Video(String name, Integer year, Integer views) {
        this.name = name;
        this.year = year;
        this.views = views;
    }

    public Video() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    @Override
    public String toString() {
        return "Video{" + "name=" + name + ", year=" + year + ", views=" + views + '}';
    }
    
}
