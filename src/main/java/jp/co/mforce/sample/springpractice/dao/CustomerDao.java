package jp.co.mforce.sample.springpractice.dao;

import jp.co.mforce.sample.springpractice.entity.Customer;
import org.seasar.doma.*;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@ConfigAutowireable
@Dao
public interface CustomerDao {

    // TODO DBにアクセスするメソッドを定義しましょう
    @Select
    public List<Customer> selectAll();

    @Select
    public Customer selectById(String id);

    @Insert
    public int insertCustomer(Customer customer);

    @Update
    public int updateCustomer(Customer customer);

    @Delete
    public int deleteCustomer(Customer customer);
}
