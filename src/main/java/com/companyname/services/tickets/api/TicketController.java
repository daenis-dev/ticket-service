package com.companyname.services.tickets.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class TicketController {

    private final SubmitTicket submitTicket;

    @PostMapping("/v1/tickets")
    public ResponseEntity<?> submitTicketForRequest(@RequestParam("department-name") String departmentName, @RequestParam("message") String message) {
        String confirmationMessage = submitTicket.submit(new TicketRequest().withDepartment(departmentName).withMessage(message));
        return new ResponseEntity<>(confirmationMessage, HttpStatus.CREATED);
    }
}
