package com.study.oop.dt.HFJ;

import java.io.NotSerializableException;

//定义一个接口
interface Nose {
	public int iMethod();
//	public String name();
}

//定义一个抽象类
abstract class Picasso implements Nose {
	public int iMethod(){
		return 7;
	}
}

//
class Clowns extends Picasso {
	
}

class Acts  implements Nose {
	public int iMethod(){
		return 5;
	}
}
public class Of76Work extends Clowns {

	public static void main(String[] args) {
		Nose[] i = new Nose[3];
		i [0] = new Acts();
		i [1] = new Clowns();
		i [2] = new Of76Work();
		
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j].iMethod() + " " + i[j].getClass().getSimpleName());
		}
	}
}
