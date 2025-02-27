/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitarfacturas;

/**
 *
 * @author ashca
 */
public class AgenteVentas {
    
    private String nombre;
    private String cedulaAgente;
    private String codigo;
    private String sucursal;
    private boolean vehiculoPropio;
    private double facturas[];

    public AgenteVentas(String nombre, String cedulaAgente, String codigo, String sucursal, boolean vehiculoPropio) {

    }

    public double[] getFacturas() {
        return facturas;
    }

    public void setFacturas(double[] facturas) {
        this.facturas = facturas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getcedulaAgente() {
        return cedulaAgente;
    }

    public void setcedulaAgente(String cedula) {
        this.cedulaAgente = cedulaAgente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public boolean isVehiculoPropio() {
        return vehiculoPropio;
    }

    public void setVehiculoPropio(boolean vehiculoPropio) {
        this.vehiculoPropio = vehiculoPropio;
    }

    
    

}
