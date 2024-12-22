## Ticket System

This project is meant to serve as an example implementation of a factory pattern.

### Context

You are designing a ticketing system for your company. As of right now, the only departments that handle tickets are the Information Technology department and the Software Development department. However, your supervisor has informed you that other departments will eventually need to be able to handle tickets through your system.

### Challenge

You must design a ticketing system that accommodates future departments in a way that does not require code to be modified.

### Goal

Leverage Spring Boot's inversion of control in order to design a system that achieves code reusability in a way that complies with the Open - Closed principle.

### API Documentation

**URL:** https://localhost:8080/v1/tickets?department-name=text&message=text

- department-name: either "Information Technology" or "Software Development"
- message: any text value

**Request Method:** POST