package com.company.NestedClass;

import java.util.ArrayList;

public class Invoice {
     static class Item { // Класс Item вложен в класс Invoice
        private String description;
        private int quantity;
        private  double unitPrice;


        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }
        public double price() { return quantity * unitPrice; }

    }

    private ArrayList<Item> items = new ArrayList() ;

    public void addItem(Item item) {
        items.add(item);
    }



    }

