//package com.laioffer.onlineorder.service;
//
//import com.stripe.Stripe;
//import com.stripe.exception.StripeException;
//import com.stripe.model.Charge;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Service
//public class StripeService {
//    @Value("${stripe.secretKey}")
//    private String secretKey;
//
//    public Charge createCharge(int amount, String currency, String token) throws StripeException {
//        Stripe.apiKey = secretKey;
//
//        Map<String, Object> params = new HashMap<>();
//        params.put("amount", amount);
//        params.put("currency", currency);
//        params.put("source", token);
//
//        return Charge.create(params);
//    }
//}
