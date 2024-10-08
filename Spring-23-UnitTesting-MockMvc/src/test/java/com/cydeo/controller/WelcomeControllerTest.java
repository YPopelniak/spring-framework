package com.cydeo.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.junit.jupiter.api.Assertions.*;
@WebMvcTest(WelcomeController.class)
class WelcomeControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void welcome() throws Exception {

        RequestBuilder request = MockMvcRequestBuilders.get("/welcome")
                .accept(MediaType.APPLICATION_JSON);

       MvcResult mvcResult = mvc.perform(request).andReturn();
       assertEquals(200,mvcResult.getResponse().getStatus());
       assertEquals("welcome",mvcResult.getResponse().getContentAsString());

    }

    @Test
    void welcome2() throws Exception {

        RequestBuilder request = MockMvcRequestBuilders.get("/welcome")
                .accept(MediaType.APPLICATION_JSON);

      mvc.perform(request)
              .andExpect(status().isOk())
              .andExpect(content().string("welcome"))
              .andReturn();
    }

}