package com.qualityhouse.springdi.services;

import com.qualityhouse.springdi.domain.Company;
import com.qualityhouse.springdi.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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


}
