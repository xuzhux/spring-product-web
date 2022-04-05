package com.example.web;

import com.example.model.Response;
import com.google.gson.Gson;
import org.springframework.web.client.RestTemplate;

public class App {
    static  String url = "http://127.0.0.1:8080";
    public static void main(String[] args) {

        RestTemplate rt = new RestTemplate();
        String body = rt.getForObject(url+"/soa/product/1",String.class);
        System.out.println(body);
        Response rsp = new Gson().fromJson(body,Response.class);
        System.out.println(rsp);
    }

}
