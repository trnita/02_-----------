package chapter4;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = { "/chapter4/hello2" })
public class Hello2 extends HttpServlet {

	public void doGet(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// setContentTypeメソッドでMIMEタイプと文字コードを指定
		// MIMEタイプの一覧はテキストのP56を参照
		response.setContentType("text/plain; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("Hello!");
		out.println("こんにちは！");
		out.println(new java.util.Date());
	}
}
