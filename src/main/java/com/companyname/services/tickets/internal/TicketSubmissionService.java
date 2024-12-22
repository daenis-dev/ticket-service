package com.companyname.services.tickets.internal;

import com.companyname.services.tickets.api.TicketRequest;

interface TicketSubmissionService {

    String getDepartmentName();

    String submit(TicketRequest request);
}
