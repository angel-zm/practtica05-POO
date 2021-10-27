
package com.mycompany.practica5;
public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;

    public Persona() {
    }
    public Persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }
    //cuando no tengo el constructor de la composicion en el main lo puedo integrar en un constructor en 3 diferentes opciones
    public Persona(String nombre, String apellido,int dia,int mes,int ano) {
        this.nombre = nombre;
        this.apellido = apellido;
        //opcion 1
         Fecha fecha3 = new Fecha(dia,mes,ano);
         this.fNacimiento=fecha3;
           //estas dos lineas de codigo sirven pero es memopria desperdiciada
          //opcion 2
         fNacimiento= new Fecha();
         fNacimiento.setAño(ano);
         fNacimiento.setMes(mes);
         fNacimiento.setDia(dia);
         //opcion 3 y opcion recomendada 
         fNacimiento= new Fecha(dia,mes,ano);
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

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(",asiento=").append(apellido);
        sb.append(", fNacimiento=").append(fNacimiento);
        sb.append('}');
        return sb.toString();
    }
    
    
}
