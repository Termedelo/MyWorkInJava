package ArrayListClass_Ch2;
import java.util.ArrayList;
/**
 * All_In_One_ArrayList_Functions
 */
public class All_In_One_ArrayList_Functions {
   public static void main(String[] args) {
   // the main difference between classical array and arrayList:
   // 1) the classical array size is static. 
   // 2) the arrayList size is Dynamic.
   // 3) when you use the classical you don't need to use import.
   // 4) when you use the arrayList you need to import java.util.ArrayList.
   // 5) the classical array could be an array of objects or an array of variables.
   // 6) the arraylist is an array of objects only. 
   // 7) we can't use the classical array name to print it all, we have to use loop
   //    or it will print the first element reference (e.g sd23kj@lang...)
   // 8) we can use only the name of an arrayList to print it all (e.g [ object , object ,... ])
   //    there is a difference between primitive data and classes (e.g int , Integer).
   //    we can call methods by Integer var but we cant do it by int var.
   //_______________________________________________________________________________
   // how to decelerate an arrayList
   // How to create array list in five methods:
   // 1) ArrayList<classDataType> Name = new ArrayList<>();// default capacity = 10 
   // 2) ArrayList<classDataType> Name = new ArrayList<classDataType>(); //بعطي تحذير  
   // 3) ArrayList<classDataType> Name = new ArrayList<classDataType>(initial capacity: number);  
   // 4) ArrayList<classDataType> Name = new ArrayList<classDataType>(arrayListName);
   // *5) ArrayList<classDataType> Name = new ArrayList<*classDataType*>(Arrays.asList(var,var,...));
   // *6) ArrayList<classDataType> Name = new ArrayList<*classDataType*>(List.Of(var,var,...));
   //________________________________________________________________________________________
   // ArrayList methods :
   // 1. size() : It gives the size of the ArrayList – Number of elements of the list.
   // it doesn't receive any data type
   // it return int data type
   /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
   // 2. add(object) : This method adds an object o to the arraylist.
   //    add(index,object): It adds the object o to the array list at the given index.
   // when adding with an index to a specific index it shift the arrayList and add it.
   // when adding with a specific index it must be within the size or equal size. 
   // it receive object or it receive object and int for index.
   // add(object) return boolean data type. 
   // true: if the object have been added successfully.
   // false: if the object haven't been added for any reason.
   // add(index,object) doesn't return.** warning
   /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
   // 3. get(index)
   // it receive int data type as an index .
   // it returns the same type of object as the arrayList.
   /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
   // 4. contains()
   // it receive the same type of object as the arrayList.
   // true: if the object have been founded successfully.
   // false: if the object haven't been founded successfully.
   /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
   // 5.indexOf()
   // 6.lastIndexOf()
   // it receive just one parameter the same type of object as the arrayList.
   // it return int(index) if the object is in the arrayList and -1 if not.
   /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
   // 8. set()
   // it override a index specific and edit it.
   // it receive two parameters (index,object).
   // the index value must be within size and not equal to it.
   // it return the object that have been changed you can store it and use it.
   /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
   // 9. remove(index)
   //    remove(value)
   // case one : 
   // it remove a specific value and shrinks the arrayList.
   // it receive one parameter index or value(object).
   // it return the value that the method removed it.
   // case two : 
   // if it receive an object value (new object(...) or obj var) it will remove the object it self. 
   // it return a boolean true if it removed it successfully false if not. 
   // if a specific object is duplicated it will remove the first one then the second one.
   /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
   // 10. clear()
   // it clear all the objects in the arrayList.
   // it doesn't receive any parameter.
   // it doesn't return any data type.
   /*<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>*/
   // 4) ArrayList<classDataType> Name = new ArrayList<classDataType>(arrayListName);
   // this just reserves the size of arrayList That we send.
   // String a = "a"+"b";
 } 
}
