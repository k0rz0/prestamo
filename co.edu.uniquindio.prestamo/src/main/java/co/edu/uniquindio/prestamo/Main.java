package co.edu.uniquindio.prestamo;

import co.edu.uniquindio.prestamo.model.Cliente;
import co.edu.uniquindio.prestamo.model.Empleado;
import co.edu.uniquindio.prestamo.model.PrestamoUq;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrestamoUq prestamoUq = inializarDatosPrueba();

        //CRUD

        //Create

        //Clientes
        crearCliente("juan", "arias", "1094", 24, prestamoUq);
        crearCliente("ana", "alzate", "1095", 35, prestamoUq);
        crearCliente("maria", "perez", "1096", 22, prestamoUq);
        crearCliente("pedro", "arias", "1097", 24, prestamoUq);

        //Empleados
        crearEmpleado("jaime", "cardona", "2005", 28, prestamoUq);
        crearEmpleado("carlos", "macho", "2006", 50, prestamoUq);
        crearEmpleado("jose", "rios", "2007", 19, prestamoUq);
        crearEmpleado("mario", "ortiz", "2008", 35, prestamoUq);


        //Read
        mostrarInformacionCliente(prestamoUq);

        //Update
        //Cliente
        actualizarCliente(prestamoUq, "1097", "1099", "pedrin", "Orion", 35);

        //Empleado
        actualizarEmpleado(prestamoUq, "2005", "2020", "Jey", "cardoso", 20);

        System.out.println("-----> Informacion luego de actualizar");
        mostrarInformacionCliente(prestamoUq);

        //Delete
        //Cliente
        elilimarCliente(prestamoUq, "1094");

        //Empleado
        elilimarEmpleado(prestamoUq, "2008");
        System.out.println("-----> Informacion luego de eliminar");
        mostrarInformacionCliente(prestamoUq);
    }




    private static PrestamoUq inializarDatosPrueba() {
        PrestamoUq prestamoUq = new PrestamoUq();
        prestamoUq.setNombre("Prestamo Rapido");

        return prestamoUq;
    }

    private static void crearCliente(String nombre,
                                     String apellido,
                                     String cedula,
                                     int edad,
                                     PrestamoUq prestamoUq) {
        prestamoUq.crearCliente(nombre, apellido, cedula, edad);
    }

    private static void crearEmpleado(String nombre, String apellido,
                                      String cedula, int edad, PrestamoUq prestamoUq) {
        prestamoUq.crearEmpleado(nombre, apellido, cedula, edad);
    }

    private static void actualizarCliente(PrestamoUq prestamoUq, String cedula, String newCedula,
                                          String nombre, String apellido, int edad) {

        prestamoUq.actualizarCliente(cedula, newCedula, nombre, apellido, edad);

    }
    private static void actualizarEmpleado(PrestamoUq prestamoUq, String cedula,
                                           String newCedula, String nombre, String apellido, int edad) {
        prestamoUq.actualizarEmpleado(cedula, newCedula, nombre, apellido, edad);
    }

    private static void elilimarCliente(PrestamoUq prestamoUq, String cedula) {
        prestamoUq.eliminarCliente(cedula);
    }

    private static void elilimarEmpleado(PrestamoUq prestamoUq, String cedula) {
        prestamoUq.eliminarEmpleado(cedula);
    }

    private static void mostrarInformacionCliente(PrestamoUq prestamoUq) {

        System.out.println("-----> Clientes");

        List<Cliente> listaClientes = prestamoUq.obtenerClientes();
        int tamanioLista = listaClientes.size();
        for(int i=0; i < tamanioLista; i++){
            Cliente cliente = listaClientes.get(i);
            System.out.println(cliente.toString());
        }

        System.out.println("-----> Empledaos");

        List<Empleado> listaEmpleados = prestamoUq.obtenerEmpleados();
        tamanioLista = listaEmpleados.size();
        for(int i=0; i < tamanioLista; i++){
            Empleado empleado = listaEmpleados.get(i);
            System.out.println(empleado.toString());
        }
    }

}