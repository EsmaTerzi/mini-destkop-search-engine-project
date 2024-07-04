/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.search_engine;

/**
 *
 * @author nesma
 */
public class Node {
    
    String word;
    FileList fileOccurrences; // Dosya adları ve sıklıklarının listesi
    Node left;
    Node right;
    int frequency;

    public Node(String word, String fileName) {
        this.word = word;
        this.fileOccurrences = new FileList();
        this.fileOccurrences.addFile(fileName); 
        this.left = this.right = null;
        this.frequency = 1;
    }
}
