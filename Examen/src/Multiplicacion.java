import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
public class Multiplicacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Multiplicacion() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		int a;
		int b;
		int c;
		a = Integer.parseInt(request.getParameter("Introduce A"));
		b = Integer.parseInt(request.getParameter("Introduce B"));
		c = (a*b);
		writer.print("<html><body> <br> = "+ c +"</html></body>");
	}
}