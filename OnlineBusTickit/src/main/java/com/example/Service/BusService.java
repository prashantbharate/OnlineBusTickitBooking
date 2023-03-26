package com.example.Service;

import java.util.Date;
import java.util.List;

import com.example.Model.Bus;

public interface BusService {

	public List<Bus> FindBuses(String source, String destination , Date department);
}
