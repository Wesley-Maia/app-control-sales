package com.control.salesapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.control.salesapi.entities.Sale;
import com.control.salesapi.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepository;

	public List<Sale> findAll() {
		return saleRepository.findAll();
	}

}
