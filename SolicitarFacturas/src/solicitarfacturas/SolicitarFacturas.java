/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solicitarfacturas;

import javax.swing.JOptionPane;

/**
 *
 * @author ashca
 */
public class SolicitarFacturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sucursal = JOptionPane.showInputDialog("Ingrese la sucursal del Agente:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Agente:");
        String cedulaAgente = JOptionPane.showInputDialog("Ingrese la cédula del Agente:");
        String codigo = JOptionPane.showInputDialog("Ingrese el código del Agente:");
        boolean vehiculoPropio = JOptionPane.showConfirmDialog(null, "¿El Agente tiene vehiculo Propio?", "vehiculoPropio", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        AgenteVentas agenteVentas = new AgenteVentas(nombre, cedulaAgente, codigo, sucursal, vehiculoPropio);
        
        int cantidadFacturas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas facturas desea ingresar?"));
        
        Facturas facturas = new Facturas;

        for (int i = 0; i < cantidadFacturas; i++) {
            String nombrecliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
            String cedulacliente = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");
            String codigoFa = JOptionPane.showInputDialog("Ingrese el codigo de la factura:");
            String montoFa = JOptionPane.showInputDialog("Ingrese el monto de la factura");
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de la factura:"));

            
            while (mes < 1 || mes > 12) {
                mes = Integer.parseInt(JOptionPane.showInputDialog("Mes inválido, ingrese una mes entre 1 y 12:"));
                

            }

            boolean productosEle = JOptionPane.showConfirmDialog(null, "tiene un producto eléctrico?", "Electrico", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            boolean productosAuto = JOptionPane.showConfirmDialog(null, "tiene un producto automotriz?", "Automotrices", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            boolean productosConstru = JOptionPane.showConfirmDialog(null, "tiene un producto de construcción??", "construcción", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            
            
        }

        System.out.println(sucursal);
        System.out.println(nombre); 
        System.out.println(cedulaAgente);
        System.out.println(codigo);
        System.out.println(vehiculoPropio);
        
    }
    

}
