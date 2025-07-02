package com.tecdesoftware.market.persistence.crud;

import com.tecdesoftware.market.persistence.entity.Producto;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    //Query Methods
    //SQL: Select
    // FROM Categoria
    //WHERE Id_Categoria= ?
    //ORDER BY Nombre ASC
    List<Producto> findByIdCategoriaOrderByNombreAsc (int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado (int cantidadStock, boolean estado);

}
