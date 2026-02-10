package com.mateoortiz.RepuestosAutomotrices.service;

import com.mateoortiz.RepuestosAutomotrices.entity.Proveedor;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProveedoresService {

    List<Proveedor> getAllProveedores();

    Proveedor getProveedorById(Integer id);

    Proveedor saveProveedor (Proveedor proveedor) throws RuntimeException;

    Proveedor updateProveedor(Integer id, Proveedor proveedor);
    void deleteProveedor(Integer id);

}
