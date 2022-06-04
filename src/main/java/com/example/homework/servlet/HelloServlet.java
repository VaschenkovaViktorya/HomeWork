package com.example.homework.servlet;

import com.example.homework.person.Person;
import com.example.homework.person.PersonDB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;

@WebServlet(urlPatterns = "/hello")

public class HelloServlet extends HttpServlet {
    private Map<String, Person> persons = null;

    @Override
    public void init() throws ServletException {
        super.init();
        persons = PersonDB.getAll();
        System.out.println(">>>>>>>>>>>" + persons.get("1").getLastName());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Person person = persons.get("2");
        System.out.println(person.toString());
        req.setAttribute("name", person.getFirstName() + " " + person.getLastName());
        req.setAttribute("age", person.getAge());
        req.getRequestDispatcher("/userForm.jsp").forward(req, resp);
    }
}
