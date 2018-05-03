import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test")
public class Servlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }



    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("GBK");
        //request.getParameter("name").getBytes("ISO-8859-1"),"UTF-8")
        PrintWriter out = resp.getWriter();
        Boolean flag = false;
        String userName = req.getParameter("name");
//        String password = req.getParameter(pw);
//        if(userName.equals(htp)&&password.equals(123))
//        {
//            flag = true;
//        }
//
//        else flag = false;
//        System.out.println(userName:+userName+ password:+password);
        out.print("地瓜地瓜，我是"+userName);
        out.flush();
        out.close();
    }
}
