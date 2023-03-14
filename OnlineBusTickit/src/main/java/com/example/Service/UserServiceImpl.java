package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Model.Routes;
import com.example.Model.Tickets;
import com.example.Model.User;
import com.example.Repository.RoutesRepository;
import com.example.Repository.TickitRepository;
import com.example.Repository.UserRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired 
	private UserRepository ur;
	
	@Autowired 
	private TickitRepository tr;
	
	@Autowired 
	private RoutesRepository rr;

	@Override
	public User AddUser(User user) {
		// TODO Auto-generated method stub
		User u=ur.save(user);
		return u;
	}

	@Override
	public User UpdateUser(User user) {
		// TODO Auto-generated method stub
		Optional<User> u=ur.findById(user.getUid());
		if(u.isPresent())
		{
			User u1=u.get();
			ur.save(user);
			return user;
		}
		return null;
	}

	@Override
	public boolean Booktickit(Tickets tickit) {
		// TODO Auto-generated method stub
		Tickets t=tr.save(tickit);
		
		return true;
		
	}

	@Override
	public Tickets viewBookedTikit(Integer uid) {
		// TODO Auto-generated method stub
		Optional<Tickets> t=tr.findById(uid);
		if(t.isPresent())
		{
			Tickets t1=t.get();
			return t1;
		}
		else
		{
		return null;
		}
	}

	@Override
	public List<Routes> SearchRoutes(String start,String end) {
		// TODO Auto-generated method stub
		List<Routes> rt=rr.findRoutes(start,end); 
		//return null;
	}

	@Override
	public Integer CheckAvailableseats() {
		// TODO Auto-generated method stub
		return null;
	}

}
