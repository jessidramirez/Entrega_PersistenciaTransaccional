
package Entidades;


public class Empleados {
    private int EMPL_ID;
    private String EMPL_NOMBRE;
    private String EMPL_APELLIDO;
    private String EMPL_EMAIL;
    private String EMPL_FECHA_NAC;
    private String EMPL_SUELDO;
    private String EMPL_COMISION;
    private int EMPL_CARGO_ID;
    private int EMPL_DPTO_ID;

    public Empleados(int EMPL_ID, String EMPL_NOMBRE, String EMPL_APELLIDO, String EMPL_EMAIL, String EMPL_FECHA_NAC, String EMPL_SUELDO, String EMPL_COMISION, int EMPL_CARGO_ID, int EMPL_DPTO_ID) {
        this.EMPL_ID = EMPL_ID;
        this.EMPL_NOMBRE = EMPL_NOMBRE;
        this.EMPL_APELLIDO = EMPL_APELLIDO;
        this.EMPL_EMAIL = EMPL_EMAIL;
        this.EMPL_FECHA_NAC = EMPL_FECHA_NAC;
        this.EMPL_SUELDO = EMPL_SUELDO;
        this.EMPL_COMISION = EMPL_COMISION;
        this.EMPL_CARGO_ID = EMPL_CARGO_ID;
        this.EMPL_DPTO_ID = EMPL_DPTO_ID;
    }

    public int getEMPL_ID() {
        return EMPL_ID;
    }

    public void setEMPL_ID(int EMPL_ID) {
        this.EMPL_ID = EMPL_ID;
    }

    public String getEMPL_NOMBRE() {
        return EMPL_NOMBRE;
    }

    public void setEMPL_NOMBRE(String EMPL_NOMBRE) {
        this.EMPL_NOMBRE = EMPL_NOMBRE;
    }

    public String getEMPL_APELLIDO() {
        return EMPL_APELLIDO;
    }

    public void setEMPL_APELLIDO(String EMPL_APELLIDO) {
        this.EMPL_APELLIDO = EMPL_APELLIDO;
    }

    public String getEMPL_EMAIL() {
        return EMPL_EMAIL;
    }

    public void setEMPL_EMAIL(String EMPL_EMAIL) {
        this.EMPL_EMAIL = EMPL_EMAIL;
    }

    public String getEMPL_FECHA_NAC() {
        return EMPL_FECHA_NAC;
    }

    public void setEMPL_FECHA_NAC(String EMPL_FECHA_NAC) {
        this.EMPL_FECHA_NAC = EMPL_FECHA_NAC;
    }

    public String getEMPL_SUELDO() {
        return EMPL_SUELDO;
    }

    public void setEMPL_SUELDO(String EMPL_SUELDO) {
        this.EMPL_SUELDO = EMPL_SUELDO;
    }

    public String getEMPL_COMISION() {
        return EMPL_COMISION;
    }

    public void setEMPL_COMISION(String EMPL_COMISION) {
        this.EMPL_COMISION = EMPL_COMISION;
    }

    public int getEMPL_CARGO_ID() {
        return EMPL_CARGO_ID;
    }

    public void setEMPL_CARGO_ID(int EMPL_CARGO_ID) {
        this.EMPL_CARGO_ID = EMPL_CARGO_ID;
    }



    public int getEMPL_DPTO_ID() {
        return EMPL_DPTO_ID;
    }

    public void setEMPL_DPTO_ID(int EMPL_DPTO_ID) {
        this.EMPL_DPTO_ID = EMPL_DPTO_ID;
    }
    
}
