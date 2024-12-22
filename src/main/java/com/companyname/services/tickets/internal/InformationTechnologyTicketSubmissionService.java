package com.companyname.services.tickets.internal;

import com.companyname.services.tickets.api.TicketRequest;
import org.springframework.stereotype.Service;

@Service
class InformationTechnologyTicketSubmissionService implements TicketSubmissionService {

    @Override
    public String getDepartmentName() {
        return DepartmentName.INFORMATION_TECHNOLOGY.getValue();
    }

    @Override
    public String submit(TicketRequest request) {
        return "Ticket has been submitted to the Information Technology department with message: " + request.getMessage();
    }

}
