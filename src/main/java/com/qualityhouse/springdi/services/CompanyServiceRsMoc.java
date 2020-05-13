package com.qualityhouse.springdi.services;

import com.qualityhouse.springdi.domain.Company;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Profile("RS")
public class CompanyServiceRsMoc implements CompanyService {


    @Override
    public List<Company> getAll() {
        ArrayList<Company> data = new ArrayList<>();
        data.add(new Company(1, "Nordeus"));
        data.add(new Company(2, "Quality House"));
        data.add(new Company(3, "Inforce"));
        return data;
    }
}
