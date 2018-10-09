 interface Animal1
{
  
  void speak();

  void eat();

}

class Dog implements Animal1
{

   public void speak()
{

    System.out.println("Dog barks");

  }

   public void eat()
{
 
   System.out.println("Dog eats");

  }

}
class Cat implements Animal1
{

  public void speak()
{

    System.out.println("Cat Meow");

  }

  public void eat()
{

    System.out.println("Cat eats");

  }

}

 class Inter
{

  public static void main(String[] args)
{

    Animal1 d=new Dog();

    Animal1 c=new Cat();

    d.speak();

    d.eat();

    c.speak();

    c.eat();

  }

}