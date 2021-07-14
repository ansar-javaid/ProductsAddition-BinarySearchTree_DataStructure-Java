//package com.Ansar.Functionality.MainFunctionality;
//
//import com.Ansar.CoreClass.Product;
//import com.Ansar.Functionality.LoadData.LoadData;
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class CoreMethods {
//    private LoadData loadData=new LoadData();
//    //TODO: Core Methods------------------------------------------------------------------------------------------------
//    /**
//     * Shows all the products with whole Description
//     */
//    public void ShowProducts()
//    {
//        for(int count=0;count<loadData.list.Size();count++)
//        {
//            System.out.println("Product ID:"+loadData.list.get(count).getID()+" Product Title"+loadData.list.get(count).getTitle()
//            +" Price:"+loadData.list.get(count).getPrice()+" Delivery Charges:"+loadData.list.get(count).getDelivery_Charges());
//        }
//    }
//    //==================================================================================================================
//    /**
//     * @param productID Accepts Product ID: Integer and Prints that product's detail
//     */
//    public void SearchProduct(int productID)
//    {
//        for(int count=0;count<loadData.list.Size();count++)
//        {
//            if(productID==loadData.list.get(count).getID())
//            System.out.println("Product ID:"+loadData.list.get(count).getID()+"\nTitle:"+loadData.list.get(count).getTitle()
//                    +" Price:"+loadData.list.get(count).getPrice()+" Delivery Charges:"+loadData.list.get(count).getDelivery_Charges());
//        }
//    }
//    //==================================================================================================================
//    /**
//     * @param ID
//     * @param Title
//     * @param Price
//     * @param Delivery_Charges
//     * Accepts these parametes and adds them into the Doubly-Linked List
//     */
//    public void addProduct(int ID,String Title,int Price,int Delivery_Charges)
//    {
//        loadData.list.add(new Product(ID,Title,Price,Delivery_Charges));
//        try { writeProducts(); } catch (IOException e) { e.printStackTrace(); }
//
//    }
//    //==================================================================================================================
//    /**
//     * Finds the Minimum Price in all Products List
//     */
//    public void minimumProductPrice()
//    {
//        int benchMark=Integer.MAX_VALUE;
//        for(int count=0;count<loadData.list.Size();count++)
//        {
//            if(benchMark>loadData.list.get(count).getPrice())
//            {
//                benchMark=loadData.list.get(count).getPrice();
//            }
//        }
//        System.out.println(benchMark);
//    }
//    //==================================================================================================================
//    /**
//     * Finds the Minimum Delivery Price in all Products List
//     */
//    public void minimumDeliveryPrice()
//    {
//        int benchMark=Integer.MAX_VALUE;
//        for(int count=0;count<loadData.list.Size();count++)
//        {
//            if(benchMark>loadData.list.get(count).getDelivery_Charges())
//            {
//                benchMark=loadData.list.get(count).getDelivery_Charges();
//            }
//        }
//        System.out.println(benchMark);
//    }
//    //==================================================================================================================
//
//    /**
//     * This will write Product's all data into the product's Dataset file everytime when a product is
//     * add into (type)Product List. This is a global product List it will contain every product
//     * @throws IOException
//     */
//    private void writeProducts() throws IOException {
//        FileWriter writeNewProducts=new FileWriter("rec\\products.csv");
//        for (int count = 0; count < loadData.list.Size(); count++)
//        {
//            writeNewProducts.write(loadData.list.get(count).getID()+","+ loadData.list.get(count).getTitle()+","+
//                    loadData.list.get(count).getPrice()+","+loadData.list.get(count).getDelivery_Charges()+"\n");
//        }
//        writeNewProducts.close();
//    }
//}
