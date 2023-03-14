package com.example.Service;

import java.util.List;

import com.example.Model.Routes;
import com.example.Model.Tickets;
import com.example.Model.User;

public interface UserService {
	
	public User AddUser(User user);
	
	public User UpdateUser(User user);
	
	public boolean Booktickit(Tickets tickit);
	
	public Tickets viewBookedTikit(Integer uid);
	
	public List<Routes> SearchRoutes(String start,String end);

	public Integer CheckAvailableseats();   //this will just return count of the bus
}
