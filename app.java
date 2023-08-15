import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class app extends HttpServlet {  
  
  public void doPost(HttpServletRequest request, HttpServletResponse response)
  throws ServletException , IOException
  {  
    try{  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n =request.getParameter("userName");  
    out.print("Welcome "+n);  
  
    Cookie ck=new Cookie("uname",n);//creating cookie object  
    response.addCookie(ck);//adding cookie in the response  
  
    //creating submit button  
    out.print("<form action='app2'>");  
    out.print("<input type='submit' value='go'>");  
    out.print("</form>");  
          
    out.close();  
  
        }catch(Exception e){System.out.println(e);}  
  }  
}    