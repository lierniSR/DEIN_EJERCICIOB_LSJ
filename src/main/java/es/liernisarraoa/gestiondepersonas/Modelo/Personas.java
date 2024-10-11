package es.liernisarraoa.gestiondepersonas.Modelo;

public class Personas {
    private String nombre;
    private String apellido;
    private Integer edad;

    public Personas(String nombre, String apellido, Integer edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Getters and setters
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public Integer getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setEdad(Integer edad){
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Personas)) {
            return false;
        }
        Personas other = (Personas) obj;
        return nombre.equals(other.nombre) && apellido.equals(other.apellido) && edad == other.edad;
    }
}
