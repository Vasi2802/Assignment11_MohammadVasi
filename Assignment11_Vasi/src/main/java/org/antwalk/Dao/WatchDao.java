package org.antwalk.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.antwalk.model.Watch;

public interface WatchDao 
{
	public void setDataSource(DataSource ds);
	public void create(String brand,int price);
	public List<Watch>listWatch();
	public void delete(Integer id);
	public void update(Integer id, int price);
}
