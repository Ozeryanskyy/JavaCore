package com.gmail.ozerianskyy;

public class Cat {
	private String name;
	private String color;
	private String favoriteFood;
	private double age;
	private double weight;

	public Cat(String name, String color, String favoriteFood, double age, double weight) {
		super();
		this.name = name;
		this.color = color;
		this.favoriteFood = favoriteFood;
		this.age = age;
		this.weight = weight;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void getVoice() {
		System.out.println(name + "say: Meow");
	}

	public void pet() {
		System.out.println(name + "say: Prrrrrrrr");
	}

	public void feed(int food) {
		weight = weight + food;
	}

	public void checkFood(String a) {
		if (a == favoriteFood) {
			System.out.println(name + "say: Prrrrrrr");
		} else {
			System.out.println(name + "say: Meow");
		}
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", favoriteFood=" + favoriteFood + ", age=" + age
				+ ", weight=" + weight + "]";
	}

}
