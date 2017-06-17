package sharerrand.api.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import sharerrand.api.dao.TestDAO;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.client.ExpectedCount.times;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TestControllerTest {

    @Mock
    private TestDAO testDAO;

    @Spy
    @InjectMocks
    private TestController testController;

    private MockMvc mockMvc;
    private ObjectMapper objectMapper = new ObjectMapper();


    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(testController).build();
    }

    @Test
    public void insertTest() throws Exception {
        String returnValue = "correctValue";
        String body = "{\"name\":\"correctValue\"}";
        sharerrand.api.models.Test test = new sharerrand.api.models.Test(returnValue);
        String expected = objectMapper.writeValueAsString(test);

        doReturn(test).when(testDAO).save(any(sharerrand.api.models.Test.class));
        MvcResult mvcResult = mockMvc.perform(post("/test")
                .content(body)
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andReturn();

        assertEquals(expected, mvcResult.getResponse().getContentAsString());
        verify(testDAO).save(any(sharerrand.api.models.Test.class));
    }

}