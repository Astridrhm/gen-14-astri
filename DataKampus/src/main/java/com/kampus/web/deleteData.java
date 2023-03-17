package com.kampus.web;

import java.awt.print.Book;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kampus.dao.DosenDao;
import com.kampus.model.Dosen;

/**
 * Servlet implementation class deleteData
 */
public class deleteData extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String kodedosen = request.getParameter("kodeDosen");
		 
        try {
			DosenDao.deletesql(kodedosen);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        RequestDispatcher rd =  request.getRequestDispatcher("showData");
        rd.forward(request, response);
		
	}
}
