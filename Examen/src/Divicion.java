import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;

public class Divicion extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Divicion() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	/*
	 * Hello Word
	 public class HelloWorld extends HttpServlet{ 
      public void doGet(HttpServletRequest request, 
      HttpServletResponse response)
      throws ServletException,IOException{
      **response.setContentType("text/html");**
      PrintWriter pw = response.getWriter();
      pw.println("<html>");
      pw.println("<head><title>Hello World</title></title>");
      pw.println("<body>");
      pw.println("<h1>Hello World</h1>");
      pw.println("</body></html>");
      }
    }
	 * */	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		int a;
		int b;
		int c;
		a = Integer.parseInt(request.getParameter("Introduce A"));
		b = Integer.parseInt(request.getParameter("Introduce B"));
		c = (a/b);
		writer.print("<html><body> <br> = "+ c +"</html></body>");
	}
}