package com.uni.Fighter;

import java.util.ArrayList;
import java.util.Arrays;

public class Moves
{
    private ArrayList<String[]> moves = new ArrayList<>(4);

    public Moves()
    {

    }

    public Moves(ArrayList<String[]> moves)
    {
        this.moves = moves;
    }

    public StringBuilder display(ArrayList<String[]> moves)
    {
        StringBuilder s = new StringBuilder();
        for (String[] move : moves)
            s.append(Arrays.toString(move) + "\n");

        return s;
    }

    public void addMoves(String[] moves)
    {
        this.moves.add(moves);
    }

    public ArrayList<String[]> getMoves()
    {
        return moves;
    }

    public void setMoves(ArrayList<String[]> moves)
    {
        this.moves = moves;
    }
}
