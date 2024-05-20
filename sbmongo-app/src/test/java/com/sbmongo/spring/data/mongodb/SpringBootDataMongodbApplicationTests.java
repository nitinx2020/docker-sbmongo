package com.sbmongo.spring.data.mongodb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
@AutoConfigureMockMvc
class SpringBootDataMongodbApplicationTests {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	void testGetAllTutorials() {
		
		try {
			mvc.perform(MockMvcRequestBuilders.get("/api/tutorials").accept(MediaType.APPLICATION_JSON))
			.andExpect(MockMvcResultMatchers.status().isOk());
		} catch(Exception e) {
		}
	}

	@Test
	void contextLoads() {
	}

}
