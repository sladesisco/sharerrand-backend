package sharerrand.api.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sharerrand.api.dao.TestDAO;
import sharerrand.api.models.Test;

import java.io.IOException;

@RestController
@RequestMapping(
        value = "/test"
)
public class TestController {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private TestDAO testDAO;

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String insertTest(@RequestBody String body) throws IOException {

        Test test = testDAO.save(objectMapper.readValue(body, Test.class));

        return objectMapper.writeValueAsString(test);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getTest() {
        return "hello, world";
    }
}
