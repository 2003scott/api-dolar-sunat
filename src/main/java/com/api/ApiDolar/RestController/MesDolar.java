package com.api.ApiDolar.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/DolarMes")
public class MesDolar {

    /**
     * http://localhost:8090/api/DolarMes
     * @return
     */
    @GetMapping
    private String getDolarMes(){
        String url = "https://api.apis.net.pe/v1/tipo-cambio-sunat?year="+ LocalDate. now().getYear()+"&month="+LocalDate. now().getMonthValue();
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url,String.class);
        return response;
    }
}
