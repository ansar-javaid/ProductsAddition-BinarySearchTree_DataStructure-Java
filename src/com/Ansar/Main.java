package com.Ansar;

import com.Ansar.Functionality.LoadData.LoadData;
import com.sun.source.tree.BinaryTree;


import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        LoadData loadData=new LoadData();
        loadData.binaryTree.InorderTraversal();

//        CoreMethods methods=new CoreMethods();
//        byte choice;
//        boolean flag=true;
//        while(flag)
//        {
//            System.out.println("1. Show products (In order traversal)\n" +
//                    "2. Add product\n" +
//                    "3. search product\n" +
//                    "4. search product with minimum price\n" +
//                    "5. search product with minimum delivery price\n" +
//                    "6. exit");
//            choice=input.nextByte();
//            if(choice==1)
//            {
//                methods.ShowProducts();
//            }
//            else if(choice==2)
//            {
//                System.out.println("-------------------------------------------------");
//                System.out.println("Enter Product ID:");
//                int ID=input.nextInt();
//                String temp=input.nextLine();
//                System.out.println("Enter Title:");
//                String Title=input.nextLine();
//                System.out.println("Enter Price:");
//                int Price=input.nextInt();
//                System.out.println("Enter Delivery Charges:");
//                int Delivery=input.nextInt();
//                methods.addProduct(ID,Title,Price,Delivery);
//                System.out.println("--------------------------------------------------");
//            }
//            else if(choice==3)
//            {
//                System.out.println("-------------------------------------------------");
//                System.out.println("Enter Product ID to Search");
//                int ID=input.nextInt();
//                methods.SearchProduct(ID);
//            }
//            else if(choice==4)
//            {
//                methods.minimumProductPrice();
//            }
//            else if(choice==5)
//            {
//                methods.minimumDeliveryPrice();
//            }
//            else if(choice==6)
//                System.exit(0);
//        }
    }//-----------------------------------------------------------------------------------------------------------------
}//=====================================================================================================================
