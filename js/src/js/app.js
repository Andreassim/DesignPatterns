"use strict"

console.log("----------- Factory method ----------")
class Person {
  #gender;

  constructor(gender) {
    this.#gender = gender
  };

  printGender = function () {
    console.log(this.#gender);
  };
}

class Woman extends Person {
  constructor() {
    super("Woman");
  }
}

class Man extends Person {
  constructor() {
    super("Man");
  }
}

class PersonFactory {
  create = function (gender) {
    switch (gender) {
      case "Woman":
        return new Woman();
      case "Man":
        return new Man();
      default:
        console.log("What are doing?")
    }
  }
}

const factory = new PersonFactory();

const henning = factory.create("Man")
const jakobine = factory.create("Woman")

henning.printGender();
jakobine.printGender();


// ------------ proxy ----------- //
class PersonProxy {
  #gender
  #person
  constructor(gender) {
    this.#gender = gender;
  }

  printGender = function () {
    if (this.#person === undefined) {
      this.#person = factory.createPerson(this.#gender); //fetch goes here
      this.#person.printGender();
    } else {
      this.#person.printGender();
    }
  }
  printTest= function (){
    if(this.#person){
      console.log("Got one")
    }else{
      console.log("nothing")
    }
  }
}

console.log("----------- Proxy ----------")

let proxy = new PersonProxy("Man");
proxy.printTest();
proxy.printGender();
proxy.printTest();



// ----------- abstract factory ---------- //
class CarB{
  #name
  constructor(name) {
    this.#name = name;
  }
  printName = function (){
    console.log(this.#name + ", Car B");
  }

}


class CarA {
  #name
  constructor(name) {
    this.#name = name;

  }
  printName = function (){
    console.log(this.#name + ", Car A")
  }
}

class PersonB{
  #gender

  constructor(gender) {
    this.#gender = gender
  }
  printGender = function () {
    console.log(this.#gender + " , B person");
  };
}

class FactoryA{
  createPerson = function (gender){
    return new Person(gender)
  }
  createCar = function (name){
    return new CarA(name)
  }
}

class FactoryB{
  createPerson = function (gender){
    return new PersonB(gender)
  }
  createCar = function (name){
    return new CarB(name)
  }
}


class SomeApplication{
  #person;
  #car;
  #factory;

  constructor(factory) {
    this.#factory = factory;
  }

  test = function (gender, name){
    this.#car = this.#factory.createCar(name);
    this.#person = this.#factory.createPerson(gender)
  }

  print = function (){
    this.#person.printGender()
    this.#car.printName()
  }
}

console.log("--------- abstract factory -----------")


let factoryA = new FactoryA();

let someTest = new SomeApplication(factoryA);
someTest.test("Man", "Toyota");
someTest.print();

let factoryB = new FactoryB();
someTest = new SomeApplication(factoryB);
someTest.test("Man", "Toyota");
someTest.print()





