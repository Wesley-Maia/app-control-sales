package com.control.salesapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.control.salesapi.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
