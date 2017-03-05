package com.refugal.controllers.rest;

import java.util.Arrays;
import java.util.List;

import com.refugal.model.ResultadoPropiedadesGeo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.refugal.model.Propiedad;
import com.refugal.model.PropiedadGeo;
import com.refugal.model.PropiedadRespuesta;

@RestController
@RequestMapping("/propiedades")
public class PropiedadRestController {
	private static final Logger LOGGER = LoggerFactory.getLogger(PropiedadRestController.class);

	private static  String IMAGE_1 = "casa-galicia5.jpg";
	private static String IMAGE_2 = "casa-galicia1.jpg";
	private static String IMAGE_3 = "casa-galicia3.jpg";
	private static String IMAGE_4 = "casa-galicia4.jpg";



	private static final List<PropiedadGeo> propiedades = Arrays.asList(
		PropiedadGeo.create(new Propiedad("Sofía Novo", "Barrantes", 10, "Una casa bonita"), 42.4949833, -8.7890875, IMAGE_1),
		PropiedadGeo.create(new Propiedad("Antonio Fontán", "Armenteira", 10, "Una casa bonita"), 42.4771322,-8.7860284, IMAGE_2),
		PropiedadGeo.create(new Propiedad("Eladio Souto", "Vilagarcía", 10, "Una casa bonita"), 42.4927192,-8.7808419, IMAGE_3),
		PropiedadGeo.create(new Propiedad("Josefa Amor", "A Illa de Arousa", 10, "Una casa bonita"), 42.4931781,-8.7799943, IMAGE_4)
	);

	@RequestMapping(method = RequestMethod.POST, value = "/nueva")
	@ResponseBody
	public PropiedadRespuesta creaPropiedad(@RequestBody Propiedad propiedad) {
		LOGGER.info("Nueva propiedad: {} , {}, {}, {}",
				propiedad.getPropietario(), propiedad.getLugar(), propiedad.getSuperficie(), propiedad.getDescripcion());
		return new PropiedadRespuesta("Correcto!");
	}

	@RequestMapping(method = RequestMethod.GET, value = "/lista")
	@ResponseBody
	public ResultadoPropiedadesGeo listaPropiedades() {
		return new ResultadoPropiedadesGeo("", propiedades);
	}

}
