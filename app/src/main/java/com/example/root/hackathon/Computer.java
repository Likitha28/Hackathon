package com.example.root.hackathon;

/**
 * Created by Manish on 25-Mar-17.
 */


public class Computer
{
    private final double AluminumConstant = 0.3564D;
    private final double ArsenicConstant = 0.0396D;
    private final double CO2FromExportConstant = 2.99364E-5D;
    private final double CO2FromPrimaryProductionValue = 0.0D;
    private final double CadmiumConstant = 0.0D;
    private final double CopperConstant = 0.1069D;
    private final double GoldConstant = 2.97E-4D;
    private final double LeadConstant = 0.0198D;
    private final double MercuryConstant = 0.0D;
    private final double PalladiumConstant = 1.396E-4D;
    private final double PlatinumConstant = 2.04732E-5D;
    private final double SteelConstant = 4.9302D;
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
    private final double unitWeight = 9.9D;
    private final double wasteWeight = 7.0281199845E8D;

    public Computer(double paramDouble)
    {
        this.input = paramDouble;
    }

    public void calculateByComponentWeight(double paramDouble)
    {
        paramDouble /= 9.9D;
        this.greenHouseGasesAmount = (2.99364E-5D * paramDouble * 10195.87D);
        this.leadAmount = (0.0198D * paramDouble);
        this.mercuryAmount = (0.0D * paramDouble);
        this.cadmiumAmount = (0.0D * paramDouble);
        this.arsenicAmount = (0.0396D * paramDouble);
        this.copperAmount = (0.1069D * paramDouble);
        this.goldAmount = (2.97E-4D * paramDouble);
        this.platinumAmount = (2.04732E-5D * paramDouble);
        this.palladiumAmount = (1.396E-4D * paramDouble);
        this.aluminumAmount = (0.3564D * paramDouble);
        this.steelAmount = (4.9302D * paramDouble);
    }

    public void calculateByWeight()
    {
        double d = this.input * 0.20608060978779075D / 9.9D;
        this.greenHouseGasesAmount = (2.99364E-5D * d * 10195.87D);
        this.leadAmount = (0.0198D * d);
        this.mercuryAmount = (0.0D * d);
        this.cadmiumAmount = (0.0D * d);
        this.arsenicAmount = (0.0396D * d);
        this.copperAmount = (0.1069D * d);
        this.goldAmount = (2.97E-4D * d);
        this.platinumAmount = (2.04732E-5D * d);
        this.palladiumAmount = (1.396E-4D * d);
        this.aluminumAmount = (0.3564D * d);
        this.steelAmount = (4.9302D * d);
    }

    public void calculatebyComponentCount(double paramDouble)
    {
        this.greenHouseGasesAmount = (2.99364E-5D * (paramDouble / 9.9D) * 10195.87D);
        this.leadAmount = (0.0198D * paramDouble);
        this.mercuryAmount = (0.0D * paramDouble);
        this.cadmiumAmount = (0.0D * paramDouble);
        this.arsenicAmount = (0.0396D * paramDouble);
        this.copperAmount = (0.1069D * paramDouble);
        this.goldAmount = (2.97E-4D * paramDouble);
        this.platinumAmount = (2.04732E-5D * paramDouble);
        this.palladiumAmount = (1.396E-4D * paramDouble);
        this.aluminumAmount = (0.3564D * paramDouble);
        this.steelAmount = (4.9302D * paramDouble);
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


/* Location:              C:\Users\Manish\Desktop\data\dex2jar-2.0\dex2jar-2.0\classes-dex2jar.jar!\com\keystrokecreative\ewastecalculator\Calculator\Computer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
