package com.Ansar.Functionality.BinaryTree_DSA;

import com.Ansar.CoreClass.Product;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree {
    private Node rootNode;
    private LinkedList<Product> productList=new LinkedList<>();
    //Constructor-------------------------------------------------------------------------------------------------------
    public BinaryTree()
    { this.rootNode = null; }
    //==================================================================================================================
    //TODO: Binary Search Tree methods----------------------------------------------------------------------------------
    public boolean insert(int ID,String title, int price, int delivery_Charges)
    {
        Product product = new Product(ID,title,price,delivery_Charges);
        productList.add(product);
        Node currentNode=new Node(product);
        if(rootNode==null)
        {
            rootNode=currentNode;
            return true;
        }
        Node targetingNode=rootNode;
        Node parentNode=null;
        while(true)
        {
            parentNode=targetingNode;
            if(product.getID()<targetingNode.product.getID())
            {
                targetingNode=targetingNode.moveToLeft();
                if(targetingNode==null)
                {
                    parentNode.setLeftLink(currentNode);
                    return true;
                }
            }
            else
            {
                targetingNode=targetingNode.moveToRight();
                if(targetingNode==null)
                {
                    parentNode.setRightLink(currentNode);
                    return true;
                }
            }
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public LinkedList<Product> InorderTraversal()
    {
        LinkedList<Product> productLinkedList=new LinkedList<>();
        Stack<Node> stack=new Stack<>();
        Node targetedNode=rootNode;
        while(!stack.empty() || targetedNode!=null)
        {
            if(targetedNode!=null)
            {
                stack.push(targetedNode);
                targetedNode=targetedNode.moveToLeft();
            }
            else
            {
                targetedNode=stack.pop();
                productLinkedList.add(targetedNode.product);
                targetedNode=targetedNode.moveToRight();
            }
        }
        return productLinkedList;
    }
    //------------------------------------------------------------------------------------------------------------------
    public Product contains(int data)
    {
        Node targetedNode=rootNode;
        while(targetedNode!=null)
        {
            if(data==targetedNode.product.getID())
            {
                return targetedNode.product;
            }
            else if(data<targetedNode.product.getID())
            {
                targetedNode=targetedNode.moveToLeft();
            }
            else
            {
                targetedNode=targetedNode.moveToRight();
            }
        }
        return null;
    }
    //------------------------------------------------------------------------------------------------------------------
        /**
     * This will write Product's all data into the product's Dataset file everytime when a product is
     * add into (type)Product List. This is a global product List it will contain every product
     * @throws IOException
     */
    public void writeProducts() throws IOException, IOException {
        FileWriter writeNewProducts=new FileWriter("rec\\products.csv");
        for (int count = 0; count < productList.size(); count++)
        {
            writeNewProducts.write(productList.get(count).getID()+","+ productList.get(count).getTitle()+","+
                    productList.get(count).getPrice()+","+productList.get(count).getDelivery_Charges()+"\n");
        }
        writeNewProducts.close();
    }
}
