package com.microservice.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value="ModelViewController")
//@RequestMapping("view")
public class ModelViewController {
  
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView modelView() {
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("index");
		return mvc;
	}
	
}
