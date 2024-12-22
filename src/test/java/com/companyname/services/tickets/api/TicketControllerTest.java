package com.companyname.services.tickets.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
class TicketControllerTest {

    private String departmentName;
    private String message;

    @Mock
    private SubmitTicket submitTicket;

    private MockMvc mockMvc;

    @BeforeEach
    void init() {
        departmentName = "IT";
        message = "It needs to be fixed";

        mockMvc = MockMvcBuilders
                .standaloneSetup(new TicketController(submitTicket))
                .build();
    }

    @Test
    void submitsTheTicket() throws Exception {
        String theMessage = "Ticket submitted";

        when(submitTicket.submit(any())).thenReturn(theMessage);

        mockMvc.perform(post("/v1/tickets")
                        .param("department-name", departmentName)
                        .param("message", message))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$", is(theMessage)));
    }
}