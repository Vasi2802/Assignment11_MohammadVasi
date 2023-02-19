package org.antwalk.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.antwalk.model.Watch;
import org.springframework.jdbc.core.JdbcTemplate;

public class WatchDaoImpl implements WatchDao
{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObj;
	public void setDataSource(DataSource ds)
	{
		this.dataSource=ds;
		this.jdbcTemplateObj=new JdbcTemplate(dataSource);
	}
	public void create(String brand,int price)
	{
		String query="Insert into watch(brand,price) values(?,?)";
		jdbcTemplateObj.update(query,brand,price);
	}
	public List<Watch>listWatch()
	{
		String query="select * from watch";
		List<Watch> w=jdbcTemplateObj.query(query,new WatchMapper());
		return w;
	}
	
	public void delete(Integer id) {
		  String SQL = "DELETE FROM watch WHERE id = ?";
		  jdbcTemplateObj.update(SQL, new Object[]{id});
		  System.out.println("Deleted Record with ID = " + id );
		 }
	
	public void update(Integer id, int price) {
		   String SQL = "UPDATE watch SET price = ? WHERE id = ?";
		   jdbcTemplateObj.update(SQL, new Object[]{price, id});
		   System.out.println("Updated Record with EMPID = " + id );
		 }
	
	
}
