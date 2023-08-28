package com.examly.springapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.File;



@SpringBootTest(classes = SpringappApplication.class)

@AutoConfigureMockMvc

class SpringappApplicationTests {


@Autowired
   private  MockMvc mockMvc ;


   @Test
   void add() throws Exception {

	String st = "{\"customerId\": 1000,\"customerName\": \"Demo\", \"age\": 30,\"mobile\":1234567890,\"billId\": 1001}";
		mockMvc.perform(MockMvcRequestBuilders.post("/addDetails")
			   .contentType(MediaType.APPLICATION_JSON)
			   .content(st)
			   .accept(MediaType.APPLICATION_JSON))
			   .andExpect(MockMvcResultMatchers.status().isOk())
			   .andExpect(MockMvcResultMatchers.jsonPath("$").value(true));
   
			}


			@Test

			void testgetByID() throws Exception{
		
				 mockMvc.perform(get("/1000")
		
								.accept(MediaType.APPLICATION_JSON))
		
								.andDo(print())
		
								.andExpect(status().isOk())
		
								// .andExpect(jsonPath("$.customerId").value(1000))
		
								.andReturn();
		
			}	

			@Test

			void testgetAll() throws Exception{  
		
				 mockMvc.perform(get("/")
		
								.accept(MediaType.APPLICATION_JSON))
		
								.andDo(print())
		
								.andExpect(status().isOk())
		
								.andExpect(jsonPath("$").isArray())
		
								.andReturn();
		
			}

		@Test

    	public void controllerfolder() {

        String directoryPath = "src/main/java/com/examly/springapp/controller"; // Replace with the path to your directory

        File directory = new File(directoryPath);

        assertTrue(directory.exists() && directory.isDirectory());

    }

	@Test

    public void controllerfile() {

        String filePath = "src/main/java/com/examly/springapp/controller/ApiController.java";

        File file = new File(filePath);

        assertTrue(file.exists() && file.isFile());

    }


	@Test

    public void testModelFolder() {

        String directoryPath = "src/main/java/com/examly/springapp/model"; // Replace with the path to your directory

        File directory = new File(directoryPath);

        assertTrue(directory.exists() && directory.isDirectory());

    }

	@Test

    public void testModelFile() {

        String filePath = "src/main/java/com/examly/springapp/model/Bill.java";

        File file = new File(filePath);

        assertTrue(file.exists() && file.isFile());

    }

	@Test

    public void testModelFile1() {

        String filePath = "src/main/java/com/examly/springapp/model/Customer.java";

        File file = new File(filePath);

        assertTrue(file.exists() && file.isFile());

    }

	@Test

    public void testrepositoryfolder() {

        String directoryPath = "src/main/java/com/examly/springapp/repository"; // Replace with the path to your directory

        File directory = new File(directoryPath);

        assertTrue(directory.exists() && directory.isDirectory());

    }

   

    @Test

    public void testrepositoryFile() {

        String filePath = "src/main/java/com/examly/springapp/repository/BillRepo.java";

        // Replace with the path to your file

        File file = new File(filePath);

        assertTrue(file.exists() && file.isFile());

    }

	 @Test

    public void testrepositoryFile1() {

        String filePath = "src/main/java/com/examly/springapp/repository/CustomerRepo.java";

        // Replace with the path to your file

        File file = new File(filePath);

        assertTrue(file.exists() && file.isFile());

    }


    @Test

    public void testServiceFolder() {

        String directoryPath = "src/main/java/com/examly/springapp/service"; 

        File directory = new File(directoryPath);

        assertTrue(directory.exists() && directory.isDirectory());

    }

   

    @Test

    public void testServieFile() {

        String filePath = "src/main/java/com/examly/springapp/service/ApiService.java";

        // Replace with the path to your file

        File file = new File(filePath);

        assertTrue(file.exists() && file.isFile());

    }


			

   	
}








