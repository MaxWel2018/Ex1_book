package com.company.NestedClass;




public class Main {

    public static void main(String[] args) {
        Invoice.Item item = new Invoice.Item("hello",522,522);
        Invoice invoice = new Invoice();
        invoice.addItem(item);


    }
}
