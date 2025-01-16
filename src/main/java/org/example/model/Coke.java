package org.example.model;

public class Coke extends ProductForSale{

    private int liter;

    public Coke(String type, int price, String description)
    {
        super(type,price,description);
    }

    public Coke(String type, int price, String description, int liter)
    {
        super(type,price,description);
        this.liter = liter;
    }

    @Override
    public void showDetails()
    {
        StringBuilder str = new StringBuilder();
        str.append("Type: ").append(getType()).append(" ");
        str.append("Price: ").append(getPrice()).append(" ");
        str.append("Description: ").append(getDescription()).append(" ");
        if(liter > 0)
        {
            str.append("Liter: ").append(liter);
        }
        System.out.println(str);
    }
}
