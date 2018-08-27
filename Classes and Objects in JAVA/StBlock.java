import java.util.Scanner;

class House

{

    String houseno;

    static String street;

    static

    {

        street="Caramel Lane";

    }

}

class StBlock

{

    public static void main(String[] args)

    {

        House h1=new House();

        h1.houseno="101A";

        House h2=new House();

        h2.houseno="102A";

        System.out.println("House number "+h1.houseno+" is in "+h1.street);

        System.out.println("House number "+h2.houseno+" is in "+h2.street);

    }

}