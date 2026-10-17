package com.pcfactory.ventas.repository;

import com.pcfactory.ventas.entity.VentaProducto;
import org.springframework.data.jpa.repository.JpaRepository;

//Es Long porque en Ventaproducto esta como Long la ID
public interface VentaProductoRepository extends JpaRepository<VentaProducto, Long> {

}