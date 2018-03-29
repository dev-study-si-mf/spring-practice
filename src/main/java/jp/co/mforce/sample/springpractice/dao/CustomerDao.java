package jp.co.mforce.sample.springpractice.dao;

import jp.co.mforce.sample.springpractice.entity.Customer;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
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
}
