package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class SearchFacade {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public List<Employee>retrieveEmployeeByFewLetters (final String someLetters) throws SearchProcessingException {
        LOGGER.info("Searching in employees by lastname");
        List<Employee> employees = employeeDao.retrieveEmployeeByFewLetters(someLetters);
        int employeesAmount = employees.size();
        if (employeesAmount == 0) {
            LOGGER.error(SearchProcessingException.ERR_DONT_FOUND);
            throw new SearchProcessingException(SearchProcessingException.ERR_DONT_FOUND);
        }
        return employees;
    }

    public List<Company> retrieveCompanyByFewLetters (final String someLetters) throws SearchProcessingException {
        LOGGER.info("Searching in companies by name");
        List<Company> companies = companyDao.retrieveCompanyByFewLetters(someLetters);
        int companiesAmount = companies.size();
        if (companiesAmount == 0) {
            LOGGER.error(SearchProcessingException.ERR_DONT_FOUND);
            throw new SearchProcessingException(SearchProcessingException.ERR_DONT_FOUND);
        }
        return companies;
    }
}
