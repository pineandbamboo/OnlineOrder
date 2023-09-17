//package com.laioffer.onlineorder.controller;
//
//import com.laioffer.onlineorder.service.StripeService;
//import com.stripe.exception.StripeException;
//import com.stripe.model.Charge;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/payment")
//public class PaymentController {
//    @Autowired
//    private StripeService stripeService;
//
//    @PostMapping("/charge")
//    public ResponseEntity<String> charge(@RequestParam int amount, @RequestParam String currency, @RequestParam String token) {
//        try {
//            Charge charge = stripeService.createCharge(amount, currency, token);
//            return ResponseEntity.ok("Payment successful. Charge ID: " + charge.getId());
//        } catch (StripeException e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Payment failed: " + e.getMessage());
//        }
//    }
//}
