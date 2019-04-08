package com.company;

public class Cat {
    private String name;
    private String gender;
    private int years;
    private String breed;
    private String color;
    private double velosity =0;

    void theVoiceOfTheCat(){
        System.out.println("The Voice Of The Cat: Miaou-Miaou-Murrrr!!!");
    }
    void slepp(){
        System.out.println("How to describe a dream :DD: brrrrr-brrrr-nyam-nyam");
    }


    public Cat(String name, String gender, int years, String breed, String color) {
        this.name = name;
        this.gender = gender;
        this.years = years;
        this.breed = breed;
        this.color = color;
    }

    public Cat() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYears() {
        return years;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   // public void setYears(int years) {
   //     this.years = years;
   // }
    void print() {

         System.out.println(
                 "This is my Cat"+ '\n'+
                 "Name= " + getName() + ";" + '\n' +
                 "Gender= " + getGender() + ";" +'\n' +
                 "Years= " + getYears() + ";" + '\n' +
                 "Breed= " + getBreed() + ";" + '\n' +
                 "Color= " + getColor() + ";" + '\n'
                 );
    }
    Cat setNewYears(Cat a,int newYears) {
        a.years = newYears;
        return a;
    }

}