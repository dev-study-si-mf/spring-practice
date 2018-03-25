package jp.co.mforce.sample.springpractice.dao;

import jp.co.mforce.sample.springpractice.entity.Customer;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
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
}
