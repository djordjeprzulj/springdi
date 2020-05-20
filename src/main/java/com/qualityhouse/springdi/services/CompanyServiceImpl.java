package com.qualityhouse.springdi.services;

import com.qualityhouse.springdi.domain.Company;
import com.qualityhouse.springdi.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public List<Company> getAll() {
        return this.companyRepository.findAll();
    }

    @Override
    public Page<Company> getPaged(Pageable pageable) {
        return this.companyRepository.findAll(pageable);
    }

    @Override
    public List<Company> getByName(String name) {
        return this.companyRepository.findByName(name);
    }

    @Override
    public ResponseEntity<Company> insert(Company company) {
        if (this.companyRepository.existsById(company.getId())) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        } else {
            this.companyRepository.save(company);
            return new ResponseEntity<>(company, HttpStatus.OK);
        }
    }

    @Override
    public ResponseEntity<Company> update(Company company, Integer id) {
        if (!this.companyRepository.existsById(company.getId())) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            this.companyRepository.save(company);
            return new ResponseEntity<>(company, HttpStatus.OK);
        }
    }

    @Override
    public void delete(Integer id) {
        if (this.companyRepository.existsById(id)) {
            this.companyRepository.deleteById(id);
        } else {
            throw new RuntimeException("Ne postoji kompanija sa id=" + id);
        }
    }


}
