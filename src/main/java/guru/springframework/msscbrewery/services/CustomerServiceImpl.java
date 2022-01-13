package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder().id(customerId).name("bob").build();
    }

    @Override
    public CustomerDTO saveNewCustomer(CustomerDTO customerDTO) {
        customerDTO.setId(UUID.randomUUID());
        return customerDTO;
    }

    @Override
    public void deleteById(UUID customerId) {
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDTO customerDTO) {
    }
}
