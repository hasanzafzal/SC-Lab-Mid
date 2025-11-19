import java.util.Scanner;
import java.util.ArrayList;


class Car
{
    private String model;
    private int speed;

    public Car(String model, int speed)     //constructor
    {
        this.model = model;
        this.speed = speed;
    }

    public int getSpeed()   //getter method
    {
        return speed;
    }
    public String getModel()
    {
        return model;
    }

    public void show()      //Displays the model and speed of the car
    {
        System.out.println(model + " | " + speed + " km/h");
    }
}

class Driver
{
    private String name;
    private double rating;

    public Driver(String name, double rating)       //constructor
    {
        this.name = name;
        this.rating = rating;
    }

    public double getRating()       //getter method
    {
        return rating;
    }
    public String getName()
    {
        return name;
    }

    public void show()      //Displays the name and rating of the driver
    {
        System.out.println(name + " | Rating: " + rating);
    }
}

public class F1RaceManager      //Main Class
{
    public static void main(String[] args)      //Main Function
    {
        Scanner sc = new Scanner(System.in);

        // ArrayList of Car objects
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Scuderia Ferrari HP -- SF-25", 350));
        cars.add(new Car("Mercedes AMG Petronas -- W16", 330));
        cars.add(new Car("Oracle RedBull Racing -- RB21", 340));
        cars.add(new Car("Mclaren F1 Team -- MCL-39 ", 355));
        cars.add(new Car("Aston Martin Aramco -- AMR-25", 325));
        cars.add(new Car("Atlassian Williams Racing -- FW-47", 330));
        cars.add(new Car("Visa Cash App Racing Bulls -- VCARB-02", 326));
        cars.add(new Car("Stake F1 Team | Kick Sauber -- C-45", 320));
        cars.add(new Car("BWT Alpine F1 Team -- A525", 315));
        cars.add(new Car("MoneyGram Haas F1 Team -- VF-25", 310));

        // ArrayList of Driver objects
        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver("Max Verstappen (1)", 96));
        drivers.add(new Driver("Lewis Hamilton (44)", 97));
        drivers.add(new Driver("Charles Leclerc (16)", 89));
        drivers.add(new Driver("Lando Norris (4)", 88));
        drivers.add(new Driver("Carlos Sainz (55)", 86));
        drivers.add(new Driver("George Russel (63)", 87));
        drivers.add(new Driver("Sebastian Vettel (5)", 95));
        drivers.add(new Driver("Fernando Alonso (14)", 90));
        drivers.add(new Driver("Isack Hadjar (6)", 75));
        drivers.add(new Driver("Valterri Bottas (77)", 87));
        drivers.add(new Driver("Oscar Piastri (81)", 81));
        drivers.add(new Driver("Franco Colapinto (43)", 70));

        while (true)        //Menu Loop
        {
            System.out.println("\n--- F1 Manager Menu ---");
            System.out.println("1. Show Cars and their top speed");
            System.out.println("2. Show Drivers and their ratings");
            System.out.println("3. Fastest Car");
            System.out.println("4. Best Rated Driver");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();

            if (ch == 1)
            {
                for (Car c : cars) c.show();
            }
            else if (ch == 2)
            {
                for (Driver d : drivers) d.show();
            }
            else if (ch == 3)
            {
                Car fastest = cars.get(0);
                for (Car c : cars)
                {
                    if (c.getSpeed() > fastest.getSpeed())
                    {
                        fastest = c;
                    }
                }
                System.out.println("Fastest Car: " + fastest.getModel());
            }
            else if (ch == 4)
            {
                Driver best = drivers.get(0);
                for (Driver d : drivers)
                {
                    if (d.getRating() > best.getRating())
                    {
                        best = d;
                    }
                }
                System.out.println("Best Rated Driver: " + best.getName() + " with rating " + best.getRating());
            }
            else if (ch == 5)
            {
                break;
            }
            else        //Exception handling
            {
                System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}