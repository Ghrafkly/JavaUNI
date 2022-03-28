package com.uni.Fighter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Fighter extends Action
{
    public static void main(String[] args) throws FileNotFoundException {
        Moves normal, special;
        Player computer = new Player();
        Referee referee = new Referee();

        Scanner playerName = new Scanner(System.in);
        // Name LENGTH
        System.out.print("Enter Your Name: ");
        Player player = new Player(playerName.nextLine());

        String[] fileName = { "normal_moves.txt", "special_moves.txt" };
        Moves[] m = new Moves[fileName.length];

        // Get data from .txt files
        for (int i = 0; i < fileName.length; i++)
        {
            ArrayList<String[]> ms = new ArrayList<>(4);
            File f = new File(String.format("%s", fileName[i]));
            Scanner s = new Scanner(f);

            while (s.hasNextLine())
                ms.add(s.nextLine().split(","));

            m[i] = new Moves(ms);
        }

        normal = m[0];
        special = m[1];

        /*
         Initialise array of participants
         Loop through array so that each participant can
         add the special move to their move set.
        */
        Player[] participants = { player, computer };
        for (Player p : participants)
            addMove(normal, special, p);


        // DO QUIZ
        // DO QUIZ
        // DO QUIZ
        // DO QUIZ
        // DO QUIZ
        // DO QUIZ
        // DO QUIZ



        for (Player p : participants)
        {
            System.out.printf("""
                    %s moves:
                    ---------
                    """, p.getName());
            for (String[] move : p.getMoves().getMoves())
                System.out.println(Arrays.toString(move));
        }
    }
}
