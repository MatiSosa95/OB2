package com.example.Ejercicio101112.Controller;

import com.example.Ejercicio101112.Entity.Laptop;
import com.example.Ejercicio101112.Repository.LaptopRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    private final LaptopRepository lr;

    public LaptopController(LaptopRepository lr) {
        this.lr = lr;
    }

    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return lr.findAll();
    }

    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable("id") Long id){
        Optional<Laptop> lap= lr.findById(id);
        if (lap.isPresent()){
            return ResponseEntity.ok(lap.get());
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/api/create")
    public ResponseEntity<Laptop> create(@RequestBody Laptop laptop){

        if (laptop.getId()!=null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(lr.save(laptop));
    }
    @PutMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> update(@PathVariable Long id,@RequestBody Laptop laptop){
        if (id== laptop.getId()){
            return ResponseEntity.ok(lr.save(laptop));
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> deleteById(@PathVariable("id") Long id){
        if (!lr.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        lr.deleteById(id);
        return  ResponseEntity.noContent().build();

    }
    @DeleteMapping("/api/laptops")
    public void deleteAll(){
        lr.deleteAll();
    }
}
