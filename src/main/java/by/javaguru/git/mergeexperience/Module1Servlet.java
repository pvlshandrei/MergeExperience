package by.javaguru.git.mergeexperience;

import java.io.*;

import by.javaguru.git.mergeexperience.topics.Module1Topics;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/module1")
public class Module1Servlet extends HttpServlet {
    private String message;
    public void init() {
        message = "Модуль 1";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");


        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");

        out.println("<table>");
        for (Module1Topics value : Module1Topics.values())
            out.println("<tr><td>"
                    + value.getOrder() + "</td><td>"
                    + value.getTopic() + "</td><td>"
                    + value.getDesc()
                    + "</td><td><a href='/topic?id=" + value.getOrder() + "'>Подробнее</a>"
                    + "</td></tr>");

        out.println("</table>");
        out.println("</td><td><a href='/module4'><img src='ressources/left-arrow.png'></a>");
        out.println("</td><td><a href='/module2'><img src='ressources/right-arrow.png'></a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}