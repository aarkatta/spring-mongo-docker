package com.microservices.project.controller;


import com.microservices.project.business.abstracts.ProductService;
import com.microservices.project.product.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public ResponseEntity finaAll() {
        return new ResponseEntity<>(this.productService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity findById(@PathVariable(value="id") String id) {

        return new ResponseEntity<>(this.productService.findById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity create(@RequestBody Product newProduct) {
        return new ResponseEntity<>(this.productService.create(newProduct), HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity update(@PathVariable(value = "id") String id, @RequestBody Product newProduct) {
        return new ResponseEntity<>(this.productService.update(id, newProduct), HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity delete(@PathVariable(value = "id") String id) {
        return new ResponseEntity(this.productService.delete(id), HttpStatus.OK);
    }


}
