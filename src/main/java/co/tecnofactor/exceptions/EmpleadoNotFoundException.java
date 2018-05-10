package co.tecnofactor.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class EmpleadoNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public EmpleadoNotFoundException() {
		super("No existe ningún empleado");
	}
	
	public EmpleadoNotFoundException(long id) {
		super(String.format("No existe ningún empleado con el ID %d", id));
	}

}
