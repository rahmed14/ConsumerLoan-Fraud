package com.example.dto;


public class FraudDecisionResult {

    private Integer pidScore;
    private Integer sidScore;
    private Boolean identityMismatchFlag;
    private Integer deviceRiskScore;
    private Boolean sentilinkFlag;
    private String result; // PASS / REVIEW / FAIL

    public FraudDecisionResult() {
    }

    public Integer getPidScore() {
        return pidScore;
    }

    public void setPidScore(Integer pidScore) {
        this.pidScore = pidScore;
    }

    public Integer getSidScore() {
        return sidScore;
    }

    public void setSidScore(Integer sidScore) {
        this.sidScore = sidScore;
    }

    public Boolean getIdentityMismatchFlag() {
        return identityMismatchFlag;
    }

    public void setIdentityMismatchFlag(Boolean identityMismatchFlag) {
        this.identityMismatchFlag = identityMismatchFlag;
    }

    public Integer getDeviceRiskScore() {
        return deviceRiskScore;
    }

    public void setDeviceRiskScore(Integer deviceRiskScore) {
        this.deviceRiskScore = deviceRiskScore;
    }

    public Boolean getSentilinkFlag() {
        return sentilinkFlag;
    }

    public void setSentilinkFlag(Boolean sentilinkFlag) {
        this.sentilinkFlag = sentilinkFlag;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}