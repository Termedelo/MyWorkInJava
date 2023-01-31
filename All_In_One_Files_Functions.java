package fileClass_Ch3;
import java.io.File;
import java.io.IOException;
// I refers to input (read).
// O refers to Output (write).
public class All_In_One_Files_Functions {
    public static void main(String[] args) throws IOException {
      File f3 = new File(""); 
      // f3 is considered as the package folder. 
      File f1 = new File("ahmad.txt");
      File d1 = new File("fileClass_Ch3");
      File f2 = new File("C:\\Users\\2021\\Documents\\oo.txt");
      File d2 = new File("C:\\Users\\2021\\Documents\\OO");
      // 1.Storing data:
      // Temp: using variables and arrays
      // Permanent: using files or database
      // 2. Difference between file and folder
      // 3.File properties 
      // there is three methods to defined a file object :
      // method 1 : 
      // when we have a regular path for a file :
      // File name = new File("your path as a String\\fileName.type");
      // at the end of the path you must add the file type.
      // method 2 : 
      // when we have a regular path for a folder:
      // File name = new File("your path as a String\\folderName");
      // at the end of the path you mustn't add any type. 
      // we use the first two methods when the file isn't in the package folder.
      // method 3:
      // when we have a file or a folder in are the general package :
      // File name = new File("your file or folder name as a String");
      // here we just use the name only. 
      // File methods :
      // 1. exists() :Boolean 
      // it doesn't receive any parameter.
      // it return true if the file or folder is exist.
      // it return false if the file or folder isn't exist.
      /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
      // 2. delete() :Boolean
      // it doesn't receive any parameter.
      // it return true if the file or folder is exist and deleted.
      // it return false if the file or folder isn't exist neither deleted.
      /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
      // 3. getName() :String
      // it doesn't receive any parameter.
      // it return a string.
      // This is just the last name in the pathname's name sequence. 
      // If the pathname's name sequence is empty, then the empty string is returned.
      /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
      // 4. getPath() :String
      // it doesn't receive any parameter.
      // it return a string.
      // it get us the paths files and folders (outside general package).
      // it get us the name fo files and folders (inside general package).
      /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
      // 5. getAbsolutePath() :String
      // it doesn't receive any parameter.
      // it return a string.
      // it get us the paths of files and folders (inside and outside general package).
      /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
      // 6. getParent() :String
      // it doesn't receive any parameter.
      // it return a string.
      // it return null if the file or the folder is in the general package.
      // it return the path name without the file or the folder name if it was outside the general package.
      /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
      // 7. getAbsoluteFile() :FileObject || print absolutePath *just print not return S*
      // it doesn't receive any parameter.
      // it return the File object reference or it print the absolutePath name.
      /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
      // 8. getParentFile() : parentFileObject || print absolutePath *just print not return S*
      // it doesn't receive any parameter.
      // it return null if the file or the folder is in the general package.
      // it return a the parentFile object reference or it print the parentPath name.
      /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
      // 9. isDirectory() :Boolean
      // it doesn't receive any parameter.
      // it return true if the object is folder.
      // it return false if the object is file. 
      /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
      // 10. isFile() :Boolean
      // it doesn't receive any parameter.
      // it return true if the object is file.
      // it return false if the object is folder.
      /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
      // 11. length() :long   
      // it doesn't receive any parameter.
      // it return the size of the file or folder in bytes.
      /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
      // 12. mkdir() :Boolean
      // it doesn't receive any parameter.
      // it create a folder in the object path.
      // it return true if the folder is created successfully.
      // it return false if the folder isn't created successfully.
      // if the folder is already exist with the same path it return false.
      // File d2 = new File("C:\\Users\\2021\\Desktop\\my work in java\\ahmad");
      // System.out.println(d2.mkdir());
      /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
      // 13. createNewFile() :Boolean
      // it doesn't receive any parameter.
      // it create a file in the object path.
      // it return true if the file is created successfully.
      // it return false if the file isn't created successfully.
      // if the file is already exist with the same path it return false.
      // File d2 = new File("C:\\Users\\2021\\Desktop\\my work in java\\ahmad.txt");
      // System.out.println(d2.createNewFile());
      // this function may throw an exception so we have to handel it by:
      // 1) importing (java.io.IOException).
      // 2) adding throws IOException to the main (بشكل مبدئي).
      // see the example in File_part3 (the loop one).
      /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
      // 14. setReadOnly() :Boolean
      // it doesn't receive any parameter.
      // it sets the file to the readOnly setting.
      // it return true if the file is set to readOnly successfully.
      // it return false if the file isn't set to readOnly successfully.
      /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
      // 15. list() :StringArray
      // it doesn't receive any parameter.
      // we use it with folders to show the folder contents.
      // it return a stringArray with the folder contents names.
      // it list the contents alphabetically from a to z.
      /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
      // 16. listFiles() :fileObjectsArray
      // it doesn't receive any parameter.
      // we use it with folders to control the folder contents.
      // it return fileObjectsArray with the folder contents references.
    }
}