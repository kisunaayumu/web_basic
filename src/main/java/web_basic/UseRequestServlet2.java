package web_basic;
import java.io.*;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UseRequestServlet2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		//Userオブジェクトの生成
		user objUser = new user();
		objUser.setName("神田タロー");
		objUser.setAge(25);

		//リクエストスコープへのUserオブジェクトの登録
		request.setAttribute("RequestUser", objUser);
		request.getRequestDispatcher("/view/ch11/useRequest2.jsp").forward(request, response);
	}
}