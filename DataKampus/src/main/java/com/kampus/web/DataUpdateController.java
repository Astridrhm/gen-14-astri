package com.kampus.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kampus.dao.DosenDao;
import com.kampus.model.Dosen;

/**
 * Servlet implementation class DataUpdateController
 */
@WebServlet("/showData")
public class DataUpdateController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DosenDao dao = new DosenDao();

		List<Dosen> list = new ArrayList<Dosen>();
		list = dao.listDosen();
		request.setAttribute("list", list);

		RequestDispatcher rd = request.getRequestDispatcher("showData.jsp");
		rd.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}