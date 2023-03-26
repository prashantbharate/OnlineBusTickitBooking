//package com.example.Controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.Model.Bus;
//import com.example.Model.Routes;
//import com.example.Model.Tickets;
//import com.example.Model.User;
//import com.example.Service.UserService;
//
//@RestController
//public class CustomerController{
//
//
//	@Autowired
//	private UserService us1;
//	
//	@PostMapping("User/add")
//	public ResponseEntity<User> AddUser(@RequestBody User user)
//	{
//		User u=us1.AddUser(user);
//		return new ResponseEntity<User>(u,HttpStatus.ACCEPTED); 
//	}
//	
//	@PostMapping("Bus/add")
//	public ResponseEntity<Bus> AddBus(@RequestBody Bus bus)
//	{
//		Bus b=us1.Addtobus(bus);
//		return new ResponseEntity<Bus>(b,HttpStatus.ACCEPTED); 
//	}
//	
//	@PutMapping("Bus/update")
//	public ResponseEntity<User> UpdateUser(@RequestBody User user)
//	{
//		User u=us1.UpdateUser(user);
//		return new ResponseEntity<User>(u,HttpStatus.ACCEPTED); 
//	}
//	
//	@PostMapping("Bus/booktickit")
//	public ResponseEntity<Boolean> BookTickit(@RequestBody Tickets tickit)
//	{
//		Boolean t= us1.Booktickit(tickit);
//		return new ResponseEntity<Boolean>(t,HttpStatus.ACCEPTED); 
//	}
//	
//	
//	@GetMapping("Bus/view/tickit/{uid}")
//	public ResponseEntity<Tickets> ViewBookTickit(@PathVariable ("uid") Integer uid)
//	{
//		Tickets t= us1.viewBookedTikit(uid);
//		return new ResponseEntity<Tickets>(t,HttpStatus.ACCEPTED); 
//	}
//	
//	@GetMapping("Bus/search/route/{start}{end}")
//	public ResponseEntity<List<Routes>> ViewBookTickit(@PathVariable ("start") String start,@PathVariable ("end") String end)
//	{
//		List<Routes> r= us1.SearchRoutes(start,end);
//		return new ResponseEntity<List<Routes>>(r,HttpStatus.ACCEPTED); 
//	}
//	
//	@GetMapping("Bus/check/availablebus")
//	public ResponseEntity<Integer> AvailableBus()
//	{
//		Integer r= us1.CheckAvailableseats();
//		return new ResponseEntity<Integer>(r,HttpStatus.ACCEPTED); 
//	}
//	
//	
//}
