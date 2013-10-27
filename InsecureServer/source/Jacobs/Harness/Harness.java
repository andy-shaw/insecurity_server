package Jacobs.Harness;

import Jacobs.DataMining.DataMiner;

public class Harness {
	
	DataMiner miner;
	
	public Harness()
	{
		// TODO - Nate - Create dataminer
		// This keeps hold of all the points as well as additional info
		miner = new DataMiner(7, 1.0/69.0);
				
		// 
		
	}
	
	public void AddPoint(double Longitude, double Latitude)
	{
		double raw = miner.AddLocation(Latitude, Longitude);
		
		// TODO - raw conversion to error level
	}

	
	
}
