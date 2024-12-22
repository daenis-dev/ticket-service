package com.companyname.services.tickets.api;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketRequest {

    private String department;
    private String message;

    public TicketRequest withDepartment(String department) {
        if (department == null || department.equals("")) {
            throw new RuntimeException("Cannot submit ticket without department");
        }
        this.department = department;
        return this;
    }

    public TicketRequest withMessage(String message) {
        if (message == null || message.equals("")) {
            throw new RuntimeException("Cannot submit ticket without message");
        }
        this.message = message;
        return this;
    }
}
