package com.groupeisi.m2gl.endpoint;

import com.groupeisi.m2gl.GetSoldeRequest;
import com.groupeisi.m2gl.SoldeResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BanqueEndpoint {

    private static final String NAMESPACE_URI = "http://www.groupeisi.com/banque";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSoldeRequest")
    @ResponsePayload
    public SoldeResponse getSolde(@RequestPayload GetSoldeRequest request) {
        SoldeResponse response = new SoldeResponse();
        // Ici la logique métier (exemple en dur)
        if (request.getTel() == 123L) {  // correspond au XSD
            response.setSolde(50000L);
        } else {
            response.setSolde(0L);
        }
        return response;
    }
}
