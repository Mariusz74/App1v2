// Mariusz S
package com.group3.jdbctemplate.dao.impl;
import java.util.List;

import javax.sql.DataSource;

import com.group3.jdbctemplate.dao.DeferralDAO;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.group3.interfaces.Deferral;
//@Repository
public class DeferralJDBCTemplate implements DeferralDAO {

		private DataSource dataSource;
		private JdbcTemplate jdbcTemplateObject;

		@Override
		public void setDataSource(DataSource dataSource) {
			this.dataSource = dataSource;
			this.jdbcTemplateObject = new JdbcTemplate(this.dataSource);
		}

		@Override
		public int createDeferral(String imageAddress, int idStudent, int idDeferralModule, int idLecture) {
			String SQL = "insert into Deferral (imageAddress, idStudent, idDeferralModule, idLecture) values (?, ?, ?, ?)";
			System.out.println("Created Deferral = " + imageAddress + " " + idStudent + " " + idDeferralModule + " " +  idLecture);
			return jdbcTemplateObject.update(SQL, new Object[] { imageAddress, idStudent, idDeferralModule, idLecture});		
			//return;	
		}

		@Override
		public int deleteDeferral(int id) {
			String SQL = "delete from Deferral where id = ?";
			System.out.println("Deleted Record with ID = " + id );			
			return jdbcTemplateObject.update(SQL, new Object[] {id});
			//return;
		}

		@Override
		public int updateDeferral(int id, String imageAddress, int idStudent, int idDeferralModule, int idLecture) {
			String SQL = "update Deferral set imageAddress = ?, idStudent = ?, idDeferralModule = ?, idLecture = ? where id = ?";
			System.out.println("Updated Record with ID = " + id );			
			return jdbcTemplateObject.update(SQL,  new Object[] {imageAddress, idStudent, idDeferralModule, idLecture, id});
			//return;	
		}
		
		@Override
		public int updateDeferralStatus(int id, int idStatus) {
			String SQL = "update Deferral set idStatus = ? where id = ?";
			System.out.println("Updated Record with ID = " + id );			
			return jdbcTemplateObject.update(SQL,  new Object[] {idStatus, id});
			//return;	
		}
// ************************************************ ?? ******************
/*
		public List<Deferral> getAll() {
			// TODO Auto-generated method stub
			return null;
		}


		public Deferral find(int i) {
			// TODO Auto-generated method stub
			return null;
		}


*/

}
