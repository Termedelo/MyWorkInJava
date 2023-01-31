package fileClass2_ch3;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class All_In_One_IOFiles {
    public static void main(String[] args) throws FileNotFoundException , IOException {
    /*   file operations  
    Read from a file:
    1. FileInputStream
    2. Scanner
    3. FileReader
    4. FileReader and BufferedReader
    Write to a file:
    1. FileOutputStream
    2. FileWriter
    3. FileWriter and PrintWriter
    */  
    //////////////////////////////////////////////////////////////////
    // FileInputStream :
    File f1 = new File("ahmad.txt");    
    // the byte data type size is 1 bytes
    // the int data type size is 4 bytes
    // byte [] a1 = {2, 8, 9,1}; // 4 bytes
    // int [] a2 = {2, 8, 9,1};  // 16 bytes
    // how to input from a txt file ? by FileInputStream class 
    // 1) we need to use (import java.io.FileInputStream) first.
    // 2) then we need to declare an obj of class FileInputStream
    FileInputStream fin1 = new FileInputStream("ahmad.txt");
    FileInputStream fin2 = new FileInputStream(f1);
    // it throw an exception FileNotFoundException.
    // the exception class is (java.io.FileNotFoundException).
    // optional thing we can use this method printStackTrace() in catch part in try/catch.
    // file FileInputStream methods:
    // 1. read():
    // it doesn't receive any parameter.
    // it throw an exception IOException.
    // the exception class is (java.io.IOException).
    int x1 = fin1.read();
    System.out.println(x1);
    // it return int value that is in the ascii code.
    // it return -1 if the chars of the files is finished.
    // we can read dynamically from a file by for loop and length method that in File class.
    for (int i = 0; i < f1.length(); i++){
        int x2 = fin1.read(); // it get to the next Char automatically 
        /* important thing to notice
         notice that we have already invoked the read method up there 
         so the second time that will invoke in it will be affected
         it will start reading from the second letter in the file automatically
        */
        System.out.print((char)x2);
    }
    // we can also use :
    long size = f1.length();// length return long type.
    byte [] arr = new byte[(int)size];
    fin1.read(arr);
    String str1 = new String(arr);
    // the constructor reserves arr of byte then turn it into String as a whole.
    System.out.println(str1);
    ///////////////////////////////////////////////////////////////////////////////
    // FileOutputStream :
    FileOutputStream fout1 = new FileOutputStream("ismail.txt",true);
    // fout1 will continue on what is in the text file.
    FileOutputStream fout2 = new FileOutputStream("ismail.txt",false);
    // fout2 will clean the file then start writing from scratch.
    FileOutputStream fout3 = new FileOutputStream("ismail.txt");
    // the same as fout2
    // the reason why it won't throw (FileNotFoundException)? 
    // it will create the file that we send if it doesn't exist.
    // why despite that we need to write (throws FileNotFoundException)?
    // in fact the user may don't have the ability to create file in the given path.
    // file FileOutputStream methods:
    // 1. write() :
    // it doesn't receive any parameter.
    // it throw an exception IOException.
    // the exception class is (java.io.IOException).
       fout1.write('B');
       fout1.write(65);
       char x2 = 'U';
       fout1.write(x2);
       int x3 = 67;
       fout1.write(x3);
       // we can write a bunch of words dynamically by this :
       String str2 = "Al-Balqa Applied University";
       for (int i=0; i<str2.length() ; i++)
       fout1.write(str2.charAt(i));
       // it write char by char.
       String str3 = "Java Language";
       byte [] arr1 = str3.getBytes();
       // getBytes() :
       // it doesn't receive any parameter.
       // it return a byte array with the ascii code of all letters. 
       fout1.write(arr1);
       // close():
       // it doesn't receive any parameter.
       // it return void 
       // why we need to use close method?
       // because it help the system to close the stream and free up some data.
       fout1.close();
       //////////////////////////////////////////////////////////////
       // Example :
       Scanner scan1 = new Scanner (System.in);
       File f3 = new File("grades.txt");
       FileOutputStream fout4 = new FileOutputStream(f3 , true);
       String line = "";
       for (int i=1; i<=5 ; i++)
       {
        System.out.print("Enter name");  
        String name = scan1.next();
        System.out.print("Enter mid");  
        int mid = scan1.nextInt();
        System.out.print("Enter final");  
        int final_grade = scan1.nextInt();
        line = name + "\t" + mid + "\t" + final_grade +"\n";
        byte [] arr2 = line.getBytes();
        fout4.write(arr2); 
       }
       fout4.close(); 
       //////////////////////////////////////////////////////////////////////
       // Scanner :
       // nextLine() function reads Line by Line.
       // next() function reads word by word.
       Scanner scan2 = new Scanner(f1);
       // we send inside the Scanner constructor a file obj to read data within it.
       // it throw an exception FileNotFoundException.
       // the exception class is (java.io.FileNotFoundException).
       String name1 = scan2.nextLine(); 
       // it will read the first line.
       System.out.println(name1);
       String name2 = scan2.nextLine(); 
       // it will read the second line.
       System.out.println(name2);
       String name3 = scan2.nextLine(); 
       // it will read the third line.
       System.out.println(name3); // run-time error (our file includes only 3 lines)
       // and so on...
       // If the lines of the file are finished what happened and we have unfinished scan?
       // simply it will throw an exception (noSuchElementException) run time exception.
       while (scan2.hasNext()){
       String st = scan2.nextLine();
       System.out.println(st);
       // System.out.println(scan.nextLine());
       } 
       // hasNext() : a method from Scanner Class 
       // it doesn't receive any parameter.
       // it return a boolean
       // it return true if the file Lines has a next Line.
       // it return false if the file Lines hasn't a next Line.
       //////////////////////////////////////////////////////////////////////
       // Scanner (part 2)
       // to cast String class to Integer class 
       // 1. parseInt()
       // we need to invoke it by the (Integer,Double,...) class 
       // (Integer,Double,...).parseInt(String);
       // it will return the (Integer,Double,...) value that the String represent.
       // int x = Integer.parseInt("29") it will return 29 as Integer.
       // 2. valueOf()
       // we need to invoke it by the Integer class 
       // Integer.valueOf(StringValue);
       // it will return the int value that the String represent.
       // int x = Integer.valueOf("29") it will return 29 as Integer.  
       /*
        we can use next(), nextInt() , ... to read the values directly from the file.
        but you need to give attention where the cursor | will stop when reading.
        e.g a line into a file contain "ahmad 27 20 50"
        String = inFile.next(); // ahmad the cursor stopped right after ahmad
        int = inFile.nextInt(); // 27 the cursor stopped right after 27
        int = inFile.nextInt(); // 20 the cursor stopped right after 20
        int = inFile.nextInt(); // 50 the cursor stopped right after 50
        then it should stop by the hasNext() method condition.
       */  
       //////////////////////////////////////////////////////////////////
       // FileReader and BufferedReader
       // at first we need to import java.io.FileReader
       // the second step is that we need to import java.io.BufferedReader
       /* 
        * we need to create this obj FileReader name1 = new FileReader("path")
        * this deceleration will throw an exception FileNotFoundException
        */
       // then we need to declare another obj BufferedReader name2 = new BufferedReader(name1)
       // to count the numbers of lines in the file we can use name2.readLine() != null condition.
       // the function in FileReader class read() reads char by char and return the ascii int value. 
       // readLine() :
       // it is a BufferedReader method
       // it return String if it found a Line to read it as a whole
       // it return null if it doesn't found a Line to read it as a whole 
       /*
        * to retune the cursor to the beginning of the file we use: 
        * name1 = new FileReader("path");
        * name2 = new BufferedReader(name1);
        */
      /*
       * we can store the contents of the file into an array of String Line by Line. 
       * the array must have the same size as the Lines of the file (we can count them)
       * and then we just need to readLine the whole file into a loop with the Lines size
       * then use name1.close() , name2.close() to close buffers.
       */
       //////////////////////////////////////////////////////////////////
       // FileWriter and PrintWriter
       // at first we need to import java.io.FileWriter
       // the second step is that we need to import java.io.PrintWriter
       /* 
        * we need to create this obj FileWriter name3 = new FileWriter("path",append)
        * append : true or false(default).
        * this deceleration will throw an exception IOException
        * it will create the file if it doesn't found it.
        */
       // then we need to declare another obj PrintWriter name4 = new PrintWriter(name3)
       // name4.print("String")
       // note: we must use close() or flush() after write so that it work.
    }
}
 /*
  *  System.out.println(buf.readLine());
  *  while (buf.readLine() != null) {
  *    System.out.println(buf.readLine());
  *  }     
  */
