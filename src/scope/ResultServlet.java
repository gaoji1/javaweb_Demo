package scope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="ResultServlet", urlPatterns={"/result"}) 
public class ResultServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("进入result");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
//		使用session
//		------------------------------------------------------
		Integer numberInSession = (Integer) req.getSession().getAttribute("numberInSession");
		out.println(numberInSession);
//		------------------------------------------------------
//		使用request
//		-------------------------------------------------------
		
		Integer numberInRequest = (Integer) req.getAttribute("numberInRequest");
		out.println(numberInRequest);
//		--------------------------------------------------------
	}

}
