package com.vic.Singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		//��ȡΨһ���õĶ���
	      SingleObject object = SingleObject.getInstance();
	 
	      //��ʾ��Ϣ
	      object.showMessage();
	}
}
