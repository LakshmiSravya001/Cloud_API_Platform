# Cloud API Platform
Simple Spring Boot cloud-ready REST API with Docker and CI/CD.# Cloud_API_Platform
# Cloud-Native API Platform

## 🚀 Overview
This project demonstrates a cloud-native REST API built with Spring Boot, Docker, and CI/CD pipelines.

## ⚙️ Tech Stack
- Java (Spring Boot)
- Docker
- AWS Ready
- GitHub Actions

## 🔥 Features
- REST API (CRUD)
- Dockerized deployment
- CI/CD automation

## ▶️ Run Locally
mvn spring-boot:run

## 🐳 Run with Docker
docker build -t cloud-api .
docker run -p 8080:8080 cloud-api

mvn clean package
java -jar target/cloud-api-0.0.1.jar

GET  http://localhost:8080/users
POST http://localhost:8080/users
