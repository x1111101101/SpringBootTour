package io.github.x1111101101.web;


import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {

    @Autowired // Bean 주입
    private MockMvc mvc;

    @Test
    public void returns_hello() throws Exception {
        String hello = "hello";
        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

    @Test
    public void returns_helloDto() throws Exception {
        String name = "hello";
        int amount = 123;
        mvc.perform(
                get("/hello/dto")
                        .param("name", name)
                        .param("amount", String.valueOf(amount))
                ).andExpect(status().isOk())
                .andExpect(jsonPath("$.name", Is.is(name)))
                .andExpect(jsonPath("$.amount", Is.is(amount)));
    }

}
