package com.Ansar.Functionality.LoadData;

import com.Ansar.CoreClass.Product;
import com.Ansar.Functionality.BinaryTree_DSA.BinaryTree;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoadData {
    public BinaryTree binaryTree=new BinaryTree();
    //==================================================================================================================
    public LoadData() {
        try { loadProducts(); } catch (IOException e) { e.printStackTrace(); }
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * @throws IOException Reads the Data from CSV File and add that into Doubly-Linked list.
     */
    public void loadProducts() throws IOException {
        FileReader readProducts=new FileReader("rec\\products.csv");
        BufferedReader bufferProducts = new BufferedReader(readProducts);
        String line = "";
        while ((line = bufferProducts.readLine()) != null) {
            String[] separationCsvByColumn = line.split(",");
            binaryTree.insert(Integer.parseInt(separationCsvByColumn[0]),separationCsvByColumn[1],Integer.parseInt(separationCsvByColumn[2]),Integer.parseInt(separationCsvByColumn[3]));
        }
        readProducts.close();
    }
    //==================================================================================================================
}