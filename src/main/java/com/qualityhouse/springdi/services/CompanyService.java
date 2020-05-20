package com.qualityhouse.springdi.services;

import com.qualityhouse.springdi.domain.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CompanyService {

    List<Company> getAll();

    Page<Company> getPaged(Pageable pageable);

    List<Company> getByName(String name);

    ResponseEntity<Company> insert(Company company);

    ResponseEntity<Company> update(Company company, Integer id);

    void delete(Integer id);

    Company findById(Integer id);
}
