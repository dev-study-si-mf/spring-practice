package jp.co.mforce.sample.springpractice.service;

import jp.co.mforce.sample.springpractice.dao.CustomerDao;
import jp.co.mforce.sample.springpractice.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
