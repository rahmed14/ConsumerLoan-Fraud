package com.example.dto;


public class FraudRequest {

    private String email;
    private String mobilePhone;
    private String state;
    private String bankWatchIndicator;
    private String lengthOfEmployment;
    private Double requestedAmount;

    public FraudRequest() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBankWatchIndicator() {
        return bankWatchIndicator;
    }

    public void setBankWatchIndicator(String bankWatchIndicator) {
        this.bankWatchIndicator = bankWatchIndicator;
    }

    public String getLengthOfEmployment() {
        return lengthOfEmployment;
    }

    public void setLengthOfEmployment(String lengthOfEmployment) {
        this.lengthOfEmployment = lengthOfEmployment;
    }

    public Double getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(Double requestedAmount) {
        this.requestedAmount = requestedAmount;
    }
}