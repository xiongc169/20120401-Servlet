import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @Desc AnnoServlet
 * http://localhost:8080/annoServlet
 * <p>
 * @Author yoong
 * <p>
 * @Date 2011-9-1
 * <p>
 * @Version 1.0
 */
@WebServlet("/annoServlet")
public class AnnoServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        PrintStream printStream = new PrintStream(resp.getOutputStream());
        printStream.println("<html>");
        printStream.println("<head>");
        printStream.println("<title>AnnoServlet " + name + "</title>");
        printStream.println("</head>");
        printStream.println("<body>");
        printStream.println("AnnoServlet: Your name is " + name);
        printStream.println("</body>");
        printStream.println("</html>");
    }
}
