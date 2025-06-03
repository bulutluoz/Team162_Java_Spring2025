package day08_abstraction;

public abstract class C07_AbstractParent extends C06_AbstractGP{

    // Class 'C07_AbstractParent' must either be declared abstract
    // or implement abstract method 'method1()' in 'C06_AbstractGP'
    // Ya C07'yi abstract yap,
    // YA DA C06'daki abstract method'lari implement et

    // abstract bir class'in abstract child class'i olabilir
    // abstract child parent class'daki method'lari override etmek
    // ZORUNDA DEGILDIR
    // Yeni kurallar koymak veya
    // varolan kurallari child clas'lari icin degistirmek
    // amaciyla olusturulur

    public void method1(){

    }

    public abstract String method5();

    public void method6(){

    }



}
