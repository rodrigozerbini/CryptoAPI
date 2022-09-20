package org.training;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class APIConsumer {

    String query;

    public APIConsumer(String query) {
        this.query = query;
    }

    public HttpResponse<JsonNode> runQuery() {

        APIDetails details = new APIDetails();
        HttpResponse<JsonNode> response;
        {
            try {
                response = Unirest.get(query)
                        .header("X-RapidAPI-Key", details.getKey())
                        .header("X-RapidAPI-Host", details.getHost())
                        .asJson();
                return response;
            } catch (
                    UnirestException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
