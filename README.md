# 🌍 Mundial API ⚽

API REST em **Java 17 + Spring Boot** para descobrir se o **Palmeiras tem Mundial!** 😆🏆

## 🔥 Tecnologias utilizadas
- Java 17
- Spring Boot 3.4.1
- WebClient (Spring WebFlux)
- OpenFootball API

## 📌 Funcionalidades
✅ Buscar informações sobre o **Mundial de Clubes de 1951**  
✅ Caso não exista, exibir uma mensagem personalizada  
✅ Buscar informações do Mundial de **2012** e exibir o campeão

## 🚀 Como rodar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/ramirovictor/mundial-api.git
   cd mundial-api
2. Compile e rode o projeto:
      ```bash
   mvn clean install
   mvn spring-boot:run

3. Acesse os endpoints:
   ```bash
   GET http://localhost:8080/palmeiras/mundial
   GET http://localhost:8080/palmeiras/mundial2012


