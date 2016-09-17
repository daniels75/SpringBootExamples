package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
	@Autowired
	private DefaultService defaultService;
	
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/ing")
    public String ingService() {
        return defaultService.ingService();
    }
    
    @RequestMapping("/mBank")
    public String mBankService() {
        return defaultService.mBankService();
    }
    
    @RequestMapping("/pkobp")
    public String pkobpService() {
        return defaultService.pkobpService();
    }
    
}
