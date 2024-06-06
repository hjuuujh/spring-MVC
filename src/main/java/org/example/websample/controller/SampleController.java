package org.example.websample.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class SampleController {

    //    @RequestMapping(value = "/order/1", method = RequestMethod.GET)
    @GetMapping("/order/{orderId}")
    public String getOrder(@PathVariable String orderId) throws IllegalAccessException {
        log.info("Get some order " + orderId);

        if ("500".equals(orderId)) {
            throw new IllegalAccessException("500 is not valid orderId");
        }
        return "orderId:" + orderId + ", orderAmount:1000";
    }

    @GetMapping("/order")
    public String getOrderWithRequestParam
            (@RequestParam(value = "orderId", required = false, defaultValue = "defaultId") String orderId,
             @RequestParam String orderAmount) {
        log.info("Get some order " + orderId);
        return "orderId:" + orderId + ", orderAmount:" + orderAmount;
    }

    @PostMapping("/order")
    public String createOrder
            (@RequestBody CreateOrderRequest createOrderRequest,
             @RequestHeader String userId) {
        log.info("Get some order " + createOrderRequest + ", userId: " + userId);
        return "orderId:" + createOrderRequest.orderId + ", orderAmount:" + createOrderRequest.orderAmount;
    }

    @Data // lombok으로인해 getteer&setter 자동으로 들어있음
    public static class CreateOrderRequest {
        private String orderId;
        private Integer orderAmount;

    }
}
