package com.makersharks.controller;
import jakarta.validation.Valid;

import com.makersharks.dto.SupplierRequest;
import com.makersharks.entity.Supplier;
import com.makersharks.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {
    
    @Autowired
    private SupplierRepository supplierRepository;

    // Existing POST method
    @PostMapping("/query")
    public ResponseEntity<List<Supplier>> getSuppliers(@RequestBody @Valid SupplierRequest request) {
        List<Supplier> suppliers = supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcesses(
            request.getLocation(), request.getNatureOfBusiness(), request.getProcess());
        return ResponseEntity.ok(suppliers);
    }



    // New GET method
    @GetMapping("/all")
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }
}






