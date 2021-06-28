 package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String nameValue = request.getParameter("name-input");
    String emailValue = request.getParameter("email-input");
    String textValue = request.getParameter("text-input");
    String astroValue = request.getParameter("astro-input");

    // Print the value so you can see it in the server logs.
    System.out.println("sign: " + astroValue);
    System.out.println("message: " + textValue);
    System.out.println("email: " + emailValue);
    System.out.println("name: " + nameValue);

    // Write the value to the response so the user can see it.
    //response.getWriter().println("You submitted: " + textValue);
    //response.sendRedirect("https://8080-32909b5e-9def-44a6-bc57-1ace324e321a.cs-us-west1-olvl.cloudshell.dev/contact.html");
    response.sendRedirect("https://lcamacho-sps-summer21.wl.r.appspot.com/contact.html");

  }
}