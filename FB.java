import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Console;

// FreeBasic style functions for Java by Matt B

public class FB {

	public static void main(String[] args) {
		
	}

//=================================================================================  
public static String Get_File$(String filen) {
// Reads a file line by line and Returns a file's contents as a string
String fileData="";
                    try {
			File file = new File(filen);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
			fileReader.close();
			
		       fileData=(stringBuffer.toString()); 
                       } catch (IOException e) {
			e.printStackTrace();
		       }

return fileData;
}
//================================================================================= 
public static void Put_File$(String filen, String writeData) {
//Writes a string buffer to a file	
		
		try {
			File file = new File(filen);
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(writeData);
                        fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();

		}
}
//================================================================================= 
public static Integer LEN(String z) {
// Returns the length of a string
return z.length();
}
//================================================================================= 
public static String MID$(String z, int s1, int s2) {
// Returns the substring at S1 to S2
if (s1<1) {
s1 = 1;
}

int s3 = s1+s2;
int s4 = s1;
int s5;
s4--;
s5 = s4+s2;

if (s5>z.length())
{
s5=z.length();
} 
return z.substring(s4,s5);
}
//=================================================================================
public static String INPUT$(String z) {
// Takes input and returns a string. z = prompt
    Console c = null;
    String strg = null;   
    c = System.console();
    strg = c.readLine(z);

return strg;
}
//=================================================================================
public static int ASC(String z) {
// Returns the ASCII value of the 1st char in z
   String s = z;
   char c = s.charAt(0);
   int av = c;
    
return av;
}
//=================================================================================
public static String CHR$(int c) {
// Returns the Character based on the ASCII value of c
   int av = c;
   char c1 = (char) av;
   String c2 = Character.toString(c1);

return c2;
}
//=================================================================================
public static int VAL(String z) {
// Returns the value of a string

return Integer.valueOf(z);
}
//=================================================================================
public static String STR$(int c) {
// Converts an int c to a string and returns the string

return Integer.toString(c);
}
//=================================================================================
//
}
