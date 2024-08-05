import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class prog3 extends HttpServlet
{
    public void service(HttpServletRequest request, HttpServletResponse response) throws
    ServletException, IOException
    {
        response.set contenttype("text/html");
        PrintWriter out = response.getWriter();
        String un= request.getWriter("txt un");
        out.println("welcome"+un);
    }
}