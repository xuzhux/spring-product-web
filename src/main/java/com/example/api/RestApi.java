package com.example.api;


import com.example.model.Response;
import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestApi {
    @RequestMapping("/test/1")
    public void rest(){
        String url = "http://l27.0.0.1:8080";
        RestTemplate rt = new RestTemplate();
        String body = rt.getForObject(url+"/soa/product/1",String.class);
        System.out.println(body);
        Response rsp = new Gson().fromJson(body,Response.class);
        System.out.println(rsp);
    }
}
