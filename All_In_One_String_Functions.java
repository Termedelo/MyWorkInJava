package StrClass_Ch1;
import java.lang.StringBuffer; 
// the class name is StringBuffer.
// you don't need to import it to use its methods.
public class All_In_One_String_Functions  {
    public static void main(String[] args) {
    // The difference between String and char.
    // 1) String is a class.
    // 2) char is a data type (int, long, float, double, boolean, short, byte, char).
    // 3) String str =... , str is a reference to object.
    // 4) char c1=..., is a variable.
    // 5) str can call other methods.
    // 6) c1 can NOT call other methods.
    // 7) Use double quotation with String.
    // 8) Use single quotation with char.
    /*_____________________________________________________*/
    // String Constructors:
    // To define an object of class String you can use one of the following two methods:
    // Method1: Using String literal
    String str="String";
    String str1 = new String(); //empty constructor.
    String str2 = new String("String");//String constructor.
    String str3 = new String (str);//a variable constructor.
    char [] f = {'A','r','r','a','y'};//array of char.
    String str4 = new String (f);//array of char constructor.
    System.out.println(str4);
    /*_____________________________________________________*/
    // Common methods of class String
    //1. length().
    // It does NOT receive any parameter, *it has only an empty constructor*.
    // It returns int value.
    // it returns the number of char in a string.
    /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //2. charAt().   
    // It receives int parameter,charAt(index of char:int).
    // It returns char value.
    // it returns a char of a specific index.
    // if you entered an index that not exist it will throw exception (StringIndexOutOfBoundsException).
    /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //3. substring()
    // It receives either (begin Index:int) or (begin Index:int,end Index:int).
    // It returns String.
    // it has 2 Contractors.
    // it includes the begin char and doesn't includes the end char.
    // it returns a specific Piece of a String.
    // if you entered an index that not exist it will throw exception (StringIndexOutOfBoundsException).
    /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //4. indexOf()
    // It returns int value.
    // Four forms of this method:
    // indexOf(char):
    // it returns the index of this char.
    // indexOf(String):
    // it returns the index of the first char in that String.
    // indexOf(char, begin Index:int):
    // it returns the index of the first char after the int index.
    // indexOf(String,begin Index:int):
    // it returns the index of the first char index in the string after the int index.
    // it has 2 Contractors.
    // it includes the begin index in the searching processes.
    // if the char or String isn't found it return -1.
    /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //5. lastIndexOf()
    // It is the same as indexOf with regard to parameters and return value.
    /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //6. toUpperCase
    //7. toLowerCase
    // They return String 
    // They have no parameters
    /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //Cascading method calls:
    // obj.method1().method2().method3();
    // In the above statement, we have an object (obj) and
    // calling method1() then method2(),after that the method3(). So, 
    // calling or invoking methods one after another is known as method chaining.
    // only when the previous method returns String.
    /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //8. trim()
    // It has no parameter
    // It returns String
    // It removes the leading spaces
    String s1="     a h m a d    ";//a h m a d
    System.out.println(s1.trim().length());//9
    // بتشيل الفراغات الي بالمقدمة او الي قبل الكلام
    /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //9. toCharArray.
    // It has no parameters.
    // It returns char array.
    // we use (String.length()) to get a String length.
    // we use (arrayName.length) to get an array length.
    /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //10. split()   
    // It receives String as a parameter (String),(String,int:the array limit). مش مهم
    // It returns String array.
    // you need to give it the String that you want to split from it.
    /*  
       if we want to split from a string that doesn't exist in the main 
       string it wont work and the array that the method will return will
       be empty.
    */ 
    //spacial case:
    String st1 = "cat and mouse";
    String [] arr = st1.split("");
    // arr[]-> {"c","a","t"," ","a","n","d"," ","m","o","u","s","e"}
    System.out.println(arr[1]);// a
    System.out.println(arr.length);// 13 
    /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //11. replace();
    // It returns String.
    /*  
       if we use a char or string as an "old" 
       and it was't in the string it will return the same String
    */ 
    // We will focus in two forms: 
    // (target:String, replacement:String)  (oldChar:char, newChar:char).
    /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //12.  equals
    //13.  equalsIgnoreCase
    // They return boolean value
    // They receive String object as a parameter
    // it returns true if the two strings are the same 
    // it returns false if the two strings are't the same         
    /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
    // 14. compareTo
    // 15. compareToIgnoreCase
    // They return int value 
    // They receive String object as a parameter        
    // it returns the difference between the letters in the two words one by one.
    // ex: "ahmad".compareTo("Ahmad") a = 97 , A=65 this is 97-65=32.
    // the difference between any to small to capital letter is 32 .
    // the difference between any to capital to small letter is -32 .
    System.out.println("Amjad".compareTo("Ahmad"));
    // A-A is 0 
    // m-h = 109-104 = 5
    }
}
