package com.devsuperior.dsmeta.controllers;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    private static final String MIN_DATE = "minDate";
    private static final String MAX_DATE = "maxDate";

    @Autowired
    private SaleService saleService;

    @GetMapping
    public Page<Sale> findSales(
            @RequestParam(value = MIN_DATE, defaultValue = "") String minDate,
            @RequestParam(value = MAX_DATE, defaultValue = "") String maxDate,
            Pageable pageable) {
        return saleService.findSales(minDate, maxDate, pageable);
    }
}
