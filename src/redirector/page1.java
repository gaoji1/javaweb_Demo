package redirector;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="page1", urlPatterns= {"/page1"}) 
public class page1 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("界面1,现在请求转发到界面2");
//		resp.sendRedirect("/temple/page2");
		req.getRequestDispatcher("/page2").forward(req, resp);
		System.out.println("完成---");
		
		
	}
	
	
	

}
