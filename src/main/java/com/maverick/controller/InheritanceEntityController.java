package com.maverick.controller;

import com.google.common.collect.MoreCollectors;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.maverick.domain.DataTransfer;
import com.maverick.repository.DataTransferRepository;
import com.maverick.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

@RestController
@RequestMapping("test")
public class InheritanceEntityController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Autowired
    private DataTransferRepository dataTransferRepository;

    @GetMapping
    public ResponseEntity test() {

        String response = restTemplateBuilder.build().getForObject("https://pricing.us-east-1.amazonaws.com/offers/v1.0/aws/AmazonRDS/current/index.json", String.class);
        Gson gson = new Gson();
        JsonObject root = gson.fromJson(response, JsonObject.class);
        JsonObject products = root.getAsJsonObject("products");

        Map<String, List<JsonObject>> map = products.entrySet()
                .stream()
                .collect(groupingBy(o -> o.getValue().getAsJsonObject().getAsJsonPrimitive("productFamily").getAsString(),
                        mapping(o -> {
                            JsonObject product = o.getValue().getAsJsonObject();
                            JsonObject attributes = product.getAsJsonObject("attributes");
                            attributes.addProperty("sku", product.getAsJsonPrimitive("sku").getAsString());
                            return attributes;
                        }, toList())));

        map.forEach((productFamily, jsonObjects) -> {
            if (productFamily.equals("Data Transfer")) {
                List<DataTransfer> datatransfers = jsonObjects.stream().map(jsonObject -> gson.fromJson(jsonObject, DataTransfer.class)).collect(toList());
                System.out.println(datatransfers);
                dataTransferRepository.save(datatransfers);

            }
        });

        return new ResponseEntity(HttpStatus.OK);
    }

}
