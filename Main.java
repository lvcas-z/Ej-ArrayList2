package ArrayLists2;

public class Main {
    public static void main(String[] args) {
        // Creo una cuenta
        Cuenta bancoRioFede = new Cuenta();
        bancoRioFede.setNroCuenta(1);
        bancoRioFede.setSaldo(25120.0);
//        System.out.println("El numero de cuenta es "+""+bancoRioFede.getNroCuenta()+"y el saldo es"+""+bancoRioFede.getSaldo());
        //Creo una persona
        Persona fede = new Persona();
        fede.setNombre("Federico");
        fede.setApellido("Farias");
        fede.setEdad(23);
        System.out.println("Mi nombre es"+" "+fede.getNombreCompleto()+" "+"y tengo"+" "+fede.getEdad()+" "+"anios de edad");
        //Agrego una cuenta
        fede.agregarCuenta(bancoRioFede);
        //Creo otra cuenta
        Cuenta bancoDigi = new Cuenta();
        bancoDigi.setNroCuenta(12);
        bancoDigi.setSaldo(253120.98);
        //Agrego otra cuenta
        fede.agregarCuenta(bancoDigi);
        System.out.println(fede.getSaldoTotal());
    }
}
