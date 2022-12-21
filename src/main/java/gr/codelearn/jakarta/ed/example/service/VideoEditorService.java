/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codelearn.jakarta.ed.example.service;

import gr.codelearn.jakarta.ed.example.domain.Video;

/**
 *
 * @author giannis
 */
public interface VideoEditorService {
    String edit(Video video);
    String save(Video video);
}
