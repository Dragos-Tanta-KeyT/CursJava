package curs12;

import java.util.HashMap;
import java.util.Map;

public class CoduriPostale {
	
	Map <Integer, String> map = new HashMap<>();
	
	public CoduriPostale() {
		map.put(400, "Iasi");
		map.put(117, "Pitesti");
		map.put(250, "Cluj");
		map.put(315, "Bucuresti");
		map.put(600, "Constanta");
		map.put(824, "Brasov");	
	}
	//CoduriPostale cp = new CoduriPostale();
	
	public String cautaOras(int codPostal) throws CodPostalException {
		
		if(map.containsKey(codPostal)) {
			
			return map.get(codPostal);
			
		}else {
			
			throw new CodPostalException("Cod postal nu exista!");
		}
		
	}

}
