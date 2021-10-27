/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica5;


public class Carro {
    private int anio;
    private String modelo;
    private int puertas;
    private int rodada;
    private Persona  persona1;
    private Persona  persona2;
    private Persona  persona3;
    private Persona  persona4;
    
    
    public Carro(){}
    public Carro(int anio, String modelo, int puertas, int rodada,String nombre, String apellido, int dia,int  mes, int ano) {
        this.anio = anio;
        this.modelo = modelo;
        this.puertas = puertas;
        this.rodada = rodada;
        persona1=new Persona(nombre, apellido, dia, mes, ano);
        
    }

    public Carro(int anio, String modelo, int puertas, int rodada) {
        this.anio = anio;
        this.modelo = modelo;
        this.puertas = puertas;
        this.rodada = rodada;
    }
    
    public Carro(int anio, String modelo, int puertas, int rodada, Persona persona1, Persona persona2, Persona persona3, Persona persona4) {
        this.anio = anio;
        this.modelo = modelo;
        this.puertas = puertas;
        this.rodada = rodada;
        this.persona1 = persona1;
        this.persona2 = persona2;
        this.persona3 = persona3;
        this.persona4 = persona4;
    }

    

   

    
    
    /*
    public void transporte(String localidad){
        System.out.println("AL LUGAR A DONDE FUISTE ES "+localidad);
    }
    public void gasolina(int kilometros){
        System.out.println("Lo que gastaste en $$$ de gas hoy fue "+ kilometros*20+" pesos");
    }
    public void verificacion(){
        if (anio==2021)
            System.out.println("NO TE TOCA VERIFICAR AUN");
        else
            System.out.println("YA VERIFICA HUEVON");
    }
    public void kilometraje(int kilometros){
        System.out.println("EL KILOMETRAJE ACTUAL DEL CARRO ES "+kilometros+1000000+" MILLAS");
    }
    public void baterias(){
        if(anio>=2010)
            System.out.println("YA COMPRA BATERIAS");
        else
            System.out.println("AUN TE RINDE LA BATERIA PAPI");
    }
    @Override
    public String toString() {
        return "Carro{" + "anio=" + anio + ", modelo=" + modelo + ", puertas=" + puertas + ", rodada=" + rodada + '}';
    } 
     */

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public Persona getPersona1() {
        return persona1;
    }

    public void setPersona1(Persona persona1) {
        this.persona1 = persona1;
    }

    public Persona getPersona2() {
        return persona2;
    }

    public void setPersona2(Persona persona2) {
        this.persona2 = persona2;
    }

    public Persona getPersona3() {
        return persona3;
    }

    public void setPersona3(Persona persona3) {
        this.persona3 = persona3;
    }

    public Persona getPersona4() {
        return persona4;
    }

    public void setPersona4(Persona persona4) {
        this.persona4 = persona4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carro{anio=").append(anio);
        sb.append(", modelo=").append(modelo);
        sb.append(", puertas=").append(puertas);
        sb.append(", rodada=").append(rodada);
        sb.append(", persona1=").append(persona1);
        sb.append(", persona2=").append(persona2);
        sb.append(", persona3=").append(persona3);
        sb.append(", persona4=").append(persona4);
        sb.append('}');
        return sb.toString();
    }

    

   
}
