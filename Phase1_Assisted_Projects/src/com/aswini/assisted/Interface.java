package com.aswini.assisted;

interface Interface 
{  
public default void display()   
{  
System.out.println("the display() method of Interface invoked");  
}  
}  
interface DemoInterface2  
{  
public default void display()   
{  
System.out.println("the display() method of Interface2 invoked");  
}  
}  
class Daimondprblm implements Interface, DemoInterface2  
{  
public void display()   
{  
Interface.super.display();  
DemoInterface2.super.display();  
}  
public static void main(String args[])   
{  
	Daimondprblm obj = new Daimondprblm();  
obj.display();  
}  
}
