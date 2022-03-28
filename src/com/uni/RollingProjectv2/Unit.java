package com.uni.RollingProjectv2;

public class Unit
{
    private String unitCode;
    private String unitDescription;
    private int creditPoints;

    public Unit()
    {
        unitCode = "N/A";
        unitDescription = "N/A";
        creditPoints = -1;
    }

    public Unit(String code, String description, int points)
    {
        unitCode = code;
        unitDescription = description;
        creditPoints = points;
    }

    public String display()
    {
        return String.format("""
                Unit Code       : %s
                Unit Description: %s
                Credit Points   : %d
                """, unitCode, unitDescription, creditPoints);
    }

    public int getCreditPoints()
    {
        return creditPoints;
    }

    public String getUnitCode()
    {
        return unitCode;
    }

    public String getUnitDescription()
    {
        return unitDescription;
    }

    public void setCreditPoints(int creditPoints)
    {
        this.creditPoints = creditPoints;
    }

    public void setUnitCode(String unitCode)
    {
        this.unitCode = unitCode;
    }

    public void setUnitDescription(String unitDescription)
    {
        this.unitDescription = unitDescription;
    }
}
