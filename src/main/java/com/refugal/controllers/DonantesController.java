package com.refugal.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/donantes")
public class DonantesController {
	private static final Logger LOGGER = LoggerFactory.getLogger(DonantesController.class);


	@RequestMapping("")
	public String index() {
		return "donantes";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/propiedad")
	public String addPropiedad(@RequestParam("lugar") String lugar, @RequestParam("name") String name) {
		LOGGER.info("Lugar: {}, nombre: {}", lugar, name);

		return "redirect:/";

	}

}
