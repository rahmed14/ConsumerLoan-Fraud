package com.example.service;



import org.springframework.stereotype.Service;

import com.example.dto.FraudRequest;
import com.example.dto.FraudResponse;

@Service
public class FraudService {

    public FraudResponse runFraudCheck(FraudRequest request) {
        FraudResponse response = new FraudResponse();

        int pidScore = calculatePidScore(request);
        int sidScore = calculateSidScore(request);
        boolean identityMismatch = calculateIdentityMismatch(request);
        int deviceRiskScore = calculateDeviceRiskScore(request);

        response.setPidScore(pidScore);
        response.setSidScore(sidScore);
        response.setIdentityMismatchFlag(identityMismatch);
        response.setDeviceRiskScore(deviceRiskScore);
        response.setSentilinkFlag(pidScore > 650 || sidScore > 650);

        if (pidScore > 700 || sidScore > 700) {
            response.setResult("FAIL");
        } else if (identityMismatch || pidScore >= 400 || sidScore >= 400) {
            response.setResult("REVIEW");
        } else {
            response.setResult("PASS");
        }

        return response;
    }

    private int calculatePidScore(FraudRequest request) {
        int score = 150;

        if (request.getRequestedAmount() != null && request.getRequestedAmount() > 25000) {
            score += 250;
        }

        if (request.getEmail() != null && request.getEmail().contains("test")) {
            score += 200;
        }

        if ("LESS_THAN_6_MONTHS".equalsIgnoreCase(request.getLengthOfEmployment())) {
            score += 150;
        }

        return score;
    }

    private int calculateSidScore(FraudRequest request) {
        int score = 120;

        if (request.getRequestedAmount() != null && request.getRequestedAmount() > 30000) {
            score += 300;
        }

        if (request.getMobilePhone() == null || request.getMobilePhone().isEmpty()) {
            score += 150;
        }

        if (request.getEmail() != null && request.getEmail().endsWith("@mailinator.com")) {
            score += 250;
        }

        return score;
    }

    private boolean calculateIdentityMismatch(FraudRequest request) {
        return request.getState() == null || request.getState().trim().isEmpty();
    }

    private int calculateDeviceRiskScore(FraudRequest request) {
        int score = 100;

        if ("Y".equalsIgnoreCase(request.getBankWatchIndicator())) {
            score += 200;
        }

        return score;
    }
}