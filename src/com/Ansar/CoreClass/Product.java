package com.Ansar.CoreClass;

public class Product {
    private String Title;
    private int ID,Price,Delivery_Charges;
    //Constructor-------------------------------------------------------------------------------------------------------

    public Product(int ID,String title, int price, int delivery_Charges) {
        this.Title = title;
        this.ID = ID;
        this.Price = price;
        this.Delivery_Charges = delivery_Charges;
    }
    //Getter & Setter---------------------------------------------------------------------------------------------------
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getPrice() {
        return Price;
    }
    public void setPrice(int price) {
        Price = price;
    }
    public int getDelivery_Charges() {
        return Delivery_Charges;
    }
    public void setDelivery_Charges(int delivery_Charges) {
        Delivery_Charges = delivery_Charges;
    }
    //==================================================================================================================
}
