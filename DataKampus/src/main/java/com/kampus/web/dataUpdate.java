package com.kampus.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kampus.dao.DosenDao;
import com.kampus.model.Dosen;

/**
 * Servlet implementation class UpdateDosen
 */

@WebServlet("/dataUpdate")
public class dataUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String kodeDosen = request.getParameter("kodeDosen");
				
		DosenDao dao = new DosenDao();
		Dosen d1 = new Dosen();
		try {
			d1 = dao.getDosen(kodeDosen);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(d1.getKodeDosen());
		request.setAttribute("dosen", d1);
		
		RequestDispatcher rd = request.getRequestDispatcher("dataUpdate.jsp");
		rd.forward(request, response);
		
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
