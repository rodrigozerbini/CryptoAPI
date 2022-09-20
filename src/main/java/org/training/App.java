package org.training;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONObject;

public class App {
    public static void main(String[] args) throws UnirestException {

        String query = "https://coinranking1.p.rapidapi.com/coin/Qwsogvtv82FCd/price?referenceCurrencyUuid=yhjMzLPhuIDl";
        APIConsumer consumer = new APIConsumer(query);
        HttpResponse<JsonNode> response = consumer.runQuery();

        int status = response.getStatus();
        System.out.println(status == 200 ? "Request succeeded" : "Error during request");
        System.out.println(String.format("Type of response: %s", response.getHeaders().get("Content-Type")));

//        //Prettifying
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        JsonElement je = JsonParser.parseString(response.getBody().toString());
//        String prettyJsonString = gson.toJson(je);
//        System.out.println(prettyJsonString);

        // Get the JSON object from response
        JSONObject myJson = response.getBody().getObject();
        String data = myJson.get("data").toString();
        System.out.println(myJson.get("data"));

        View myView = new View(data);
//
//        // Extract fields from the object
//        String msg = myJson.getString("status");
//        //System.out.println(msg);
    }
}