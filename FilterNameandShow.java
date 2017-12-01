import java.io.*;
public class FilterNameandShow {
	public static void main(String args[]){
        File file = new File("C:/Users/LENOVO/Desktop");
        String[] files = file.list(new FilenameFilter() {
             
          
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".pdf")){
                    return true;
                } else {
                    return false;
                }
            }
        });
       for(int i=0;i<files.length;i++)
       {
    	   System.out.println(files[i]);
       }
        }
    }

