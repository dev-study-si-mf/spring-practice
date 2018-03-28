package jp.co.mforce.sample.springpractice.form;


import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class CustomerForm {

    @NotNull
    @Size(min = 1, max = 256)
    private String name;

    @NotNull
    @Size(min = 1, max = 256)
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
