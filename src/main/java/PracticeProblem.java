import java.io.*;
import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {

	}
public static String readFile(String filename){
	String file = "";
	FileReader s = null;
	int c;
	
	try{
		s = new FileReader(filename);
		while ((c=s.read())!=-1){
			file+=(char)c;
	}
	}
	catch(IOException e){
		System.out.println(e);
	}
	finally{
		try{
			if (s!=null){
			s.close();
			}
	}
		catch(IOException e){
		}
}	

file = file.strip();
return file;
	}
	
public static String backwardsReadFile(String filename){
	String file = "";
	int c;
	FileReader inputStream = null;
	
	try{
		inputStream = new FileReader(filename);
		while ((c = inputStream.read())!=-1 ){
			file = (char)c + file;
	}
	}
	catch(IOException e){
		System.out.println(e);
	}
	finally{
try{
	if (inputStream!=null){
		inputStream.close();
	}
}
catch(IOException e){
	System.out.println(e);
}
	}
	file = file.strip();
	return file;
}
}
