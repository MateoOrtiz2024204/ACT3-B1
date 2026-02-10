package com.mateoortiz.RepuestosAutomotrices.repository;

import com.mateoortiz.RepuestosAutomotrices.entity.Empleado;
import com.mateoortiz.RepuestosAutomotrices.entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedoresRepository extends JpaRepository<Proveedor,Integer> {
}
