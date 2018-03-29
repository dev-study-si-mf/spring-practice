package jp.co.mforce.sample.springpractice.dao;

import jp.co.mforce.sample.springpractice.entity.Customer;
import org.seasar.doma.Dao;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@ConfigAutowireable
@Dao
public interface CustomerDao {

    // TODO DBにアクセスするメソッドを定義しましょう
    public List<Customer> selectAll();

    public Customer selectById(String id);
}
