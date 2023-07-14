package com.devsuperior.integrations.services;

import com.devsuperior.integrations.dto.EmailDTO;
import com.devsuperior.integrations.services.exceptions.EmailException;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import java.io.IOException;

public class SendGridEmailService implements EmailService {

    private static Logger logger = LoggerFactory.getLogger(SendGridEmailService.class);

    @Autowired
    private SendGrid sendGrid;

    public void sendEmail(EmailDTO dto) {
        Email from = new Email(dto.getFromEmail(), dto.getFromName());
        Email to = new Email(dto.getTo());
        Content content = new Content(dto.getContentType(), dto.getBody());
        Mail mail = new Mail(from, dto.getSubject(), to, content);

        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            logger.info("Sending email to: " + dto.getTo());
            Response response = sendGrid.api(request);
            if (response.getStatusCode() >= 400 && response.getStatusCode() <= 500) {
                logger.error("Error sending email: " + response.getBody());
                throw new EmailException(request.getBody());
            }
            logger.info("Email sent! Status: " + response.getStatusCode());

        } catch (IOException e) {
            throw new EmailException(e.getMessage());
        }
    }
}
