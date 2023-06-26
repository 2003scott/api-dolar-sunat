package com.api.ApiDolar.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/DolarDia")
public class DiaDolar {

    /**
     * http://localhost:8090/api/DolarDia
     * @return
     */

    @GetMapping
    private String getDolarDia(){
        String url = "https://api.apis.net.pe/v1/tipo-cambio-sunat?fecha="+ LocalDate.now();
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url,String.class);
        return response;
    }
}
