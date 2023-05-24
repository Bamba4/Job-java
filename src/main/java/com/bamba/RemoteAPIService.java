package com.bamba;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RemoteAPIService {

    private final RestTemplate restTemplate;

    public RemoteAPIService() {
        this.restTemplate = new RestTemplate();
    }

    public void callRemoteAPI() {
        String apiUrl = "https://test.ean.com/v3/properties/availability?currency=USD&country_code=US&sales_channel=agent_tool&sales_environment=hotel_package&rate_plan_count=1&language=fr-FR&checkin=2023-12-06&checkout=2023-12-08&partner_point_of_sale=B2B_CCC_BASE&payment_terms=BASE&occupancy=2&property_id=6309326";

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "EAN APIKey=dfe15p26cmkuoischkc0g91hc,Signature=ad374645cdd80b3ba5d5610a560dc3b3bb21bd640aeb90f5ff6be18543b91fc872d0c0b1863798fb41e72cd5d8557557e73f76e101d9b6f70e5f2c65b3ca43c3,timestamp=1684847010");
        // Ajoutez d'autres en-têtes si nécessaire

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.GET, entity, String.class);
        System.out.println(response.getBody());
    }
}
