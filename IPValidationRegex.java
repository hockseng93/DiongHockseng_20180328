/**
 * @(#)IPValidationRegex.java
 *
 *
 * @author 
 * @version 1.00 2018/3/28
 */


public class IPValidationRegex {

    public IPValidationRegex() {
    }
    
    public static void main(String a[]){
     
     String[] ipAddr = {
                     	"0.0.0.0",
                        "255.255.255.255",
                        "255.255.255.256",
                        "192.168.255.256"
                       };
     
     for(int i = 0 ; i < ipAddr.length ; i++){
     	if(!isValidIP(ipAddr[i])){
     		System.out.println("Invalid IP Address ::" + ipAddr[i]);
     	}
     }
    }
    
    public static boolean isValidIP(String ipAddr){

      String[] parts = ipAddr.split("\\.");
    
      for(int i = 0 ; i < parts.length ; i++){
      	if(Integer.parseInt(parts[i]) < 0 || Integer.parseInt(parts[i]) > 255){
      		return false;
      	}
      }
      return true;
    }
}