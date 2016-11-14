package models;




import java.util.*;

import javax.persistence.*;
import javax.validation.Constraint;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity

public class computadoras extends Model {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    
	public Long id;
    
    @Constraints.Required(message=" ingresar nombre de la computadora.")
    public String nombre;
    
    @Constraints.Required(message=" ingresar su memoria.")
    public String descripcion;
    
    @Constraints.Required(message=" ingresar su disco.")
    public String descripcio;
    
    @Constraints.Required(message=" ingresar su disco.")
    public String precio;
    
    @Constraints.Required(message="marca")

}
