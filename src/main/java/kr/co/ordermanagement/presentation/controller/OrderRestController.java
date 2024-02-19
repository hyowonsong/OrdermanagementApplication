package kr.co.ordermanagement.presentation.controller;

import kr.co.ordermanagement.application.SimpleProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {
    private SimpleProductService simpleProductService;

    @Autowired
    OrderRestController(SimpleProductService simpleProductService){
        this.simpleProductService = simpleProductService;
    }

    // 상품 주문 API
    @RequestMapping(value = "/orders",method = RequestMethod.POST)
}
