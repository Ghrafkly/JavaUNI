package com.uni.Week3;

public class Main 
{
    public static void main(String[] args)
    {
        Product product = new Product("Beans", "Marg", 5.78);
        Owner owner = new Owner("John Smith", 4.67);
        Container container = new Container(1, 50, owner, product);

        Ship[] ships = new Ship[2];

        ships[0] = new Ship();
        ships[1] = new Ship("Sanchez", "LA", container);

//        for (int i = 0; i < ships.length; i++)
//        {
//            ships[i].display();
//        }

        // for each element in the array, use that element. Then loop

        for (Ship ship : ships)
        {
            ship.display();
        }
    }
}