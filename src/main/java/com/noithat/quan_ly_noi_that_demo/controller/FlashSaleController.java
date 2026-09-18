package com.noithat.quan_ly_noi_that_demo.controller;

import com.noithat.quan_ly_noi_that_demo.entity.FlashSale;
import com.noithat.quan_ly_noi_that_demo.service.FlashSaleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flash-sale")
public class FlashSaleController {

    private final FlashSaleService flashSaleService;

    public FlashSaleController(FlashSaleService flashSaleService) {
        this.flashSaleService = flashSaleService;
    }

    @GetMapping
    public List<FlashSale> getAll() {
        return flashSaleService.getAll();
    }

    @GetMapping("/{id}")
    public FlashSale getById(@PathVariable Integer id) {
        return flashSaleService.getById(id);
    }

    @PostMapping
    public FlashSale create(@RequestBody FlashSale flashSale) {
        return flashSaleService.create(flashSale);
    }

    @PutMapping("/{id}")
    public FlashSale update(
            @PathVariable Integer id,
            @RequestBody FlashSale flashSale) {

        return flashSaleService.update(id, flashSale);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        flashSaleService.delete(id);
    }
}