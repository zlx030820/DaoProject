package cn.mldn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.Select;

import cn.mldn.dao.IEmpoDAO;
import cn.mldn.entity.Empo;
import cn.mldn.jdbc.DatabaseConnection;

public class EmpDAOImpl implements IEmpoDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	public EmpDAOImpl(Connection conn) {
		this.conn=conn;
	}
	@Override
	public boolean doCreate(Empo vo) throws Exception {
		String sql="INSERT INTO empo(empno,ename,job,hiredate,sal,comm)VALUES(?,?,?,?,?)";
		this.pstmt=this.conn.prepareStatement(sql);
		this.pstmt.setInt(1, vo.getEmpo());
		this.pstmt.setString(2, vo.getEname() );
		this.pstmt.setString(3, vo.getJob() );
		this.pstmt.setDate(4, new java.sql.Date(vo.getHiredate().getTime()));
		this.pstmt.setDouble(5, vo.getSal());
		this.pstmt.setDouble(6, vo.getComm());
		if (this.pstmt.executeUpdate()>0) {
		return true;
		}
		return false;
	}

	@Override
	public boolean doUpdate(Empo vo) throws Exception {
		// TODO Auto-generated method stub
		String sql="UPDATE emp SET ename=?,job=?,hiredate=?,sal=?,comm=? where empno=?";
		this.pstmt=this.conn.prepareStatement(sql);
		
		this.pstmt.setString(1, vo.getEname() );
		this.pstmt.setString(1, vo.getJob() );
		this.pstmt.setDate(3, new java.sql.Date(vo.getHiredate().getTime()));
		this.pstmt.setDouble(4, vo.getSal());
		this.pstmt.setDouble(5, vo.getComm());
		this.pstmt.setInt(6, vo.getEmpo());
		if (this.pstmt.executeUpdate()>0) {
		return true;
		}
		return false;
	}

	@Override
	public boolean doRemove(Empo vo) throws Exception {
		String sql="DELETE FROM emp WHERE empno=?";
		this.pstmt=this.conn.prepareStatement(sql);
		
		this.pstmt.setInt(1, vo.getEmpo());
		if (this.pstmt.executeUpdate()>0) {
		return true;
		}
		return false;
	}

	@Override
	public Empo findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Empo vo=null;
		String sql="SELECT empn,ename,job,hiredate,sal,comm FROM emp WHERE=?";
		this.pstmt=this.conn.prepareStatement(sql);
		this.pstmt.setInt(1, id);
		ResultSet rs=this.pstmt.executeQuery();
		if (rs.next()) {
			vo=new Empo();
			vo.setEmpo(rs.getInt(1));
			vo.setEname(rs.getString(2));
			vo.setJob(rs.getString(3));
			vo.setHiredate(rs.getDate(5));
			vo.setSal(rs.getDouble(6));
			
		}
		return vo;
	}

	@Override
	public List<Empo> findAll() throws Exception {
		List<Empo> all=new ArrayList<Empo>();
		String sql="SELECT empn,ename,job,hiredate,sal,comm FROM emp";
		this.pstmt=this.conn.prepareStatement(sql);
		ResultSet rs=this.pstmt.executeQuery();
		while (rs.next()) {
			Empo vo=new Empo();
			vo=new Empo();
			vo.setEmpo(rs.getInt(1));
			vo.setEname(rs.getString(2));
			vo.setJob(rs.getString(3));
			vo.setHiredate(rs.getDate(5));
			vo.setSal(rs.getDouble(6));
			all.add(vo);
			
		}
		return all;
	}

	@Override
	public List<Empo> findAll(String column, String keyWord,
			Integer currentPage, Integer lineSize) throws Exception {
		List<Empo> all=new ArrayList<Empo>();
		String sql="SELECT empn,ename,job,hiredate,sal,comm RoWNUM rn"
				+"From emp"
				+"WHERE" +column+"LIKE ? AND ROWNUM<=?) temp"
				+ "WHERE temp.rn>?";
		this.pstmt=this.conn.prepareStatement(sql);
		this.pstmt.setString(1, "%"+keyWord+"%");
		this.pstmt.setInt(2, currentPage*lineSize);
		this.pstmt.setInt(3, (currentPage-1)*lineSize);
		ResultSet rs=this.pstmt.executeQuery();
		while (rs.next()) {
			Empo vo=new Empo();
			vo=new Empo();
			vo.setEmpo(rs.getInt(1));
			vo.setEname(rs.getString(2));
			vo.setJob(rs.getString(3));
			vo.setHiredate(rs.getDate(5));
			vo.setSal(rs.getDouble(6));
			all.add(vo);
		}
		return all;
		
	}

	@Override
	public Integer getAllCount(String column, String keyWord) throws Exception {
		String sql="SELECT COUNT(empno) FROM emp WHERE"+column+"LIKE?";
		this.pstmt=this.conn.prepareStatement(sql);
		this.pstmt.setString(1, "%"+keyWord+"%");
		ResultSet rs=this.pstmt.executeQuery();
		if (rs.next()) {
			rs.getInt(1);
			
		}
		return 0;
	}


}
