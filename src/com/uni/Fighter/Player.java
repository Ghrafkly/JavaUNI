package com.uni.Fighter;

public class Player
{
    private int health = 100;
    private String name;
    private Moves moves;

    public Player()
    {
        this.name = "Computer";
    }

    public Player(String name)
    {
        this.name = name;
    }

    public int getHealth()
    {
        return health;
    }

    public Moves getMoves()
    {
        return moves;
    }

    public String getName()
    {
        return name;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public void setMoves(Moves moves)
    {
        this.moves = moves;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
