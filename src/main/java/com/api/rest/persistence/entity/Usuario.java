package com.api.rest.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    private String id;

    private String password;

    private String nombre;

    private String apellidos;

    @Column(name = "num_telefonico")
    private Integer numTelefonico;

    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @OneToMany(mappedBy = "usuario")
    private List<Compra> compras;


    //G&S
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Integer getNumTelefonico() {
        return numTelefonico;
    }

    public void setNumTelefonico(Integer numTelefonico) {
        this.numTelefonico = numTelefonico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
