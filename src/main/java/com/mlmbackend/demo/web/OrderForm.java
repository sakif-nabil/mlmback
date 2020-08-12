package com.mlmbackend.demo.web;

import com.mlmbackend.demo.entities.Client;

import java.util.ArrayList;
import java.util.List;

public class OrderForm {

    private Client client=new Client();
    private List<OrderProduct> products= new ArrayList<>();


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderProduct> getProducts() {
        return products;
    }

    public void setProducts(List<OrderProduct> products) {
        this.products = products;
    }
}


class OrderProduct{
    private Long id;
    private int quantity;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
