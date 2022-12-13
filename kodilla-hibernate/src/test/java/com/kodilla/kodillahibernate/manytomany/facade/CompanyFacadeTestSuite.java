package com.kodilla.kodillahibernate.manytomany.facade;

import com.kodilla.kodillahibernate.manytomany.Company;
import com.kodilla.kodillahibernate.manytomany.Employee;
import com.kodilla.kodillahibernate.manytomany.dao.CompanyDao;
import com.kodilla.kodillahibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class CompanyFacadeTestSuite {

        @Autowired
        private Facade facade;
        @Autowired
        private CompanyDao companyDao;
        @Autowired
        private EmployeeDao employeeDao;

        @Test
        public void testSelectCompanies() {
            //Given
            Company softwareMachine = new Company("Software Machine");
            Company dataMaesters = new Company("Data Maesters");
            Company greyMatter = new Company("Grey Matter");

            companyDao.save(softwareMachine);
            companyDao.save(dataMaesters);
            companyDao.save(greyMatter);

            //When
            List<Company> facadeResult = facade.selectCompanies("ma");

            //Then
            assertEquals(3, facadeResult.size());

            //CleanUp
            companyDao.delete(softwareMachine);
            companyDao.delete(dataMaesters);
            companyDao.delete(greyMatter);
        }

        @Test
        public void testSelectEmployees() {
            //Given
            Employee johnSmith = new Employee("John", "Smith");
            Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
            Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

            employeeDao.save(johnSmith);
            employeeDao.save(stephanieClarckson);
            employeeDao.save(lindaKovalsky);

            //When
            List<Employee> facadeResult = facade.selectEmployees("kov");

            //Then
            assertEquals(1, facadeResult.size());

            //CleanUp
            employeeDao.delete(johnSmith);
            employeeDao.delete(stephanieClarckson);
            employeeDao.delete(lindaKovalsky);
        }
}
