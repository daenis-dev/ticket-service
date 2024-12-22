package com.companyname.services.tickets.internal;

import com.companyname.services.tickets.api.TicketRequest;
import org.springframework.stereotype.Service;

@Service
class SoftwareDevelopmentTicketSubmissionService implements TicketSubmissionService {

    @Override
    public String getDepartmentName() {
        return DepartmentName.SOFTWARE_DEVELOPMENT.getValue();
    }

    @Override
    public String submit(TicketRequest request) {
        return "Ticket has been submitted to the Software Development department with message: " + request.getMessage();
    }

}
