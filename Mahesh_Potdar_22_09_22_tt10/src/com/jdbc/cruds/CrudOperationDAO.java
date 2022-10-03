package com.jdbc.cruds;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CrudOperationDAO { // DAO - Data Access Object class

	Connection conn = DBUtil.getDBConnection();

	public int addBook(Books book) {

		int count = 0;

		try {
			String insertQuery = "insert into Books(bid,bname,bprice,bpdate) values(?,?,?,current_date)";
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, book.getBid());
			pstmt.setString(2, book.getBname());
			pstmt.setDouble(3, book.getBprice());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	public int updateBook(Books book) {

		int count = 0;

		try {
			String updateQuery = "update Books set bname =? , bprice = ? where eid = ?";
			PreparedStatement pstmt = conn.prepareStatement(updateQuery);

			pstmt.setString(1, book.getBname());
			pstmt.setDouble(2, book.getBprice());
			pstmt.setInt(3, book.getBid());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	public int deleteBookById(int eid) {

		String deleteQuery = "delete from Books where bid = ?";

		PreparedStatement pstmt;
		int deleteCount = 0;
		try {
			pstmt = conn.prepareStatement(deleteQuery);
			pstmt.setInt(1, eid);
			deleteCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deleteCount;
	}

	public Books selectBookById(int bid) {

		String selectQuery = "select * from Books where bid = ?";

		PreparedStatement pstmt;
		Books book = new Books();

		try {
			pstmt = conn.prepareStatement(selectQuery);
			pstmt.setInt(1, bid);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				book.setBid(rs.getInt("bid"));
				book.setBname(rs.getString("bname"));
				book.setBprice(rs.getDouble("bprice"));
				book.setBdate(rs.getDate("bdate"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}

	public List<Books> selectAllEmployeees() {

		String selectQuery = "select * from Books";
		PreparedStatement pstmt;
		List<Books> list = new ArrayList<Books>();
		try {
			pstmt = conn.prepareStatement(selectQuery);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				Books book = new Books();
				book.setBid(rs.getInt("bid"));
				book.setBname(rs.getString("bname"));
				book.setBprice(rs.getDouble("bprice"));
				book.setBdate(rs.getDate("bdate"));

				list.add(book);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}
}
