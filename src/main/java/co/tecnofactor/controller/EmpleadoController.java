package co.tecnofactor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.tecnofactor.exceptions.EmpleadoNotFoundException;
import co.tecnofactor.model.Empleado;
import co.tecnofactor.repository.EmpleadoRepository;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoRepository empleadoRepository;

	@GetMapping("/empleados")
	public List<Empleado> list() {
		List<Empleado> result = empleadoRepository.findAll();

		if (!result.isEmpty())
			return result;
		else
			throw new EmpleadoNotFoundException();

	}
}
