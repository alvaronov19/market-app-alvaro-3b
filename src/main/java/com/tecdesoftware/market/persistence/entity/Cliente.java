package com.tecdesoftware.market.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name= "clientes")
public class Cliente {

    @Id
    // Ejemplo que no lleva GeneratedValue

    private String id;
    private String nombre;
    private String apellidos;
    private String direccion;
    private Long telefono;

    @Column(name= "correo electronico")
    private String correoElectronico;

    //Aqui se conecta con la entidad compra
    @OneToMany (mappedBy = "cliente")
    private List<Compra> compras;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
