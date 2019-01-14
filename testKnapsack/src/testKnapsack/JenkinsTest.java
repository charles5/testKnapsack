package testKnapsack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class JenkinsTest {
	
	List<Integer> listWeight = new ArrayList();
	List<Integer> listValue = new ArrayList();
	
	public String getKnapsackTest() {
		String response = null;
		
		Integer maxValue = 50;  
				
		listWeight.add(10);
		listWeight.add(20);
		listWeight.add(30);
		
		listValue.add(60);
		listValue.add(100);
		listValue.add(120);
		
		HashMap<Integer, Integer> hmMaxToMin = new HashMap<>();
						
		List<Integer> maxToMin = new ArrayList();
		
		int count = 0;
				
		for (Integer valueFor : listWeight) {
			if (valueFor.compareTo(maxValue) < 1) {
				hmMaxToMin. put(valueFor, listValue.get(count));
				maxToMin.add(listValue.get(count));
			}
			count ++;
		}
		
		maxToMin.sort(Comparator.reverseOrder());
		
		
		
		List<Integer> maxValueList = new ArrayList();
		
/*		for (Integer valueFor : listWeight) {
			count ++;
			if (valueFor.compareTo(maxValue) < 1) {
				Integer tempValue = listValue.get(count);
				
				listValue.
			}
		}*/
		
		response = "Testting new project";
		
		return response;
	}
}
