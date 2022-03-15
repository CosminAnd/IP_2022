// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Product.java

import java.util.List;

public class Product
{

    public Product()
    {
    }

    public int getPrice()
    {
        return 0;
    }

    public String getDescription()
    {
        return null;
    }

    public String getType()
    {
        return null;
    }

    public String getName()
    {
        return null;
    }

    public boolean equals(Product product)
    {
        return false;
    }

    public int lastPrice()
    {
        return 0;
    }

    private String id;
    private String name;
    private int price;
    private String type;
    private String description;
    public List productsDatabase;
    public ProductsDatabase owned;
}
