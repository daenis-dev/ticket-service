package com.companyname.services.tickets.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TicketRequestTest {

    private TicketRequest ticketRequest;

    @BeforeEach
    void init() {
        ticketRequest = new TicketRequest();
    }

    @Test
    void setsTheDepartmentName() {
        ticketRequest.withDepartment("IT");

        String theReturnedDepartment = ticketRequest.getDepartment();

        assertThat(theReturnedDepartment).isEqualTo("IT");
    }

    @Test
    void doesNotSetTheDepartmentNameForNull() {
        RuntimeException thrown = assertThrows(RuntimeException.class, () -> ticketRequest.withDepartment(null));

        assertThat(thrown.getMessage()).isEqualTo("Cannot submit ticket without department");
    }

    @Test
    void doesNotSetTheDepartmentNameForEmpty() {
        RuntimeException thrown = assertThrows(RuntimeException.class, () -> ticketRequest.withDepartment(""));

        assertThat(thrown.getMessage()).isEqualTo("Cannot submit ticket without department");
    }

    @Test
    void setsTheMessage() {
        ticketRequest.withMessage("We need help");

        String theReturnedMessage = ticketRequest.getMessage();

        assertThat(theReturnedMessage).isEqualTo("We need help");
    }

    @Test
    void doesNotSetTheMessageForNull() {
        RuntimeException thrown = assertThrows(RuntimeException.class, () -> ticketRequest.withMessage(null));

        assertThat(thrown.getMessage()).isEqualTo("Cannot submit ticket without message");
    }

    @Test
    void doesNotSetTheMessageForEmpty() {
        RuntimeException thrown = assertThrows(RuntimeException.class, () -> ticketRequest.withMessage(""));

        assertThat(thrown.getMessage()).isEqualTo("Cannot submit ticket without message");
    }
}