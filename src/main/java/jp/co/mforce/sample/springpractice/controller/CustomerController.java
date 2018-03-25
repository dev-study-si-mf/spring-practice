package jp.co.mforce.sample.springpractice.controller;

import jp.co.mforce.sample.springpractice.entity.Customer;
import jp.co.mforce.sample.springpractice.form.CustomerForm;
import jp.co.mforce.sample.springpractice.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("customer")
public class CustomerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    CustomerService customerService;

    @ModelAttribute
    CustomerForm setupForm() {
        return new CustomerForm();
    }

    @GetMapping
    String list(Model model) {
        List<Customer> customers = customerService.selectAll();
        model.addAttribute("customer", customers);

        return "customer/list";
    }

    @PostMapping(path = "create")
    String create(@Validated CustomerForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return list(model);
        }

        Customer customer = new Customer();
//        BeanUtils.copyProperties(form, customer);
        customer.id = UUID.randomUUID().toString().replace("-","");
        customer.name = form.getName();
        customer.email = form.getEmail();
        LOGGER.info("form : {}", form);
        LOGGER.info("customer : {}", customer);
        customerService.create(customer);
        return "redirect:/customer";
    }

    @GetMapping(path = "edit", params = "form")
    String editForm(@RequestParam String id, CustomerForm customerForm) {
        Customer customer = customerService.selectById(id);
        customerForm.setName(customer.name);
        customerForm.setEmail(customer.email);
        return "customer/edit";
    }

    @PostMapping(path = "edit")
    String edit(@RequestParam String id, @Validated CustomerForm customerForm, BindingResult result) {
        if (result.hasErrors()) {
            return editForm(id, customerForm);
        }

        Customer customer = new Customer();
        customer.id = id;
        customer.name = customerForm.getName();
        customer.email = customerForm.getEmail();
        customerService.update(customer);

        return "redirect:/customer";
    }

    @PostMapping(path = "edit", params = "goToTop")
    String goToTop() {
        return "redirect:/customer";
    }

    @PostMapping(path = "delete")
    String delete(@RequestParam String id) {
        Customer customer = customerService.selectById(id);
        if (customer != null) {
            customerService.delete(customer);
        }
        return "redirect:/customer";
    }

}
