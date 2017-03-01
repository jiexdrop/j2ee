package fr.iut.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<HTML>" );
		out.println("<HEAD>");
		out.println("<TITLE>Hello</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<H1>Hello you ! Here are the menus !</H1>");
        out.println("<H2><A href='home'> To hours</A></H2>");
		out.println("<H2><A href='delete'> To delete</A></H2>");
		out.println("<H2><A href='listRoom'> To list</A></H2>");
        out.println("<H2><A href='manage'> To manage</A></H2>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	}
}
