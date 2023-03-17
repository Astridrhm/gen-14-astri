package com.kampus.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kampus.dao.DosenDao;

/**
 * Servlet implementation class GetDataKampusController
 */
@WebServlet("/getDataKampus")
public class GetDataKampusController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nKode = request.getParameter("newKode");
		String nNama = request.getParameter("newNama");
		
		DosenDao dao = new DosenDao();
//		String result = 
		dao.sqlinsert(nKode, nNama);
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
//		response.getWriter().print(result);
	}
}
