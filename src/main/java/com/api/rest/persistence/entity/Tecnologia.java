package com.api.rest.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tecnologias")
public class Tecnologia {

    @Column(name = "id_tecnologia")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTecnologia;

    @Column(name = "nombre_tecnologia")
    private String nombreTecnologia;

    private Boolean estado;

    @OneToMany(mappedBy = "tecnologia")
    private List<Producto> productos;

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    //G & S
    public Integer getIdTecnologia() {
        return idTecnologia;
    }

    public void setIdTecnologia(Integer idTecnologia) {
        this.idTecnologia = idTecnologia;
    }

    public String getNombreTecnologia() {
        return nombreTecnologia;
    }

    public void setNombreTecnologia(String nombreTecnologia) {
        this.nombreTecnologia = nombreTecnologia;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
