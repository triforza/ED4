/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entornos4;

/**
 *
 * @author juanlu
 */
public class Main { 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        eCesta cesta;
        cesta = new eCesta("Acebal Rico",100, "47078234V");
        NuevoMetodo(cesta, 50);
    }
    public static void NuevoMetodo(eCesta cesta, double cantidad) {
        try 
        {
            System.out.println("Su bono antes de comprar es  "+ cesta.getBono() );
            cesta.comprar(cantidad);
            System.out.println("Su bono después de comprar es  "+ cesta.getBono() );
        } catch (Exception e)
        {
            System.out.println("No se puede pagar  ");
        }
        try
        {
            System.out.println("Solicitar actualización de bono");
            cesta.ActualizarBono(100);
            System.out.println("Su bono después de actualizar es  "+ cesta.getBono() );
        } catch (Exception e)
        {
            System.out.println("Error al recargar");
        }
        double bonoactual = cesta.getBono();
        System.out.println("Su bono actual es  "+ bonoactual );
}
}
