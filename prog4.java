import java.io.*;
import java.util.*;
import javax.servlet.*;

public class prog3 extends HttpServlet
{
    public void service(HttpServletRequest request, HttpServletResponse response) throws
    ServletException, IOException
    {
        response.set contenttype("text/html");
        PrintWriter out = response.getWriter();
        String num= request.getWriter("txtnum");
        out.println("Employee number is:"+num);
        out.write("<br>")

        String nm= request.getWriter("txtnm");
        out.println("Employee name is:"+nm);
        out.write("<br>")

        String des= request.getWriter("txtdes");
        out.println("designation is:"+des);
        out.write("<br>")

        String qua= request.getWriter("txtqua");
        out.println("qualification is:"+qua);
    }
}