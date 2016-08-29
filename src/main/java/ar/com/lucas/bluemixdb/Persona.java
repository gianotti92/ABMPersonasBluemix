package ar.com.lucas.bluemixdb;

public class Persona {
	private final String tipo = "persona";
	private String _id;
	private String nombre;
	private String apellido;
	private String dni;
	private String _rev;
	
	public String get_rev() {
		return _rev;
	}

	public void set_rev(String _rev) {
		this._rev = _rev;
	}

	public Persona(String id, String nombre, String apellido, String dni) {
		this._id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public Persona() {
	}

	public String getId() {
		return _id;
	}

	public void setId(String id) {
		this._id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
