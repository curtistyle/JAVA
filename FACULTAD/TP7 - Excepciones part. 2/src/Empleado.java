package ej5;

public class Empleado {

	//atributos
    private String nombre;
    private Integer sueldo = 0;    
    
    public Empleado() {
        super();
    }

    public Empleado(String nombre, Integer sueldo) {
        super();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Empleado(String nombre) {
        super();
        this.nombre = nombre;
    }	

   public Empleado(Integer sueldo) {
		super();
		this.sueldo = sueldo;
	}

   public String getNombre() {
        return nombre;
    }
/*
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
*/
    public Integer getSueldo() {
        return this.sueldo;
    }
    
    public String getSueldoString() {
        return "$" + sueldo;
    }

    public  void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo.intValue();
    }

    public void setSueldo(String sueldo) {
        this.sueldo = Integer.parseInt(sueldo);
    }

    @Override
    public String toString() {
        return nombre + " - " + this.getSueldoString();
    }
    
    public String imprimible() {
    	return "Empleado: "+this.getNombre()+" - Sueldo: "+ this.getSueldoString();
    }
    
    
}
