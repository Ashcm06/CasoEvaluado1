/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitarfacturas;

/**
 *
 * @author ashca
 */
public class Facturas {
    
    private String nombrecliente;
    private String cedulacliente;
    private String codigoFa;
    private String montoFa;
    private int mes;
    private boolean productosEle;
    private boolean productosAuto;
    private boolean productosConstru;
    private double factura; 

    public Facturas(String nombrecliente, String cedulacliente, String codigoFa, String montoFa, int mes, boolean productosEle, boolean productosAuto, boolean productosConstru) {

        //Getters.          
    }

    public double getFactura() {
        return factura;
    }

    public void setFactura(double factura) {
        this.factura = factura;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getCedula() {
        return cedulacliente;
    }

    public void setCedula(String cedula) {
        this.cedulacliente = cedulacliente;
    }

    public String getCodigoFa() {
        return codigoFa;
    }

    public void setCodigoFa(String codigoFa) {
        this.codigoFa = codigoFa;
    }

    public String getMontoFa() {
        return montoFa;
    }

    public void setMontoFa(String montoFa) {
        this.montoFa = montoFa;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public boolean isProductosEle() {
        return productosEle;
    }

    public void setProductosEle(boolean productosEle) {
        this.productosEle = productosEle;
    }

    public boolean isProductosAuto() {
        return productosAuto;
    }

    public void setProductosAuto(boolean productosAuto) {
        this.productosAuto = productosAuto;
    }

    public boolean isProductosConstru() {
        return productosConstru;
    }

    public void setProductosConstru(boolean productosConstru) {
        this.productosConstru = productosConstru;
    }

    //Comisión y puntos. 
    
    public double calcularComision() {
        double facturas = 0;
        facturas = facturas * 10;
        double bono = 0;
         
        if (productosEle) bono += facturas * 0.04;
        if (productosAuto) bono += facturas * 0.04;
        if (productosConstru) bono += facturas * 0.08;
        
        return facturas + bono;}

    public int calcularPuntos() {
        int puntos = 0;
        
        if (productosEle) puntos += 1;
        if (productosAuto) puntos += 1;
        if (productosConstru) puntos += 2;
        return puntos;
    }
}
