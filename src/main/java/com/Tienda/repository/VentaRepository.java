package com.Tienda.repository;

import com.tienda.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Integer>{
    
}
