package com.abelhzo.client.bus.tests;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.abelhzo.client.bus.commons.ConfigJAX;
import com.abelhzo.client.bus.commons.Language;
import com.abelhzo.client.bus.commons.ResponseWrapper;
import com.abelhzo.client.bus.roles.RolRS;
import com.abelhzo.client.bus.roles.RolesServiceSOAP;
import com.abelhzo.client.bus.users.UsersServiceSOAP;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:api-ws-clients-config/users-ws-service.xml",
		"classpath:api-ws-clients-config/roles-ws-service.xml"
		})
@TestExecutionListeners(listeners = {DependencyInjectionTestExecutionListener.class})
public class IntegrationTest {

	@Autowired
	private UsersServiceSOAP usersServiceSOAP;
	
	@Autowired
	private RolesServiceSOAP rolesServiceSOAP;

	@Test
	public void getUsersServiceSOAP() {
		Assert.assertNotNull(usersServiceSOAP);
	}
	
	@Test
	public void getRolesServiceSOAP() {
		Assert.assertNotNull(rolesServiceSOAP);
		ConfigJAX config = new ConfigJAX();
		config.setIduser(45654);
		config.setIp("192.168");
		config.setLanguage(Language.SPA);
		
		ResponseWrapper response = (ResponseWrapper) rolesServiceSOAP.listRolSOAP(config);
		List<Object> lista = response.getResultslist();
		
		for(Object obj : lista) {
			RolRS rol = (RolRS) obj;
			System.out.println(rol.getIdrol());
			System.out.println(rol.getRol());
			System.out.println(rol.getRegisterdate());
			System.out.println(rol.getUpdatedate());
		}
		
	}
	
}
