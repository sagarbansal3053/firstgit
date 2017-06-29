import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class index1 extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter write = response.getWriter();

        int usercompare = username.compareTo("sagar");
        int passcompare = password.compareTo("sagar");
        if(usercompare == 0 && passcompare == 0)
        {
            //write.println("done");
            response.sendRedirect("addblog.jsp");
        }
        else {
            response.sendRedirect("first.jsp");

        }




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {


    }
}