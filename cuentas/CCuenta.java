package cuentas;
/**
 * @author Agustin
 * @version 1.0
 *  */

public class CCuenta {
	
	
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    private double saldoActual;


    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	
    
    public CCuenta()
    {
    }
    /**
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }
    /**
     * @param cantidad
     * @throws Exception
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
     * @param saldoActual
     */
    public void operativa_cuenta(double saldoActual) {
    	float cantidad;
    	
        saldoActual = saldo + tipoInteres;
        System.out.println("El saldo actual es"+ saldoActual );
    }
}
