package com.refugal.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mapa")
public class MapaController {
	private static final Logger LOGGER = LoggerFactory.getLogger(MapaController.class);


	@RequestMapping("")
	public String index() {
		return "mapa";
	}



}
