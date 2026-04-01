package com.example.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.dto.FraudRequest;
import com.example.dto.FraudResponse;
import com.example.service.FraudService;

import javax.validation.Valid;

@RestController
@RequestMapping("/fraud")
public class FraudController {

    private final FraudService fraudService;

    public FraudController(FraudService fraudService) {
        this.fraudService = fraudService;
    }

    @PostMapping("/check")
    public ResponseEntity<FraudResponse> checkFraud(@Valid @RequestBody FraudRequest request) {
        FraudResponse response = fraudService.runFraudCheck(request);
        return ResponseEntity.ok(response);
    }
}
