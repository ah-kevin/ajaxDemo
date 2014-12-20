import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2014/12/20.
 */
@WebServlet(name = "SomeServlet",value = "*.do")
public class SomeServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        String uri=request.getRequestURI();
        uri=uri.substring(uri.lastIndexOf("/"),uri.lastIndexOf("."));
        if (uri.equals("/getInfo")) {
            out.println("来自星星的你");
        }else if (uri.equals("/postInfo")){
            String str=request.getParameter("uname");
            //System.out.println(str);
            out.print("来自星星的"+str);
        }else if (uri.equals("/getArea")){
            //获取用户选择的城市
            String cityName=request.getParameter("cityName");
            if (cityName.equals("bj")){
                //返回的信息中包含两部分,区域的中文信息,value信息
                out.println("海淀,hd;东城,dc");
            }else if (cityName.equals("sh")){
                out.println("静安,ja;浦东,pd");
            }else{
                out.println("合肥,hf;芜湖,wh");
            }
        }
        out.close();
    }

}
