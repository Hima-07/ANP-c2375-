package com.project.servicetest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.project.entity.Customer;
import com.project.repository.CustomerRepository;
import com.project.service.CustomerService;

@SpringBootTest
public class CustomerServiceTest {

	@Autowired
	private CustomerService cServ;
	
	@MockBean
	private CustomerRepository cRepo;
	
	//testing save Customer method of Customer Service Class
	@Test
	public void testSaveCustomer() {
		Customer c = new Customer();
		c.setCId(1);
		c.setCName("Hima");
		c.setCAdress("Chandrapur");
		c.setCEmail("hima@gmail.com");
		c.setCNumber(7770031);
	
		Mockito.when (cRepo.save(c)).thenReturn(c);
		assertThat (cServ.saveCustomer(c)).isEqualTo(c);
	}
	
	//testing getAllPessenger() method  of Passenger Service
	@Test
	public void testgetAllCustomer() {
		Customer c = new Customer();
		c.setCId(1);
		c.setCName("Hima");
		c.setCAdress("Chandrapur");
		c.setCEmail("hima@gmail.com");
		c.setCNumber(7770031);
		
		Customer c1 = new Customer();
		c1.setCId(2);
		c1.setCName("sharma");
		c1.setCAdress("mumbai");
		c1.setCEmail("sharma@gmail.com");
		c1.setCNumber(53411762);
		
		Customer c2 = new Customer();
		c2.setCId(3);
		c2.setCName("rohit");
		c2.setCAdress("shimla");
		c2.setCEmail("rohit@gmail.com");
		c2.setCNumber(7778888);
		
		List<Customer> al = new ArrayList<Customer>();
		al.add(c);
		al.add(c1);
		al.add(c2);
		
		Mockito.when(cRepo.findAll()).thenReturn(al);
		assertThat(cServ.displayAllCustomer()).isEqualTo(al);
	}
	
	//testing get Customer By Id method of Customer Service Class
	@Test
	public void testgetPassengerById() {
		Customer c = new Customer();
		c.setCId(1);
		c.setCName("Hima");
		c.setCAdress("Chandrapur");
		c.setCEmail("hima@gmail.com");
		c.setCNumber(7770031);
		
		Optional<Customer> a = Optional.of(c);
		Customer ua = a.get();
		
		Mockito.when(cRepo.findById(1)).thenReturn(a);
		assertThat(cServ.getCustomerById(1)).isEqualTo(ua);
	}
	
	//testing update Customer by Id method of Customer Service Class
	@Test
	public void testupdateCustomerById() {
		Customer c = new Customer();
		c.setCId(1);
		c.setCName("Hima");
		c.setCAdress("Chandrapur");
		c.setCEmail("hima@gmail.com");
		c.setCNumber(7770031);
		
		Optional<Customer> oc = Optional.of(c);
		Customer cc=oc.get();
		
		Mockito.when(cRepo.findById(1)).thenReturn(oc);
		
		c.setCNumber(1221212);
		
		Mockito.when(cRepo.save(cc)).thenReturn(cc);
		assertThat(cServ.updateCustomerById(1, cc)).isEqualTo(cc);
	}
	
	//testing update Customer by Id method of Customer Service Class
		@Test
		public void testdeleteCustomerById() {
			Customer c = new Customer();
			c.setCId(1);
			c.setCName("Hima");
			c.setCAdress("Chandrapur");
			c.setCEmail("hima@gmail.com");
			c.setCNumber(7770031);
	
			Optional<Customer> oc = Optional.of(c);
			
			Mockito.when(cRepo.existsById(1)).thenReturn(false);
			assertThat(cRepo.existsById(oc.get().getCId()));
		}
}
