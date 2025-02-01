package com.exemplo.mundial.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

@Service
public class MundialService {

    @Autowired
    private WebClient webClient;

    public String getMundial1951Info() {

        try {

            Mono<String> reponse = webClient.get()
                    .uri("/1951--brazil/cup.txt")
                    .retrieve()
                    .bodyToMono(String.class);

            String data = reponse.block();

            if (data != null && data.contains("Palmeiras")) {
                return "Mundial de 1951 encontrado! Palmeiras tem mundial.";
            }

            return "Nada encontrado! Palmeiras não tem mundial xD!";
        } catch (WebClientResponseException ex) {
            return "Nada encontrado! Palmeiras não tem mundial xD!";
        }
    }

    public String getMundial2012Info() {
        try {
            Mono<String> response = webClient.get()
                    .uri("/2012--japan/cup.txt")
                    .retrieve()

                    .bodyToMono(String.class);

            String data = response.block();

            // Debug
            System.out.println("DEBUG: Dados retornados do endpoint: \n" + data);

            if (data != null && data.contains("Corinthians")) {
                return "Bahhh, Corinthians ganhou do Chelsea em 2012! 😂";
            }
            return "Nada encontrado no Mundial de 2012.";
        } catch (WebClientResponseException e) {
            return "Erro ao buscar dados do Mundial de 2012: " + e.getMessage();
        }
    }

}
