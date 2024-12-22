package com.companyname.services.tickets.internal;

import com.companyname.services.tickets.api.SubmitTicket;
import com.companyname.services.tickets.api.TicketRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class TicketService implements SubmitTicket {

    private final TicketSubmissionServiceFactory ticketSubmissionServiceFactory;

    @Override
    public String submit(TicketRequest request) {
        String department = request.getDepartment();
        TicketSubmissionService ticketSubmissionService = ticketSubmissionServiceFactory.getTicketSubmissionServiceForDepartment(department);
        return ticketSubmissionService.submit(request);
    }
}
