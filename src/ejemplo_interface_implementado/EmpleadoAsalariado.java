/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo_interface_implementado;

/**
 *
 * @author Rodrigo
 * @version 1.0
 * @since 11/04/2020
 */
public class EmpleadoAsalariado extends Empleado
{
   private double salarioSemanal;

   // constructor
   public EmpleadoAsalariado(String nombre, String apellido, 
      String cedulaIdentidad, double salarioSemanal)
   {
       //constructor clase padre 
       super(nombre, apellido, cedulaIdentidad); 

      if (salarioSemanal < 0.0) //se valida
         throw new IllegalArgumentException(
            "El salario semanal debe ser >= 0.0");

      this.salarioSemanal = salarioSemanal;
   } 

   // establece el salario
   public void establecerSalarioSemanal(double salarioSemanal)
   {
      if (salarioSemanal < 0.0)
         throw new IllegalArgumentException(
            "El salario semanal debe ser >= 0.0");

      this.salarioSemanal = salarioSemanal;
   } 

   // retorna el salario
   public double obtenerSalarioSemanal()
   {
      return salarioSemanal;
   } 

   // calcula los ingresos; implementa el método de la interfaz Porpagar
   // que era abstracto en la superclase Empleado
   @Override                                                         
   public double obtenerMontoPago()                                  
   {                                                                 
      return obtenerSalarioSemanal();                                      
   } 

   // return String representation of SalariedEmployee object   
   @Override                                                    
   public String toString()                                     
   {                                                            
      return String.format("Empleado asalariado: %s%n%s: $%,.2f",
         super.toString(), "Salario semanal", obtenerSalarioSemanal());
   } 
} // Fin de la clase EmpleadoAsalariado.
