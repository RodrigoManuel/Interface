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


public abstract class Empleado implements Porpagar
{
   private final String nombre;
   private final String apellido;
   private final String cedulaIdentidad;

   // constructor
   public Empleado(String nombre, String apellido, 
      String cedulaIdentidad)
   {
      this.nombre = nombre;
      this.apellido = apellido;
      this.cedulaIdentidad = cedulaIdentidad;
   } 

   // retorna el nombre
   public String obtenerNombre()
   {
      return nombre;
   } 

   // retorna el apellido
   public String obtenerApellido()
   {
      return apellido;
   } 

   // retorna el número de la cédula de identidad
   public String obtenerCedulaIdentidad()
   {
      return cedulaIdentidad;
   } 

   // retorna en un String la representación de un objeto Empleado
   @Override
   public String toString()
   {
      return String.format("%s %s%nsocial security number: %s", 
         obtenerNombre(), obtenerApellido(), obtenerCedulaIdentidad());
   }
   //Nota: Aquí no implementamos el método obtenerMontoPago de Porpagar, así que
   //esta clase debe declararse como abstract para evitar un error de compilación.
} // Final clase abstracta Empleado
