package com.kampus.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kampus.dao.DosenDao;

/**
 * Servlet implementation class DosenUpdate
 */
@WebServlet("/UpdateController")
public class DosenUpdate extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String kodedosen = request.getParameter("kodedosen");
		String namadosen = request.getParameter("namadosen");

		DosenDao dao = new DosenDao();
		dao.updatesql(kodedosen, namadosen);
		response.sendRedirect("showData");
	}

}
