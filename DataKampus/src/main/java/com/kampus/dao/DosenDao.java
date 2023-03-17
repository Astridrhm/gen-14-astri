package com.kampus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kampus.model.Dosen;

public class DosenDao {

	public static Connection getConnection() throws SQLException {
		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/datakampus", "postgres", "0208");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}

	public void sqlinsert(String kodeDosen, String namaDosen) {
		String sqlinsert = "insert into dosen values(?, ?)";
//		String result = "Success";
		try {
			Connection con = DosenDao.getConnection();
			PreparedStatement ps = con.prepareStatement(sqlinsert);
			ps.setString(1, kodeDosen);
			ps.setString(2, namaDosen);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
//			result = "Kode Dosen sudah tersedia";
		}
//		return result;
	}

	public static List<Dosen> listDosen() {
		String sql = "select * from dosen";
		List<Dosen> listDosen = new ArrayList<Dosen>();

		try {
			Connection con = DosenDao.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Dosen d = new Dosen();
				d.setKodeDosen(rs.getString("kodedosen"));
				d.setNamaDosen(rs.getString("namadosen"));
				listDosen.add(d);
			}
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listDosen;
	}

	public Dosen getDosen(String kodeDosen) throws SQLException {
		Dosen d = new Dosen();
//		d.setKodeDosen("No Data");
//		d.setNamaDosen("No Data");
		String query = "select * from dosen where kodedosen=?";

		try {
			Connection con = DosenDao.getConnection();
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, kodeDosen);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				d.setKodeDosen(rs.getString("kodedosen"));
				d.setNamaDosen(rs.getString("namadosen"));
			}
			rs.next();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(d.getKodeDosen());
		return d;
	}

	public void updatesql(String kodeDosen, String namaDosen) {
		String updatesql = "update dosen set namadosen = ? where kodedosen=?";

		try {
			Connection con = DosenDao.getConnection();
			PreparedStatement st = con.prepareStatement(updatesql);
			st.setString(1, namaDosen);
			st.setString(2, kodeDosen);
			st.execute();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int deletesql(String kodeDosen) throws SQLException {
		int status = 0;
		try {
			Connection con = DosenDao.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from dosen where kodedosen=?");
			ps.setString(1, kodeDosen);
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}
}