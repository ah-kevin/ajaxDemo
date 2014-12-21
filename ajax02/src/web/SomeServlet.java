package web;

import bean.Friend;
import bean.city;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2014/12/21.
 */
@WebServlet(name = "SomeServlet",value = "*.do")
public class SomeServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out =response.getWriter();
        String uri=request.getRequestURI();
        uri=uri.substring(uri.lastIndexOf("/"),uri.lastIndexOf("."));
        if (uri.equals("/getObj")){
            Friend f=new Friend("张三",30);
            JSONObject jobj =JSONObject.fromObject(f);
            String jstr =jobj.toString();
            System.out.println(jstr);
            out.println(jstr);
        }else if (uri.equals("/getCity")){
            //根据用户的选择,确定用户选择的城市
            String cName =request.getParameter("cName");
            System.out.println(cName);
            //根据用户选择,确定要返回的区域信息
            List<city> allCity =new ArrayList<city>();
            city c1 =null;
            city c2 =null;
            if (cName.equals("bj")){
                c1 =new city("海锭","hd");
                c2 =new city("东城","dc");
            }else {
                c1 =new city("浦东","pd");
                c2 =new city("静安","ja");
            }
            allCity.add(c1);
            allCity.add(c2);
            System.out.println(allCity);
            //将集合转换为一个json的字符串
            JSONArray jArr =JSONArray.fromObject(allCity);
            String result=jArr.toString();
            System.out.println(result);
            out.print(result);
        }
        out.close();
    }

}
