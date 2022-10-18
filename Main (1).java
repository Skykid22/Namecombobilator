import java.util.*;
class Main{
  public static void main(String[]args){
   
    Scanner input = new Scanner(System.in);
    String names = "", newName = "";
   
    System.out.println("Please enter your first name: ");
    newName = input.next();
   
    names = add(names,newName); 
    
    System.out.println("Please enter your middle or nickname: ");
    newName= input.next();

    names = add(names,newName);
    
    System.out.println("Please enter your last name or family name: ");
    newName = input.next();

    names = add(names, newName);
    
    System.out.println("It's a pleasure to meet you, " + names + ".");
  }
  public static String add(String listOfNames, String thisName){
    listOfNames = listOfNames + " ";
    return(listOfNames.concat(thisName));
  }
}

