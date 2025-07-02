package com.tecdesoftware.market.persistence;

import com.tecdesoftware.market.persistence.crud.ProductoCrudRepository;
import com.tecdesoftware.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
//Le dice a Spring que este repositorio se conecta con la
@Repository
public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    //me va a dar todos los productos de mi BD
    public List<Producto> getAll() {
        //  Convirtiendo un Iterable <T> a una lista de productos List <Producto>
        return (List<Producto>) productoCrudRepository.findAll();
    }
    //Obtener los productos por categoria
    public List<Producto> getByCategoria(int idCategoria) {
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }
    public Optional<List<Producto>> getEscasos (int cantidad) {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado (cantidad, true);
    }

    //Obtener un productir dado el id
    public Optional<Producto> getProductoById(int idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    //Guarda un producto
    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    //Eliminar un producto
    public void delete(Producto producto) {
        productoCrudRepository.delete(producto);
    }
}
