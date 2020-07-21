package com.cognizant.academy.qbthon.controller;

import java.util.List;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.cognizant.academy.qbthon.QBThonApplicationTests;
import com.cognizant.academy.qbthon.model.Events;
import com.cognizant.academy.qbthon.service.EventsService;


public class EventsControllerTests extends QBThonApplicationTests{
	
	private MockMvc mockMvc;

	/*
	 * @MockBean private EventsService eventsService;
	 */	
	
	@Autowired
	private WebApplicationContext webApplicationContext;

	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	/*
	 * @Test public void testGetEvents() throws Exception {
	 * 
	 * mockMvc.perform(get("/api/events")).andExpect(status().isOk())
	 * .andExpect(content().contentType("application/json;charset=UTF-8"));
	 * 
	 * }
	 */

	private List<Events> getEvents() {
		// TODO Auto-generated method stub
		return null;
	}

}
