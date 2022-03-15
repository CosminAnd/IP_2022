// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Customer.java

import java.util.List;

public class Customer
{

    public Customer()
    {
    }

    public void Customer(String s, String s1)
    {
    }

    public Product getProductWithName(String name)
    {
        return null;
    }

    public Basket getBasketWithIndex(int index)
    {
        return null;
    }

    public void addBasket(Basket basket1)
    {
    }

    public void removeBasket(int i)
    {
    }

    public int comparePrices(Product product1, Product product2)
    {
        return 0;
    }

    public boolean setPayment(int basketIndex)
    {
        return false;
    }

    public boolean setEmail(String email)
    {
        return false;
    }

    private String name;
    private String emailAdress;
    private Basket baskets;
    private String password;
    public List basket;
    public List owns;
}
