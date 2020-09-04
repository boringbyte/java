package com.monotonic.collections._2_what_are_collections.before;

import com.monotonic.collections.common.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionConcepts
{
    public static void main(String[] args)
    {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
//        System.out.println(products);

        for (Product product : products) {
            if (product.getWeight() > 20) {
//                products.remove(product);   //  not possible with for each loop and remove at the same time
            }
            System.out.println(product);
        }

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getWeight() > 20) {
                iterator.remove();
            }
        }
        System.out.println(products);

        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(window));
        System.out.println(products.remove(window));
        System.out.println(products.contains(window));

        Collection<Product> toRemove = new ArrayList<>();
        toRemove.add(door);
        toRemove.add(floorPanel);
        products.removeAll(toRemove);
        System.out.println(products);
    }
}
