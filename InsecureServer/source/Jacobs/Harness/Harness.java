package Jacobs.Harness;

import Jacobs.DataMining.DataMiner;

public class Harness {
	
	DataMiner miner;
	
	public Harness()
	{
		// Create dataminer
		// This keeps hold of all the points as well as additional info
		miner = new DataMiner(7, 1.0/69.0); // 7 points minimum for cluster
											// 1 mile max range between points in cluster
				
		// TODO - Instantiate whatever else here
	}
	
	public void AddPoint(double Longitude, double Latitude)
	{
		// Get raw value expressed as Degrees. Convert under assumption 1 degree ~= 60 miles.
		double raw = miner.AddLocation(Latitude, Longitude);
		
		// TODO - raw conversion to error level
	}

	
	
}
