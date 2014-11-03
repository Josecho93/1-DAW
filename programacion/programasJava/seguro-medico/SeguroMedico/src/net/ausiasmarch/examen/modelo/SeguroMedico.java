/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ausiasmarch.examen.modelo;

/**
 *
 * @author ruben
 */
public class SeguroMedico {

    // VARIABLES (Propiedades) ............................................

    private String sexo, trabajo, mensaje;
    private int edad, numHijos;
    private boolean casado, embarazada;
    private boolean enfermedadCorazon, enfermedadOjos, enfermedadPiel;
    private boolean coberturaCorazon, coberturaOftalmologica, coberturaInVitro;
    private boolean coberturaPediatria, coberturaDermatologia;

    // MÉTODOS (Funciones) set (poner) / get (obtener) las propiedades
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public boolean isEnfermedadCorazon() {
        return enfermedadCorazon;
    }

    public void setEnfermedadCorazon(boolean enfermedadCorazon) {
        this.enfermedadCorazon = enfermedadCorazon;
    }

    public boolean isEnfermedadOjos() {
        return enfermedadOjos;
    }

    public void setEnfermedadOjos(boolean enfermedadOjos) {
        this.enfermedadOjos = enfermedadOjos;
    }

    public boolean isEnfermedadPiel() {
        return enfermedadPiel;
    }

    public void setEnfermedadPiel(boolean enfermedadPiel) {
        this.enfermedadPiel = enfermedadPiel;
    }

    public boolean isCoberturaCorazon() {
        return coberturaCorazon;
    }

    public void setCoberturaCorazon(boolean coberturaCorazon) {
        this.coberturaCorazon = coberturaCorazon;
    }

    public boolean isCoberturaOftalmologica() {
        return coberturaOftalmologica;
    }

    public void setCoberturaOftalmologica(boolean coberturaOftalmologica) {
        this.coberturaOftalmologica = coberturaOftalmologica;
    }

    public boolean isCoberturaInVitro() {
        return coberturaInVitro;
    }

    public void setCoberturaInVitro(boolean coberturaInVitro) {
        this.coberturaInVitro = coberturaInVitro;
    }

    public boolean isCoberturaPediatria() {
        return coberturaPediatria;
    }

    public void setCoberturaPediatria(boolean coberturaPediatria) {
        this.coberturaPediatria = coberturaPediatria;
    }

    public boolean isCoberturaDermatologia() {
        return coberturaDermatologia;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public boolean isEmbarazada() {
        return embarazada;
    }

    public void setEmbarazada(boolean embarazada) {
        this.embarazada = embarazada;
    }

    public void setCoberturaDermatologia(boolean coberturaDermatologia) {
        this.coberturaDermatologia = coberturaDermatologia;
    }

    /**
     * *************************************************************************
     * METODOS (Funciones)
    **************************************************************************
     * @return 
     */
    public boolean aceptado() {
        // 1. La edad debe ser mayor o igual de 18 años.
        if(edad < 18){
            mensaje = "La edad debe ser mayor o igual de 18 años.\n";
            return false;
        }
        // 2. Si eligió ’‘Embarazada’ o cobertura ‘Fecundación in vitro, el sexo debe ser ‘Mujer’
        if((embarazada || coberturaInVitro) && sexo != "Mujer"){
            mensaje = "Si eligió ’‘Embarazada’ o cobertura ‘Fecundación in vitro, el sexo debe ser ‘Mujer’\n";
            return false;
        }
        // 3. El número de hijos debe ser mayor o igual que cero
        if(numHijos < 0){
            mensaje = "El número de hijos debe ser mayor o igual que cero.\n";
            return false;
        }
        // 4. Con cobertura ‘Pediatría’ el número de hijos debe ser mayor de cero
        if(coberturaPediatria && numHijos <= 0){
            mensaje = "Con cobertura ‘Pediatría’ el número de hijos debe ser mayor de cero\n";
            return false;
        }
        // 5. Si seleccionó la cobertura ‘Dermatológica” debe seleccionar la enfermedad ‘Piel’
        if(coberturaDermatologia && !enfermedadPiel){
            mensaje = "Si seleccionó la cobertura ‘Dermatológica” debe seleccionar la enfermedad ‘Piel’\n";
            return false;
        }
        // 6. Si seleccionó la cobertura ‘Corazón” debe seleccionar la enfermedad ‘Corazón’
        if(coberturaCorazon && !enfermedadCorazon){
            mensaje = "Si seleccionó la cobertura ‘Corazón” debe seleccionar la enfermedad ‘Corazón’";
            return false;
        }
        // 7. Si seleccionó la cobertura Oftalmología” debe seleccionar la enfermedad ‘Ojos’
        if(coberturaOftalmologica && !enfermedadOjos){
            mensaje = "Si seleccionó la cobertura Oftalmología” debe seleccionar la enfermedad ‘Ojos’";
            return false;
        }
        return true;
    }
    
    // DEVUELVE EL IMPORTE MENSUAL DEL SEGURO MEDICO
    public double importeMensual(){
        return 200 + precioEnfermedad() + precioCovertura();
    }
    
    // CALCULO DEL PRECIO ADICIONAL POR ENFERMEDADES
    public double precioEnfermedad(){
        double precioEnfermedad = 0;
        
        if(enfermedadCorazon){
            precioEnfermedad += 15;
        }
        if(enfermedadOjos){
            precioEnfermedad += 15;
        }
        if(enfermedadPiel){
            precioEnfermedad += 15;
        }
        return precioEnfermedad;
    }
    
    // CALCULO DEL PRECIO ADICIONAL POR COVERTURAS
    public double precioCovertura(){
        double precioCovertura = 0;
        
        if(coberturaOftalmologica || coberturaPediatria){
            precioCovertura += 15;
        }
        if(coberturaInVitro){
            precioCovertura += 40;
        }
        if(coberturaCorazon){
            precioCovertura += 50;
        }
        if(coberturaDermatologia){
            precioCovertura += 25;
        }
        return precioCovertura;
    }
    
    //CALCULO DEL DESCUENTO AL PRECIO ANUAL
    private double descuento(){
        double descuento;
        
        if(trabajo == "Funcionario"){
            descuento = 0.15;
        }
        else {
            descuento = 0.05;
        }
        return (importeMensual() * 12) * descuento;    
    }
    
    // DEVUELVE EL IMPORTE ANUAL DEL SEGURO MEDICO
    public double importeAnual(){
        return (importeMensual() * 12) - descuento();
    }
}
