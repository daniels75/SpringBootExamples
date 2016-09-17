package org.daniels.springboot.web;

import org.springframework.web.bind.annotation.RestController;
import org.daniels.springboot.services.DefaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SampleRestController {
    
	@Autowired
	private DefaultService defaultService;
	
    @RequestMapping("/")
    public String index() {
        return "Spring Boot with different Service Implementations - available services: /money or /currency";
    }
    
    @RequestMapping("/money")
    public String money() {
        return defaultService.moneyService();
    }
    
    @RequestMapping("/currency")
    public String mBankService() {
        return defaultService.currencyService();
    }
    
}
