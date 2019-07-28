package com.arkarmoe.springboot_lombok.controller;

import com.arkarmoe.springboot_lombok.entity.Company;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @GetMapping("/lists")
    public List<Company> getCompanyList(){

        List<Company> companyList = new ArrayList<>();

        /** Obj **/
        Company company1 = new Company();
        company1.setName("youtube");
        company1.setType("media");

        Company company2 = new Company();
        company2.setName("google");
        company2.setType("internet");

        companyList.add(company1);
        companyList.add(company2);

        return companyList;
    }
}
