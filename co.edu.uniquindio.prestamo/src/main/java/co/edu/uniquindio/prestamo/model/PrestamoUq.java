package co.edu.uniquindio.prestamo.model;

import java.util.ArrayList;
import java.util.List;

public class PrestamoUq {

    private String nombre;

    List<Cliente> listaClientes = new ArrayList<>();

    List<Empleado> listaEmpleados = new ArrayList<>();

    public PrestamoUq() {
    }

    public PrestamoUq(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    /**
     * Metodo para crear un cliente
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @return boolean
     */
    public boolean crearCliente(String nombre, String apellido, String cedula, int edad){
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setCedula(cedula);
        cliente.setEdad(edad);
        getListaClientes().add(cliente);

        return true;
    }

    /**
     * Metodo para crear un Empleado
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @return boolean
     */
    public boolean crearEmpleado(String nombre, String apellido, String cedula, int edad){
        Empleado empleado = new Empleado();
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setCedula(cedula);
        empleado.setEdad(edad);
        getListaEmpleados().add(empleado);

        return true;
    }

    /**
     * Metodo para obtener la lista de todos los clientes
     * @return List<Cliente>
     */
    public List<Cliente> obtenerClientes() {
        return getListaClientes();
    }

    /**
     * Metodo para obtener la lista de todos los empleados
     * @return List<Empleados>
     */
    public List<Empleado> obtenerEmpleados() {
        return getListaEmpleados();
    }

    public void actualizarCliente(String cedula, String newCedula,
                                  String nombre, String apellido, int edad) {
        int tamanioLista = getListaClientes().size();
        for (int i=0; i < tamanioLista; i++){
            Cliente cliente = getListaClientes().get(i);
            if(cliente.getCedula().equalsIgnoreCase(cedula)){
                cliente.setCedula(newCedula);
                cliente.setNombre(nombre);
                cliente.setApellido(apellido);
                cliente.setEdad(edad);
                break;
            }
        }
    }

    public void eliminarCliente(String cedula) {
        int tamanioLista = getListaClientes().size();
        for (int i=0; i < tamanioLista; i++){
            Cliente cliente = getListaClientes().get(i);
            if(cliente.getCedula().equalsIgnoreCase(cedula)){
                getListaClientes().remove(i);
                break;
            }
        }
    }

    public void eliminarEmpleado(String cedula) {
        int tamanioLista = getListaEmpleados().size();
        for (int i=0; i < tamanioLista; i++){
            Empleado empleado = getListaEmpleados().get(i);
            if(empleado.getCedula().equalsIgnoreCase(cedula)){
                getListaEmpleados().remove(i);
                break;
            }
        }
    }


    public void actualizarEmpleado(String cedula, String newCedula,
                                   String nombre, String apellido, int edad){

        int tamanioLista = getListaEmpleados().size();
        for (int i=0; i < tamanioLista; i++){
            Empleado empleado = getListaEmpleados().get(i);
            if(empleado.getCedula().equalsIgnoreCase(cedula)){
                empleado.setCedula(newCedula);
                empleado.setNombre(nombre);
                empleado.setApellido(apellido);
                empleado.setEdad(edad);
                break;
            }
        }

    }


    @Override
    public String toString() {
        return "PrestamoUq{" +
                "nombre='" + nombre + '\'' +
                '}';
    }



}