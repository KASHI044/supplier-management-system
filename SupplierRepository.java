package com.makersharks.repository;
import com.makersharks.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import java.util.List;


public interface SupplierRepository extends JpaRepository<Supplier, Long> 
{
    List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcesses
    (
        String location, 
        String natureOfBusiness, 
        String manufacturingprocess
     );
}
