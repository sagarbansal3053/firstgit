

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 * Created by root on 28/6/17.
 */
public class blogcontent extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter write = response.getWriter();

        String bid = request.getParameter("blogid");
        String content = request.getParameter("content");
        //write.println("successfuly updated");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog", "root", "sagar@3053");


            String qre = new String("insert into bloginfo values(?,?)");

            PreparedStatement ps = con.prepareStatement(qre);
            ps.setString(1,bid);
            ps.setString(2,content);
            ps.executeUpdate();
            write.println("successfuly updated");

            //rs.close();

            con.close();

          //  write.println(bid);
        //    write.println(content);

        } catch (ClassNotFoundException e) {
            write.println(e);
            e.printStackTrace();

        } catch (SQLException e) {
            write.println(e);
            e.printStackTrace();
        }




    }
}
