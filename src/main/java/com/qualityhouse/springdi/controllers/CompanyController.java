package com.qualityhouse.springdi.controllers;

import com.qualityhouse.springdi.domain.Company;
import com.qualityhouse.springdi.services.CompanyService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<Company> getAll() {
        return this.companyService.getAll();
    }

    @GetMapping("/{id}")
    public Company getById(@PathVariable Integer id) {
        return this.companyService.findById(id);
    }

    @GetMapping("/paged")
    public Page<Company> getPaged(Pageable pageable) {
        return this.companyService.getPaged(pageable);
    }

    @GetMapping("/byName/{name}")
    public List<Company> getByName(@PathVariable String name) {
        return this.companyService.getByName(name);
    }

    @PostMapping
    public ResponseEntity<Company> insert(@RequestBody Company company) {
        return this.companyService.insert(company);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Company> update(@RequestBody Company company, @PathVariable Integer id) {
        return this.companyService.update(company, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        this.companyService.delete(id);
    }
}
