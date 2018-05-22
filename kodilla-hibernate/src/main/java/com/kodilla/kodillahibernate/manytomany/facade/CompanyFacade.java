package com.kodilla.kodillahibernate.manytomany.facade;

import com.kodilla.kodillahibernate.manytomany.Company;
import com.kodilla.kodillahibernate.manytomany.Employee;
import com.kodilla.kodillahibernate.manytomany.dao.CompanyDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class CompanyFacade {

    @Autowired
    private Company company;

    @Autowired
    private Employee employee;

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);

    public void searchCompanyByString (final CompanyDao company) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter part of company name: ");
        String substring = input.nextLine();
        LOGGER.info("Looking for a company...");
        try {
            for(Company cmp: company.getName()) {
                searchCompanyByString(company) like %;
            }
        }

    }
}
