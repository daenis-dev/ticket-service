package it.tickets;

import com.companyname.services.tickets.api.SubmitTicket;
import com.companyname.services.tickets.api.TicketRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SubmitsTicketIT {

    @Autowired
    private SubmitTicket submitTicket;

    @Test
    void submitsTicketForInformationTechnology() {
        String theDepartmentName = "Information Technology";
        String theMessage = "There was a problem!";

        String thePredictedConfirmationMessage = "Ticket has been submitted to the Information Technology department with message: " + theMessage;

        String theConfirmationMessage = submitTicket.submit(new TicketRequest()
                .withDepartment(theDepartmentName)
                .withMessage(theMessage));

        assertThat(theConfirmationMessage).isEqualTo(thePredictedConfirmationMessage);
    }

    @Test
    void submitsTicketForSoftwareDevelopment() {
        String theDepartmentName = "Software Development";
        String theMessage = "There was a problem!";

        String thePredictedConfirmationMessage = "Ticket has been submitted to the Software Development department with message: " + theMessage;

        String theConfirmationMessage = submitTicket.submit(new TicketRequest()
                .withDepartment(theDepartmentName)
                .withMessage(theMessage));

        assertThat(theConfirmationMessage).isEqualTo(thePredictedConfirmationMessage);
    }
}
