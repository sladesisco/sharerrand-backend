package sharerrand.api.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sharerrand.api.dao.MemberDAO;
import sharerrand.api.dto.MemberFormDTO;
import sharerrand.api.dto.Message;
import sharerrand.api.models.Member;

import java.io.IOException;

@RestController
@RequestMapping(
        value = "/user",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class MemberController {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private MemberDAO memberDAO;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(method = RequestMethod.POST)
    public String handleMemberForm(@RequestParam String body) {
        Message message = new Message("Member created successfully");
        try {
            MemberFormDTO form = objectMapper.readValue(body, MemberFormDTO.class);
            Member member = new Member(form);
            memberDAO.save(member);
        } catch (IOException e) {
            //TODO: HANDLE ERRORS TO FRONT END
            message.setMessage("Incorrect form data.");
        }

        return message.toString();

    }
}
