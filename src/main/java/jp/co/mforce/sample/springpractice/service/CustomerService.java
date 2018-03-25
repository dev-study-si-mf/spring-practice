package jp.co.mforce.sample.springpractice.service;

import jp.co.mforce.sample.springpractice.dao.CustomerDao;
import jp.co.mforce.sample.springpractice.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerService {


    @Autowired
    CustomerDao customerDao;

    public List<Customer> selectAll() {
        return customerDao.selectAll();
    }

    public Customer selectById(String id) {
        return customerDao.selectById(id);
    }

    @Transactional
    public void create(Customer customer) {
        customerDao.insert(customer);
    }
}
