package com.companyname.services.tickets.internal;

enum DepartmentName {

    INFORMATION_TECHNOLOGY("Information Technology"),
    SOFTWARE_DEVELOPMENT("Software Development");

    private final String value;

    DepartmentName(String value) {this.value = value;}

    String getValue() {
        return value;
    }

}
