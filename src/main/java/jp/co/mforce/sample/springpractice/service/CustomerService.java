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

    @Autowired
    private CustomerDao customerDao;

    // TODO ビジネスロジックを書きましょう
    public List<Customer> selectAll(){
        return customerDao.selectAll();
    }

    public Customer selectById(String id){
        return customerDao.selectById(id);
    }

    public int insertCustomer(Customer customer){
        return customerDao.insertCustomer(customer);
    }

    public int updateCustomer(String id,CustomerForm form){
        Customer customer = customerDao.selectById(id);
        int countUpdate = 0;
        if(customer != null){
            customer.name = form.getName();
            customer.email = form.getEmail();
            countUpdate = customerDao.updateCustomer(customer);
        }

        return countUpdate;
    }

    public int deleteCustomer(String id){
        Customer customer = customerDao.selectById(id);
        int countDelete = 0;
        if(customer != null){
            countDelete = customerDao.deleteCustomer(customer);
        }

        return countDelete;
    }
}
