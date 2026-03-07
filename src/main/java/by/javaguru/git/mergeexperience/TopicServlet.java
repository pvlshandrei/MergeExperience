package by.javaguru.git.mergeexperience;

import by.javaguru.git.mergeexperience.topics.Module1Topics;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/topic")
public class TopicServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       var id = Integer.parseInt(req.getParameter("id"));
        Module1Topics topic = null;
        for (Module1Topics value : Module1Topics.values()) {
            if (value.getOrder() == id) {
                topic = value;
                break;
            }
        }
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + topic.getTopic() + "</h1>");
        out.println("<p>" + topic.getDesc() + "</p>");
        out.println("</body></html>");
    }
}
