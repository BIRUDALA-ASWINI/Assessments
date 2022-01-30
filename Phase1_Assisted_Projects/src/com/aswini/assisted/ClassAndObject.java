package com.aswini.assisted;

public class ClassAndObject {
	  boolean isOn;
	  void turnOn() {
	    isOn = true;
	    System.out.println("Light on? " + isOn);
      }
	  void turnOff() {
	    isOn = false;
	    System.out.println("Light on? " + isOn);
	  }
	}
class Main {
public static void main(String[] args) 
{
ClassAndObject led = new  ClassAndObject();
ClassAndObject halogen = new  ClassAndObject();
	    led.turnOn();
	    halogen.turnOff();
	  }
	}
