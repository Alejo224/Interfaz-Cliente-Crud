
package crudarchivos;

import java.io.*;
import java.util.ArrayList;
import java.util.Optional;


/**
 *
 * @author Estudiante
 */
public class ClienteService {
    //Encapsulamiento de una constante
    private final String RUTA_CSV = "Clientes.csv";
    private final String SEPARADOR = ";";
    
    
    //crear un cliente
    public void create(Cliente cliente){
        try(FileWriter fw= new FileWriter(RUTA_CSV, true);
                BufferedWriter bw = new BufferedWriter(fw);
                ){
            
            
            String renglon = cliente.getCedula()+SEPARADOR
            +cliente.getNombre()+SEPARADOR+
            cliente.getTelefono();
            
            bw.write(renglon);
            bw.newLine();
            System.out.println("Guardado exitoso");
            
        } catch (IOException ex) {
            System.out.println("Error al guardar el cliente");
        }
    }
    
    
    //metodo eleminar cliente
    public void delete(int cedula){
        
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        File archivo = new File(RUTA_CSV);
        if(!archivo.exists()){
            System.out.println("Estte archivo no existe");
            
        }
        
        try(FileReader fr = new FileReader(RUTA_CSV);
            BufferedReader br = new BufferedReader(fr)){
            
            Cliente cliente = findCliente(cedula);
            
            
        } catch (IOException ex) {
            System.out.println("No se pudo leer");
        }
        
        
    }
    
    //getClientebycedula
    public Cliente findCliente(int cedula){
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes = getAllCliente();
        
        Cliente cliente;
        for (Cliente item : clientes){
            if (item.getCedula() == cedula){
                System.out.println("Cliente encontrado");
                System.out.println(item.toString());
                cliente = new Cliente(item.getCedula(), item.getNombre(), item.getCedula());
                return cliente;
            }
        }
        
        System.out.println("Cliente no encontrado.");
        return null;
        
    }
    
    //metodo sobrescribir
    private boolean sobreEscribirArchivo(ArrayList<Cliente> clientes){
        
        try(FileWriter fw= new FileWriter(RUTA_CSV);
                BufferedWriter bw = new BufferedWriter(fw);
                ){
            
            for (Cliente cliente : clientes){
                String renglon = cliente.getCedula()+SEPARADOR
                +cliente.getNombre()+SEPARADOR+
                cliente.getTelefono();

                bw.write(renglon);
                bw.newLine();
                //System.out.println("Lista sobrescrita con exitoso");
            }
            //System.out.println("Lista sobrescrita con exitoso");
            
        } catch (IOException ex) {
            //System.out.println("Error al sobrescribir la lista");
            return false;
        }
        
        
        return true;
    }
    
    //update
    public boolean update(Cliente cliente){
        ArrayList<Cliente> listadoCliente = getAllCliente();
        boolean existeCliente = false;
        for (Cliente item : listadoCliente){
            if (cliente.getCedula() == item.getCedula()){
                item.setCedula(cliente.getCedula());
                item.setNombre(cliente.getNombre());
                item.setTelefono(cliente.getTelefono());
                existeCliente = true;
            }
        }
        if (existeCliente){
            System.out.println("Cliente acutializado con exito.");
            return sobreEscribirArchivo(listadoCliente);
        }else{
            System.out.println("Cliente no encontrado");
            return false;
        }

    }
    
    //metodo delete
    public boolean deleteCliente(int cedula){
        
        ArrayList<Cliente> listadoClientes = getAllCliente();
        boolean existeCliente = false;
        existeCliente = listadoClientes.removeIf(cliente-> cliente.getCedula() == cedula);
      
        if (existeCliente){
            System.out.println("Cliente eliminado");
            return sobreEscribirArchivo(listadoClientes);
        }else{
            System.out.println("Cliente no encontrado");
            return false;
        } 
    }
    
    public void getClienteByCedula(int cedula){
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        //Cliente clienteSave = new Cliente();
        File archivo = new File(RUTA_CSV);
        
        if(!archivo.exists()){
            System.out.println("Este archvio no existe");

        }
        
        try(FileReader fr = new FileReader(RUTA_CSV);
                BufferedReader br = new BufferedReader(fr)){
            
            String linea;
            
            while((linea=br.readLine()) != null ){
                String[] campos = linea.split(SEPARADOR);
                
                Cliente cliente = new Cliente();
                
                cliente.setCedula(Integer.parseInt( campos[0]));
                cliente.setNombre(campos[1]);
                cliente.setTelefono(Integer.parseInt( campos[2]));

                listaClientes.add(cliente);
            }
            
            for (Cliente item : listaClientes){
                if (item.getCedula() == cedula){
                    System.out.println("Cliente Encontrado");
                    System.out.println(item.toString());
                    //return clienteSave;
                }
            }
            
        } catch (IOException ex) {
            System.out.println("No se puede leer.");
        }
        System.out.println("No hay cliente registrado");
        //return clienteSave;
    }
    
    //Leer clientes
    public ArrayList<Cliente> getAllCliente(){
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        File archivo = new File(RUTA_CSV);
        if(!archivo.exists()){
            System.out.println("Estte archivo no existe");
            return listaClientes;
        }
        
        try(FileReader fr = new FileReader(RUTA_CSV);
            BufferedReader br = new BufferedReader(fr)){
            
            String linea;
            
            System.out.println("* * * * * LISTADO DE CLIENTES * * * * *");
            while ((linea=br.readLine()) != null){
                String[] campos = linea.split(SEPARADOR);
                
                Cliente cliente = new Cliente();
                
                cliente.setCedula(Integer.parseInt(campos[0]));
                cliente.setNombre(campos[1]);
                cliente.setTelefono(Integer.parseInt(campos[2]));          
                listaClientes.add(cliente);

            }     
        } catch (IOException ex) {
            System.out.println("No se pudo leer");
        }
        return listaClientes;
    }
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(22121,"Massimo roy", 312822191) ;
        Cliente cliente2 = new Cliente(1,"Kendall Logan roy", 31282221) ;
        
        ClienteService clienteService = new ClienteService();
        //clienteService.create(cliente1);
        //clienteService.create(cliente2);
        //System.out.println(clienteService.getAllCliente());
        /*
        System.out.println("buscar");
        clienteService.getClienteByCedula(1);
        clienteService.findCliente(22121);
        clienteService.findCliente(2212154);
        */
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        
        cliente2.setNombre("Alejandro Magno");
        //cliente2.setCedula(9982);
        
        if (clienteService.update(cliente2)){
            System.out.println("cliente Actualizado");
        }else{
            System.out.println("No se actualizo");
        }
        
        
        /*
        if (clienteService.deleteCliente(1)){
            System.out.println("cliente eliminad0");
        }else{
            System.out.println("No se ha eliminado");
        }
        */
        //clienteService.getClienteByCedula(1);
                
      
    }
    
    
}
