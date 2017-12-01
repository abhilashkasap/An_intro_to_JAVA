import java.io.*;
import java.util.*;
public class CustomException {
	    public static void main(String[] a){
	        try{
	            CustomException.myTest(null);
	        } catch(MyAppException mae){
	            System.out.println(mae);
	        }
	    }
	     
	    static void myTest(String str) throws MyAppException{
	        if(str == null){
	            throw new MyAppException("String val is null");
	        }
	    }
	}
	 
class MyAppException extends Exception {
	 
	    String message = null;
	 
	    public MyAppException(String message) {
	        this.message = message;
	    }
	    public String toString() {
	        return message;
	    }
	 }

