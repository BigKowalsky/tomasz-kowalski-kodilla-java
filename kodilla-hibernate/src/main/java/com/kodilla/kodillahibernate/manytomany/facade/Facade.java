package com.kodilla.kodillahibernate.manytomany.facade;

import com.kodilla.kodillahibernate.manytomany.Company;
import com.kodilla.kodillahibernate.manytomany.Employee;
import com.kodilla.kodillahibernate.manytomany.dao.CompanyDao;
import com.kodilla.kodillahibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    @Autowired
    public Facade(final CompanyDao companyDao, final EmployeeDao employeeDao){
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> selectCompanies(String name) {
        return companyDao.selectCompaniesName(name);
    }

    public List<Employee> selectEmployees(final String name) {
        return employeeDao.selectEmployeesName(name);
    }
}
