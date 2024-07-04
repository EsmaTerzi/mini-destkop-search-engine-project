/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.search_engine;

/**
 *
 * @author nesma
 */
public class FileList {

    FileNode head;

    public FileList() {
        this.head = null;
    }

    public void addFile(String fileName) {
        if (head == null) {
            head = new FileNode(fileName);
            return;
        }

        FileNode current = head;
        while (current != null) {
            if (current.fileName.equals(fileName)) {
                current.incrementFrequency();
                return; // Dosya adı zaten listede var, frekansı arttır ve çık
            }
            if (current.next == null) {
                break; // Son düğüme ulaşıldı, döngüden çık
            }
            current = current.next;
        }

        // Son düğüme gelindi, yeni düğümü ekle
        current.next = new FileNode(fileName);
    }
}
