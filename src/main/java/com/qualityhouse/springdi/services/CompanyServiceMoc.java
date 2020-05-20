package com.qualityhouse.springdi.services;

import com.qualityhouse.springdi.domain.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyServiceMoc implements CompanyService {


    @Override
    public List<Company> getAll() {
        ArrayList<Company> data = new ArrayList<>();
        data.add(new Company(1, "Oracle"));
        data.add(new Company(2, "Microsoft"));
        data.add(new Company(3, "Apple"));
        return data;
    }

    @Override
    public Page<Company> getPaged(Pageable pageable) {
        return null;
    }

    @Override
    public List<Company> getByName(String name) {
        return null;
    }

    @Override
    public ResponseEntity<Company> insert(Company company) {
        return null;
    }

    @Override
    public ResponseEntity<Company> update(Company company, Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
