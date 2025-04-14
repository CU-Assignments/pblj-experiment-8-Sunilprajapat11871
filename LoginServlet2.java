import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/LoginServlet2")
public class LoginServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        if ("user".equals(user) && "pass123".equals(pass)) {
            out.println("<h1>Hello, " + user + "!</h1>");
            out.println("<p>You have successfully logged in.</p>");
        } else {
            out.println("<h1>Access Denied</h1>");
            out.println("<p>Invalid username or password.</p>");
        }
        out.println("</body></html>");

        out.close();
    }
}
