/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Farmacia.Farmacia.service;

/**
 *
 * @author franf
 */
import Farmacia.Farmacia.service.*;
import Farmacia.Farmacia.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    // Se obtiene un listado de categorias en un List
    public List<Producto> getProductos(boolean activos);
 
}
