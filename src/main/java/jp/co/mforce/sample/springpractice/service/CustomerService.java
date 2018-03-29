package jp.co.mforce.sample.springpractice.service;



import jp.co.mforce.sample.springpractice.dao.CustomerDao;

import jp.co.mforce.sample.springpractice.entity.Customer;

import jp.co.mforce.sample.springpractice.form.CustomerForm;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;



import java.util.List;





@Service

public class CustomerService {



    // TODO ビジネスロジックを書きましょう

    @Autowired

    CustomerDao customerDao;



    public List<Customer> selectAll(){



        List<Customer> customerList = customerDao.selectAll();



        return customerList;

    };



    public Customer selectById(String id) {



        Customer customer = customerDao.selectById(id);



        return customer;



    }



    @Transactional

    public int insertCustomer(Customer customer){

        return customerDao.insertCustomer(customer);

    }



    @Transactional

    public int updateCustomer(String id, CustomerForm form){

        Customer customer = customerDao.selectById(id);

        customer.name = form.getName();

        customer.email = form.getEmail();



        int countUpdate = 0;

        if(customer != null){

            countUpdate = customerDao.updateCustomer(customer);

        }

        return countUpdate;

    }



    @Transactional

    public int deleteCustomer(String id){

        Customer customer = customerDao.selectById(id);

        int countDelete = 0;

        if(customer != null){

            countDelete = customerDao.deleteCustomer(customer);

        }

        return countDelete;

    }

}