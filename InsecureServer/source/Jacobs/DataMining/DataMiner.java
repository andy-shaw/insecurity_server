package Jacobs.DataMining;

import java.util.HashSet;
import java.util.Set;

public class DataMiner implements IDataMiner {

	// TODO - Have a system to hold all points
	// Or just grab from sql database if not in memory
	
	Set<DataPoint> points;
	int kThreshold;
	double dThreshold;
	
	public DataMiner(int groupMinimumSize, double distanceThreshold) {
		points = new HashSet<DataPoint>();
		this.kThreshold = groupMinimumSize;
		this.dThreshold = distanceThreshold;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world");
	}
	
	private double Distance(DataPoint point1, DataPoint point2) {
		return Math.sqrt(Math.pow((point1.latitude + point2.latitude), 2)
				       + Math.pow((point1.longitude * point2.longitude), 2));
	}
	
	private boolean IsNoise(DataPoint point, double distance, int threshold) {
		// Keep track of number of points within distance
		int numberPoints = 0;
		
		// For each point, check if within distance
		for (DataPoint p : points)
		{
			if (Distance(point, p) < distance)
			{
				numberPoints++;
			}
		}
		
		return numberPoints < threshold;
	}
	
	private int ClassifyCluster(DataPoint point) {
		// TODO - implement
		
		return 0;
	}

	@Override
	public double AddLocation(double latitude, double longitude) {
		// All points have latitude, longitude, and cluster #
		// When adding new point
		//  *Determine if point is noise point
		//  *Determine cluster number
		//  Cluster #0 is reserved for noise points
		//  This points will be updated periodically
		//  and assigned to a cluster if/when there are enough
		//  to warrent a clustering
		
		double rawRisk = 0;
		DataPoint temp = new DataPoint(latitude, longitude, 0);
		
		// Check if point is noise
		if (!IsNoise(temp, dThreshold, kThreshold)) {
			// If not noise: Figure out the cluster it belong to
			int cluster = ClassifyCluster(temp);
			temp.SetCluster(cluster);
		}
		// TODO - Classify security level of point
		
		
		
		return rawRisk;
	}
	
	public void UpdateNoisePoints() {
		// For all noise points
		
		// Check if point is still noise
		
		// If not: Figure out cluster point belongs to
		
	}

}
