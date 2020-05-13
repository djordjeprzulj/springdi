package com.qualityhouse.springdi.services;

import com.qualityhouse.springdi.domain.Company;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Override
    public List<Company> getAll() {
        return new ArrayList<>();
    }
}
