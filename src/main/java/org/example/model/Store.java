package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[5];
        ProductForSale chocolate = new Chocolate("Dubai",300,"This chocolate has shredded wheat and pistachios");
        Coke coke = new Coke("Light",30,"This coke has a few sugar");
        ProductForSale bread = new Bread("Whole wheat",40,"This bread is very healty");
        products[0] = chocolate;
        products[1] = coke;
        products[2] = bread;

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products)
        {
            if(product != null)
            {
                product.showDetails();
            }
        }
    }
}