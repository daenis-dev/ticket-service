package com.companyname.services.tickets.internal;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
class TicketSubmissionServiceFactory {

    private final Map<String, TicketSubmissionService> SERVICE_CACHE = new HashMap<>();

    private final List<TicketSubmissionService> ticketSubmissionServices;

    TicketSubmissionServiceFactory(List<TicketSubmissionService> ticketSubmissionServices) {
        this.ticketSubmissionServices = ticketSubmissionServices;
        for (TicketSubmissionService ticketSubmissionService : this.ticketSubmissionServices) {
            SERVICE_CACHE.put(ticketSubmissionService.getDepartmentName(), ticketSubmissionService);
        }
    }

    TicketSubmissionService getTicketSubmissionServiceForDepartment(String department) {
        TicketSubmissionService ticketSubmissionService = SERVICE_CACHE.get(department);
        if (ticketSubmissionService == null) {
            throw new RuntimeException("Received ticket for unknown department: " + department);
        }
        return ticketSubmissionService;
    }

}
