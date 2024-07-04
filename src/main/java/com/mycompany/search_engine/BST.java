/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.search_engine;

/**
 *
 * @author nesma
 */
public class BST {

    Node root;

    public BST() {
        root = null;
    }

    public void insert(String word, String fileName) {
        root = insertRec(root, word, fileName);
    }

    private Node insertRec(Node root, String word, String fileName) {
        // Eğer kök null ise, yeni bir düğüm oluşturulur ve kök olarak atanır
        if (root == null) {
            root = new Node(word, fileName);
            return root;
        }

        // Eklenen kelimenin kök ile karşılaştırılması
        int compareResult = word.compareTo(root.word);

        // Kelime, kökten küçükse sol alt ağaca eklenir
        if (compareResult < 0) {
            root.left = insertRec(root.left, word, fileName);
        } // Kelime, kökten büyükse sağ alt ağaca eklenir
        else if (compareResult > 0) {
            root.right = insertRec(root.right, word, fileName);
        } // Eğer kelime kök ile aynıysa, kökün sıklığı arttırılır
        // Ve dosya adı, düğümde bulunmuyorsa dosya adı listesine eklenir
        else {
            root.frequency++;
            if (!root.fileOccurrences.toString().contains(fileName)) {
                root.fileOccurrences.addFile(fileName);
            }
        }

        return root;
    }

    // BST sınıfının içinde kelime aramak için kullanılan metot.
    public Node search(String word) {
        return search(root, word);
    }

    // Yardımcı metot, özyinelemeli olarak çağrılır.
    // Kelime arama işlemini gerçekleştirir.
    private Node search(Node root, String word) {
        // Eğer kök null ise veya kökün kelimesi aranan kelimeye eşitse, kökü döndürür.
        if (root == null || root.word.equals(word)) {
            return root;
        }

        // Aranan kelime, kökün kelimesinden küçükse, sol alt ağaca git.
        if (word.compareTo(root.word) < 0) {
            return search(root.left, word);
        }

        // Aranan kelime, kökün kelimesinden büyükse, sağ alt ağaca git.
        return search(root.right, word);
    }

}
