package com.cpattanaik.creational.builder;

public class NewBuilder {
	public static void main(String[] args) {
		Pizza p = new Pizza.PizzaBuilder(5).setY(7).build();
		p.show();
	}
	
	static class Pizza{
		 int x = 0;
		 int y = 0;
		 
		 public Pizza(PizzaBuilder pizzaBuilder) {
			this.x = pizzaBuilder.x;
			this.y = pizzaBuilder.y;
		 }
		 public void show(){
			 System.out.println(x+":"+y);
		 }
		 
		 
		 static class PizzaBuilder{
			 int x = 0;
			 int y = 0;
			 PizzaBuilder(int x){
				 this.x = x;
			 }
			public PizzaBuilder setY(int y) {
				this.y = y;
				return this;
			}
			public Pizza build() {
				return new Pizza(this);
			}
		}
	}
}





