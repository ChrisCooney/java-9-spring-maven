module admin {
    requires spring.web;
    requires spring.beans;
    requires spring.context;

    exports java9.spring.mvc.admin.model;
    exports java9.spring.mvc.admin.service;
    exports java9.spring.mvc.admin.api;
}