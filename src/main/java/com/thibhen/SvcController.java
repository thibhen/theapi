package com.thibhen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class SvcController {

	
	
	@RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Hello sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
		
		Hello h = new Hello("Hello " + name);
        return h;
    }
	
}
