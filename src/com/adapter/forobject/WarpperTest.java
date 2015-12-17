package com.adapter.forobject;

import com.adapter.forclass.Source;
import com.adapter.forclass.Targetable;

public class WarpperTest {

	
	public static void main(String[] args) {
		Source source = new Source();
		Targetable targetable = new Warpper(source);
		targetable.method1();
		targetable.method2();
	}
}
