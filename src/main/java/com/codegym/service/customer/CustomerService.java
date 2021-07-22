package com.codegym.service.customer;

import com.codegym.model.Customer;
import com.codegym.model.Province;
import com.codegym.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service //// đánh dấu @Service tự động tiêm interface này vào Spring Container quản lý
public class CustomerService implements ICustomerService {
    @Autowired
    // gọi repository tương ứng ra từ Spring Container, như mọi người thấy, các phương thức được repo cung cấp sẵn
    // không cần viết gì
    private ICustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    } // iterable là lớp cha của các collection trong java

    @Override
    public Optional<Customer> findById(Long id) {

        return customerRepository.findById(id);
    }
    //optional là kiểu dữ liệu đặc biệt, có thể kiểm tra dữ liệu là null hay không

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }
    // phương thức save này sẽ kiểm tra xem đối tượng truyền vào có id tồn tại chưa,
    // rồi thì cập nhật
    // chưa thì thêm mới

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }
}