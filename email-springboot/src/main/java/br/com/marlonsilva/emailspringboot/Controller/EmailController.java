package br.com.marlonsilva.emailspringboot.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marlonsilva.emailspringboot.DTO.EmailDTO;
import br.com.marlonsilva.emailspringboot.Service.EmailService;

@RestController
@RequestMapping("email")
public class EmailController {
    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public void sendEmail (@RequestBody EmailDTO email){
        emailService.sendEmail(email);
    }
}
