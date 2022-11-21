package com.shubhamcodes.tci.models;

public class Bonus {

    String empName;
    Long amount;
    String currency;
    String joiningDate;
    String exitDate;

    public Bonus(){

    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getExitDate() {
        return exitDate;
    }

    public void setExitDate(String exitDate) {
        this.exitDate = exitDate;
    }

    public Bonus(String empName, Long amount, String currency, String joiningDate, String exitDate) {
        this.empName = empName;
        this.amount = amount;
        this.currency = currency;
        this.joiningDate = joiningDate;
        this.exitDate = exitDate;
    }
}
