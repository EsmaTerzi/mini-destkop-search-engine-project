/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.search_engine;

/**
 *
 * @author nesma
 */
public class FileNode {
     
    String fileName;
    int wordFrequency;
    FileNode next;

    public FileNode(String fileName) {
        this.fileName = fileName;
        this.wordFrequency = 1;
        this.next=null;
    }

    public void incrementFrequency() {
        this.wordFrequency++;
    }
}
