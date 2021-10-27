
package com.mycompany.practica5;
public class Practica05 {
    public static void main(String[] args) {
        //getters and setters
        System.out.println("============ GETTER AND SETTER ==============");
        Circulo cir= new Circulo();
        System.out.println(cir);
        cir.setRadio(-7);
        System.out.println(cir);
        System.out.println("Radio de cir = "+cir.getRadio());
        System.out.println("============ COMPOSICION ==========");
        Persona per =new Persona();
        per.setNombre("antonio");
        per.setApellido("Zamudio");
        Fecha fNac = new Fecha(14,10,2021);
        per.setfNacimiento(fNac);
        System.out.println(per);
        System.out.println("============ COMPOSICION 2==========");
        Fecha fNac2 = new Fecha(1,1,202);//debo crear antres fecha para pasarselo a persona
        Persona per2 =new Persona("JUAN","BENITO",fNac2);
        System.out.println(per2);
        System.out.println("============ COMPOSICION 3 ==========");
        Persona per3 =new Persona("pedro","ozuna",2,3,4);
        System.out.println(per3);
        System.out.println("===================================================");
        System.out.println("===================================================");
        Carro carro = new Carro(2020, "FERRARI", 4, 44);
        Persona persona1=new Persona("angel", "chofer", 28, 06, 2001);
        carro.setPersona1(persona1);
        Persona persona2=new Persona("xiemena","copiloto", 23, 07, 2001);
        carro.setPersona2(persona2);
        Persona persona3 = new Persona("Sab","copiloto 1", 3, 11,2014);
        carro.setPersona3(persona3);
        Persona persona4=new Persona("Yael", "pasajero 2", 27, 12, 2010);
        carro.setPersona4(persona4);
        System.out.println(carro);
        
        
        
        
        
        
    }
    
}
