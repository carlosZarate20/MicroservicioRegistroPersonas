package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Persona")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long IdPerson;
	
	@Column(name="Nombre")
	private String Nombre;
	
	@Column(name="Apellido")
	private String Apellido;
	
	@Column(name="Edad")
	private int Edad;
	
	@Column(name="Email")
	private String Email;
	
	@Column(name="DNI")
	private String DNI;
	
	@Column(name="Telefono")
	private String Telefono;
	
	public Person() {}
	
	

	public Person(Long idPerson, String nombre, String apellido, int edad, String email, String dNI, String telefono) {
		super();
		this.IdPerson = idPerson;
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Edad = edad;
		this.Email = email;
		this.DNI = dNI;
		this.Telefono = telefono;
	}



	public Long getIdPerson() {
		return IdPerson;
	}

	public void setIdPerson(Long idPerson) {
		IdPerson = idPerson;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	
	

}
