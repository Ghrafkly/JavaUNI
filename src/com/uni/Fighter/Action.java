package com.uni.Fighter;

import java.util.Scanner;

public abstract class Action
{
    public static int selectSpecialMove(Moves m)
    {
        boolean b = true;
        int selection = 0;
        System.out.print("""
                Select Special Move
                -------------------""");
        System.out.println(moveList(m));
        System.out.print("Enter Move No: ");

        // Ensures that the program does not progress until the user inputs a valid value
        do
        {
            try
            {
                Scanner specialMove = new Scanner(System.in);
                selection = Integer.parseInt(specialMove.nextLine());

                if (selection <= 0 || selection > m.getMoves().size())
                    System.out.print("Invalid entry. Please enter a move no: ");
                else
                    b = false;
            }
            catch (Exception e)
            {
                System.out.print("Invalid entry. Please enter a move no: ");
            }
        }
        while (b);

        return selection;
    }

    public static void addMove(Moves normal, Moves special, Player player)
    {
        // Adds Special Move to Player MoveSet
        int sMove;
        Moves playerMoves = new Moves();

        if (player.getName().equals("Computer")) sMove = (int)(Math.random() * 4 + 1);
        else sMove = selectSpecialMove(special);

        for (String[] move : normal.getMoves())
            playerMoves.addMoves(move);

        playerMoves.addMoves(special.getMoves().get(sMove - 1));
        player.setMoves(playerMoves);
    }

    public static void computerAction(Moves[] m)
    {
        int x = -1;
    }

    public static void playerAction(Moves[] m)
    {
        System.out.println("""
                Please Select Action Type
                1 for Normal Move
                2 For Special Move
                3 to Exit""");
    }

    public static String moveList(Moves m)
    {
        String s = "";
        for (int x = 0; x < m.getMoves().size(); x++)
            s = s.concat(String.format("\n%d) %-15s%5s",
                    x + 1,
                    m.getMoves().get(x)[0],
                    m.getMoves().get(x)[2]));
        return s;
    }
}
