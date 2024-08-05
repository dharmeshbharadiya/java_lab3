import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class prog2 extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println("<html>");
out.println("<head>");
out.println("<title>T N RAO COLLEGE</title>");
out.println("</head>");
out.println("<body>");
out.println("<h1>T N RAO COLLEGE</h1>");
out.println("</body>");
out.println("</html>");
}
}