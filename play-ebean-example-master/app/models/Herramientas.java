package models;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.data.format.Formats;
import play.data.validation.Constraints;

public class Herramientas {
	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required(message=" escojer la herramienta.")
    public String nombre;
    
    @Constraints.Required(message=" ingresar cantidad.")
    public String cantidad;
    
    @Constraints.Required(message=" escojer la marca")
    public String descripcion;
    


}
