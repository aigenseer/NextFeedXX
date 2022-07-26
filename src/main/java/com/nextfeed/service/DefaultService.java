package com.nextfeed.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public abstract class DefaultService<T> {

    private int port = 8000;

    DefaultService(int port){
        this.port = port;
    }

    private String createUrl(String path){
        return String.format("http://localhost:%d%s", port, path);
    }

    protected T get(Class<T> c, String path){
        ResponseEntity<T> responseEntity = new RestTemplate().getForEntity(createUrl(path), c);
        return responseEntity.getBody();
    }

    protected T post(Class<T> c, String path, Map<String, Object> data){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<>(data.toString(), headers);
        ResponseEntity<T> responseEntity = new RestTemplate().postForEntity(createUrl(path), request, c);
        return responseEntity.getBody();
    }

}
