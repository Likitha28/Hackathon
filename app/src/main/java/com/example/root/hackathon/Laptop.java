package com.example.root.hackathon;

/**
 * Created by Manish on 25-Mar-17.
 */

public class Laptop
{
    private double aluminumAmount;
    private double arsenicAmount;
    private double cadmiumAmount;
    private double copperAmount;
    private double goldAmount;
    private double greenHouseGasesAmount;
    private double input;
    private double leadAmount;
    private double mercuryAmount;
    private double palladiumAmount;
    private double platinumAmount;
    private double steelAmount;
    private final double unitWeight = 3.779D;
    private final double wasteWeight = 1.723740939E8D;


    public void calculateByComponentWeight(double paramDouble)
    {
        paramDouble /= 3.779D;
        this.greenHouseGasesAmount = (2.99364E-5D * paramDouble * 10195.87D);
        this.leadAmount = (0.0061D * paramDouble);
        this.mercuryAmount = (4.0*2.718-6 * paramDouble);
        this.cadmiumAmount = (7.6E-7D * paramDouble);
        this.arsenicAmount = (1.1337-5 * paramDouble);
        this.copperAmount = (0.27D * paramDouble);
        this.goldAmount = (3.6E-4D * paramDouble);
        this.platinumAmount = (1.1389991E-5D * paramDouble);
        this.palladiumAmount = (6.0E-5D * paramDouble);
        this.aluminumAmount = (0.512D * paramDouble);
        this.steelAmount = (0.871D * paramDouble);
    }

    public void calculateByWeight()
    {
        double d = this.input * 0.0505440408827299D / 3.779D;
        this.greenHouseGasesAmount = (2.99364E-5D * d * 10195.87D);
        this.leadAmount = (0.0061D * d);
        this.mercuryAmount = (4.0E-6D * d);
        this.cadmiumAmount = (7.6E-7D * d);
        this.arsenicAmount = (1.1337E-5D * d);
        this.copperAmount = (0.27D * d);
        this.goldAmount = (3.6E-4D * d);
        this.platinumAmount = (1.1389991E-5D * d);
        this.palladiumAmount = (6.0E-5D * d);
        this.aluminumAmount = (0.512D * d);
        this.steelAmount = (0.871D * d);
    }

    public void calculatebyComponentCount(double paramDouble)
    {
        this.greenHouseGasesAmount = (2.99364E-5D * (paramDouble / 3.779D) * 10195.87D);
        this.leadAmount = (0.0061D * paramDouble);
        this.mercuryAmount = (0.000004 * paramDouble);
        this.cadmiumAmount = (7.6E-7D * paramDouble);
        this.arsenicAmount = (1.1337E-5D * paramDouble);
        this.copperAmount = (0.27D * paramDouble);
        this.goldAmount = (3.6E-4D * paramDouble);
        this.platinumAmount = (1.1389991E-5D * paramDouble);
        this.palladiumAmount = (6.0E-5D * paramDouble);
        this.aluminumAmount = (0.512D * paramDouble);
        this.steelAmount = (0.871D * paramDouble);
    }

    public double getAluminumAmount()
    {
        return this.aluminumAmount;
    }

    public double getArsenicAmount()
    {
        return this.arsenicAmount;
    }

    public double getCadmiumAmount()
    {
        return this.cadmiumAmount;
    }

    public double getCopperAmount()
    {
        return this.copperAmount;
    }

    public double getGoldAmount()
    {
        return this.goldAmount;
    }

    public double getGreenHouseGasesAmount()
    {
        return this.greenHouseGasesAmount;
    }

    public double getLeadAmount()
    {
        return this.leadAmount;
    }

    public double getMercuryAmount()
    {
        return this.mercuryAmount;
    }

    public double getPalladiumAmount()
    {
        return this.palladiumAmount;
    }

    public double getPlatinumAmount()
    {
        return this.platinumAmount;
    }

    public double getSteelAmount()
    {
        return this.steelAmount;
    }
}


/* Location:              C:\Users\Manish\Desktop\data\dex2jar-2.0\dex2jar-2.0\classes-dex2jar.jar!\com\keystrokecreative\ewastecalculator\Calculator\Laptop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
