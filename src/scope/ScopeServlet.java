package scope;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="ScopeServlet", urlPatterns={"/scope"}) 
public class ScopeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	/*servlet����������*/
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		System.out.println("����scope service");
//		ʹ��session
//		--------------------------------------------------------------
		Integer numberInSession =  (Integer) req.getSession().getAttribute("numberInSession");
		if(numberInSession == null) {
			req.getSession().setAttribute("numberInSession", 1);
		}else {
			req.getSession().setAttribute("numberInSession", numberInSession+1);
		}
		System.out.println("���ݴ������ ����ת��result");
		req.getRequestDispatcher("/result").include(req, resp);
//		-------------------------------------------------------------------
//		ʹ��request
//		-------------------------------------------------------------------
		Integer numberInRequest = (Integer) req.getAttribute("numberInRequest");
		if(numberInRequest == null) {
			req.setAttribute("numberInRequest", 1);
		}else {
			req.setAttribute("numberInRequest", numberInRequest+1);
		}
		System.out.println("������� ������ת");
		req.getRequestDispatcher("/result").forward(req, resp);
		
	}

}
