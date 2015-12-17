package com.adapter.forobject;

import com.adapter.forclass.Source;
import com.adapter.forclass.Targetable;

public class Warpper implements Targetable{

	private Source source;
	
	public Warpper(Source source) {
		super();
		this.source = source;
	}
	
	
	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("this is warpper method");
	}

	
}
