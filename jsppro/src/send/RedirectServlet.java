package send;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectServlet
 */
@WebServlet("/RedirectServlet")
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RedirectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// redirect 방식으로 포워딩
		// 1. 포워딩된 페이지에서는 request 객체로 공유한 값을 사용할 수 없다.
		// 2. 포워딩된 JSP페이지에서는 자바 서블릿 클래스에서 request 영역의
		//    공유한 속성값에 접근 할 수 없다.
		// 3. 포워딩이 되면 브라우저의 URL주소가 포워딩된 JSP 파일명으로 바뀐다.
		
		// request 객체로 공유 설정
		request.setAttribute("request", "requestValue");
		
		response.sendRedirect("./servlet/ex777/redirect.jsp");
	}

}
