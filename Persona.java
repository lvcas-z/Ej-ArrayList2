package ArrayLists2;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList <Cuenta> cuentas = new ArrayList<>();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreCompleto(){
        return this.nombre +" "+ this.apellido;
    }

    public boolean esMayorEdad(){
        return this.edad>=18;
    }
    public void agregarCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
    }
    public void mostrarCuentas(){
     for (Cuenta cuenta : cuentas){
         System.out.println("Nro de cuenta:" +" "+cuenta.getNroCuenta()+" "+"Saldo disponible:"+cuenta.getSaldo());
     }
    }
    public String getSaldoTotal(){
        double saldoTotal = 0;
        for (Cuenta cuenta :cuentas){
            saldoTotal += cuenta.getSaldo();
        }
        return"El saldo total de tus cuentas es "+ saldoTotal;
    }
}

