package com.api.rest.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table (name= "compras")
public class Compra {

    @Column(name= "id_compra")
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer idCompra;

    @Column(name = "id_usuario")
    private String idUsuario;

    private LocalDateTime fecha;

    @Column(name="medio_pago")
    private String medioPago;

    private String comentario;

    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_usuario", insertable = false,updatable = false)
    private Usuario usuario;

    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> productos;


    //Getters and Setters
    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
