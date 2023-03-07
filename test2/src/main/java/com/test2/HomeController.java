package com.test2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {

	@RequestMapping("")
    // 3. Method that maps to the request route above
    public String hello() { // 3
            return "Hello vrn;avirnif!";
    }
	
	 @RequestMapping(value="/world", method=RequestMethod.GET)
     public String world() {
             return "Class level annotations are cool too!";
     }
}

