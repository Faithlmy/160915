package com.vic.builder;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();// Ϊʲô�᷵��Wrapper
	}
	
	@Override
	public abstract float price();
}
