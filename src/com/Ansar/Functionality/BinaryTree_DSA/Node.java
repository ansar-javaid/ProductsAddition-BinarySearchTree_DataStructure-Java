package com.Ansar.Functionality.BinaryTree_DSA;

import com.Ansar.CoreClass.Product;

public class Node {
    public Product product;
    private Node leftLink;
    private Node rightLink;
    //Constructor-------------------------------------------------------------------------------------------------------
    protected Node(Product product) {
        this.leftLink = this.rightLink = null;
        this.product=product;
    }
    //Getters-----------------------------------------------------------------------------------------------------------
    /**
     * @return the Left Link of Node using in Binary Tree: Data Structure
     */
    public Node moveToLeft() { return leftLink; }
    /**
     * @return the Right Link of Node using in Binary Tree: Data Structure
     */
    public Node moveToRight() { return rightLink; }
    //Setters-----------------------------------------------------------------------------------------------------------
    public void setLeftLink(Node leftLink) { this.leftLink = leftLink; }
    public void setRightLink(Node rightLink) { this.rightLink = rightLink; }
    //==================================================================================================================
}
