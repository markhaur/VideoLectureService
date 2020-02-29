package com.service.videolecture.apiclient;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.videolecture.utils.ResponseUtils;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.Request;

import java.io.IOException;

public class StudentApiClient {

    public boolean validateStudent(String emailId){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(String.format("http://localhost:8084/student/validate/%s", emailId))
                .get()
                .addHeader("content-type", "application/json")
                .addHeader("cache-control", "no-cache")
                .build();

        try {
            Response response = client.newCall(request).execute();
            String responseBody = response.body().string();
            ObjectMapper objectMapper = new ObjectMapper();
            com.service.videolecture.model.dto.Response apiResponse = objectMapper.readValue(responseBody, com.service.videolecture.model.dto.Response.class);
            if(apiResponse.getResponseCode() == ResponseUtils.SUCCESS_CODE)
                return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
