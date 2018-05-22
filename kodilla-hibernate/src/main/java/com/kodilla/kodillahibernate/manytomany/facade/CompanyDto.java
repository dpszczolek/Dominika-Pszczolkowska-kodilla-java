package com.kodilla.kodillahibernate.manytomany.facade;

import com.kodilla.kodillahibernate.manytomany.Employee;

import java.util.ArrayList;
import java.util.List;

public final class CompanyDto {
    private final int id;
    private final String name;
    private final List<Employee> employees = new ArrayList<>();

    public CompanyDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void searchByCompanyNameSubstring(String name) {

    }
}
