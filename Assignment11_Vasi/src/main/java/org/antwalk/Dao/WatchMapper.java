package org.antwalk.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.antwalk.model.Watch;
import org.springframework.jdbc.core.RowMapper;

public class WatchMapper implements RowMapper<Watch>
{

	@Override
	public Watch mapRow(ResultSet rs, int rowNum) throws SQLException {
		Watch p=new Watch();
		p.setId(rs.getInt("id"));
		p.setBrand(rs.getString("brand"));
		p.setPrice(rs.getInt("price"));
		return p;
	}
	
}
