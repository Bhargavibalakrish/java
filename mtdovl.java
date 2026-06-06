class mtdovl {
	int a=5;
  public void animalSound() {
	  
    System.out.println("The animal makes a sound");
  }
}

class Pig extends mtdovl {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends mtdovl {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
  public static void main(String[] args) {
    mtdovl myAnimal = new mtdovl();
    mtdovl myPig = new Pig();  
    mtdovl myDog = new Dog();  
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}