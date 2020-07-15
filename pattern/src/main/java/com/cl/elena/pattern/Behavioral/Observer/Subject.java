package com.cl.elena.pattern.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 给当前主题增加观察者和状态，主要是添加观察者方法以及观察者的方法触发
 * @author charlie
 *
 */
public class Subject {

	public Subject() {
		// TODO Auto-generated constructor stub
	}

	private List<Observer> observers = new ArrayList<Observer>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	/**
	 * 为当前事件或者主题增加观察者
	 * 
	 * @param observer
	 */
	public void attach(Observer observer) {
		observers.add(observer);
	}

	/**
	 * 循环处理，类似广播的机制调用相关的观察者响应
	 */
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
