package com.shubhamcodes.tci.models;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    String name;
    long amount;

    public Employee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Employee(String name, long amount) {
        this.name = name;
        this.amount = amount;
    }



}
