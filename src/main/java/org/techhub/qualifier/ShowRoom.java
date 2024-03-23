package org.techhub.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ShowRoom {
    @Autowired
    @Qualifier("c")
	private Vehicle vehicle;
	public void setVehicle(Vehicle vehicle)
	{
		this.vehicle=vehicle;
	}
	public void show()
	{
		vehicle.engine();
	}
}
