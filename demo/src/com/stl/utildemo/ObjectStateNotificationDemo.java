package com.stl.utildemo;

import java.util.Observable;
import java.util.Observer;

public class ObjectStateNotificationDemo {

	public static void main(String[] args) {
		ObservableObject objObservable = new ObservableObject("software");
		
		//No observer added and value changed
		objObservable.changeValue("hardware");
		
		//Add observer and change value
		ObserverObject objObserverObject = new ObserverObject() ;
		objObservable.addObserver(objObserverObject);
		objObservable.changeValue("communication");
		
	}//end of main method

}//end of class ObjectStateNotificationDemo
/***************************************************
 * This class Object states are going to observed by
 * the observers
 * @author ranavir
 * @date 12-6-2016
 ***************************************************/
class ObservableObject extends Observable{
	String strObservedValue  ;
	public ObservableObject(String strObservedValue){
		this.strObservedValue = strObservedValue ;
		System.out.println("ObservableObject created with Value : "+strObservedValue);
	}//end of param constructor
	public void changeValue(String strNewValue) {
		
		// if value is changing notify observers
	   if(!this.strObservedValue.equals(strNewValue)) {
	   System.out.println("ObservableObject Value is changing to : "+strNewValue);
	   this.strObservedValue = strNewValue;
	         
	   // mark as value changed
	   setChanged();
	   // trigger notification
	   notifyObservers(strNewValue);
	   }
	}
	
	
}//end of class ObservableObject
/****************************************************
 * This class objects will act as observers
 * @author ranavir
 * @date 12-6-2016
 ***************************************************/
class ObserverObject implements Observer{

	@Override
	public void update(Observable obj, Object arg) {
		System.out.println("ObserverObject notified about the change with Value : "+arg);
		
	}//end of overridden update method
	
}//end of class ObserverObject