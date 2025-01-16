package org.example.model;

public class Bread extends ProductForSale{

    private int weight;

    public Bread(String type, int price, String description)
    {
        super(type,price,description);
    }

    public Bread(String type, int price, String description, int weight)
    {
        super(type,price,description);
        this.weight = weight;
    }

    @Override
    public void showDetails()
    {
        StringBuilder str = new StringBuilder();
        str.append("Type: ").append(getType()).append(" ");
        str.append("Price: ").append(getPrice()).append(" ");
        str.append("Description: ").append(getDescription()).append(" ");
        if(weight > 0)
        {
            str.append("Weight: ").append(weight);
        }
        System.out.println(str);
    }
}
