package jp.co.mforce.sample.springpractice.entity;



import org.seasar.doma.*;



@Entity

public class Customer {



    // TODO テーブル定義にあったフィールドを設定しましょう

    @Id

    public String id;

    public String email;

    public String name;

}