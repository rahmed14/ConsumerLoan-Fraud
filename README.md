

# 3️⃣ README — `Consumerloan-Fraud`
# Tech Stack
•	Java 8 
•	Spring Boot 
•	Spring Web 
•	Maven 
•	REST APIs 
•	Docker 
•	AWS EC2 
•	JUnit 
•	GitLab CI/CD 
 
# Features
•	Mock fraud API 
•	Generate PID and SID scores 
•	Identity mismatch flag simulation 
•	Device risk score simulation 
•	Fraud result output: 
o	PASS 
o	REVIEW 
o	FAIL 
•	Docker-ready deployment 
•	Microservice architecture friendly 
 
# API Endpoints
Fraud Check
POST /fraud/check
 
# How to Run Locally
1. Clone the repository
git clone <your-github-link>
cd Consumerloan-Fraud
2. Update application.properties
Example:
server.port=9094
server.servlet.context-path=/fraud
spring.application.name=ConsumerLoan-Fraud
3. Build the project
mvn clean install
4. Run the application
mvn spring-boot:run
Or run from your IDE.
5. Test in Postman
POST http://localhost:9094/fraud/check
 
# Example Fraud Signals
This service may simulate logic based on:
•	suspicious email domains 
•	missing applicant information 
•	high requested amount 
•	identity mismatch conditions 
•	mock device risk patterns 
 
# Future Enhancements
•	Add Sentilink-style mock attributes 
•	Add more fraud rules 
•	Add fraud snapshot persistence 
•	Add unit tests 
•	Add integration with Docker Compose deployment



## `README.md`

```md
# ConsumerLoan Fraud Service

## Overview
ConsumerLoan Fraud Service is a mock fraud microservice that simulates identity and fraud screening in a consumer lending workflow.

This service is designed to generate fraud-related outputs such as:
- PID score
- SID score
- identity mismatch flag
- device risk score
- fraud decision result

It integrates with the main ConsumerLoans backend service and helps simulate real-world lending fraud checks.

---

## What It Does

This service evaluates a fraud request payload and returns a simplified fraud response.

It simulates fraud decisioning using mock rules and signals such as:
- suspicious email patterns
- identity mismatch conditions
- device or risk indicators
- fraud score thresholds

This project represents a simplified version of a fraud / identity screening microservice in a loan origination system.

---

## Architecture Diagram

```text
ConsumerLoans Main Service
        |
        v
Fraud Service
        |
        v
Mock Fraud Decision Response
Internal Flow
Fraud Request Received
        |
        v
Generate Fraud Scores / Flags
        |
        v
Apply Fraud Rules
        |
        v
Return PASS / REVIEW / FAIL
 
++++++++++++++++++

# Internal Flow
Fraud Request Received
        |
        v
Generate Fraud Scores / Flags
        |
        v
Apply Fraud Rules
        |
        v
Return PASS / REVIEW / FAIL
