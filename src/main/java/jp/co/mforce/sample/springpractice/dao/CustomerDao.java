package jp.co.mforce.sample.springpractice.dao;

import jp.co.mforce.sample.springpractice.entity.Customer;
import org.seasar.doma.*;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@ConfigAutowireable
@Dao
public interface CustomerDao {

    @Select
    List<Customer> selectAll();

    @Select
    Customer selectById(String id);

    @Insert
    int insert(Customer customer);

    @Update
    int update(Customer customer);

    @Delete
    int delete(Customer customer);
}
