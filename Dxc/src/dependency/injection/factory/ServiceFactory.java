package dependency.injection.factory;


import dependency.injection.Service;

public class ServiceFactory {
	public Service getService(String serviceName){  
		if(serviceName == null){  
			return null;  
		}  
		if(serviceName.equalsIgnoreCase("AIRTEL")) {  
			return new AirtelService();  
		}   
		else if(serviceName.equalsIgnoreCase("VODA")){  
			return new VodafoneService();  
		}   
		else if(serviceName.equalsIgnoreCase("JIO")) {  
			return new JioService();  
		}  
		return null;  
	}
}