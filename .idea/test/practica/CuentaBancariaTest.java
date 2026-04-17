package practica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaBancariaTest {

    @Test
    void CuentaDelBanco(){
        CuentaBancaria cuenta= new CuentaBancaria("Ana garcia",1000);
        assertEquals("Ana garcia", cuenta.getTitular());
        assertEquals(1000, cuenta.getSaldo());
        assertFalse(cuenta.isBloqueada());
        assertEquals(1, CuentaBancaria.getTotalCuentasCreadas());
        CuentaBancaria cuentaNeg = new CuentaBancaria("paco alfajor",-102);
        assertEquals(0, cuentaNeg.getSaldo());


    }

    @Test
    void setTitular() {
        CuentaBancaria cuenta= new CuentaBancaria("Ana garcia",1000);
        cuenta.setTitular("paco perez");
        assertEquals("pepe perez", cuenta.getTitular());
        cuenta.setTitular(null);
        assertEquals("pepe perez", cuenta.getTitular());
        cuenta.setTitular("");
        assertEquals("pepe perez", cuenta.getTitular());
    }

    @Test
    void setSaldo() {
        CuentaBancaria cuenta= new CuentaBancaria("Ana garcia",1000);
        cuenta.setSaldo(100);
        assertEquals(100, cuenta.getTitular());
        cuenta.setSaldo(0);
        assertEquals(100, cuenta.getTitular());
        cuenta.setSaldo(-10);
        assertEquals(100, cuenta.getTitular());
    }

    @Test
    void isBloqueada() {

    }

    @Test
    void setBloqueada() {
    }

    @Test
    void getTotalCuentasCreadas() {
    }

    @Test
    void reiniciarContador() {
    }

    @Test
    void ingresar() {
    }

    @Test
    void retirar() {
    }

    @Test
    void aplicarComisionMensual() {
    }

    @Test
    void movimientosValidos() {
    }

    @Test
    void bloquearSiSaldoCero() {
    }
}