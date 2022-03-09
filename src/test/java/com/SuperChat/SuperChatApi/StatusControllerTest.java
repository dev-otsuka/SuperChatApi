package com.SuperChat.SuperChatApi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
public class StatusControllerTest {

  private static final String TARGET_API_URI = "/status";

  @Autowired
  MockMvc mockMvc;

  @BeforeEach
  void setUp(){
    this.mockMvc = MockMvcBuilders.standaloneSetup(new StatusController()).build();
  }

  @Test
  void success() throws Exception{
    mockMvc.perform(MockMvcRequestBuilders.get(TARGET_API_URI))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().json("{'status':'ok'}"));
  }

}
