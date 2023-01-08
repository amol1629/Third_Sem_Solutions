package slip16;

import java.util.ArrayList;

public class Subject {
	private int number;
	
	private ArrayList<Observer> observers;
	
	public Subject() {
		observers = new  ArrayList<Observer>();
	}
	
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	public void notifyAllObservers() {
		for(Observer o :observers) {
			o.notifed(this);
		}
	}
	
	public void setNumber(int no) {
		this.number = no;
		notifyAllObservers();
	}
	
	public int getNumber() {
		return number;
	}
	
	
}
