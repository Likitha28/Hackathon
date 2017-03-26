package com.example.root.hackathon;

public class Mobile
{
  private final double AluminumConstant = 0.00113D;
  private final double ArsenicConstant = 2.49673E-6D;
  private final double CO2FromExportConstant = 2.99364E-5D;
  private final double CO2FromPrimaryProductionValue = 0.0D;
  private final double CadmiumConstant = 3.0E-7D;
  private final double CopperConstant = 0.016D;
  private final double GoldConstant = 3.4E-5D;
  private final double LeadConstant = 3.39E-4D;
  private final double MercuryConstant = 4.0E-8D;
  private final double PalladiumConstant = 1.5E-5D;
  private final double PlatinumConstant = 3.4E-7D;
  private final double SteelConstant = 0.00272D;
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
  private final double unitWeight = 0.113D;
  private final double wasteWeight = 1.1574278231E8D;
  
  public Mobile(double paramDouble)
  {
    this.input = paramDouble;
  }
  
  public void calculateByComponentWeight(double paramDouble)
  {
    paramDouble /= 0.113D;
    this.greenHouseGasesAmount = (2.99364E-5D * paramDouble * 10195.87D);
    this.leadAmount = (3.39E-4D * paramDouble);
    this.mercuryAmount = (4.0E-8D * paramDouble);
    this.cadmiumAmount = (3.0E-7D * paramDouble);
    this.arsenicAmount = (2.49673E-6D * paramDouble);
    this.copperAmount = (0.016D * paramDouble);
    this.goldAmount = (3.4E-5D * paramDouble);
    this.platinumAmount = (3.4E-7D * paramDouble);
    this.palladiumAmount = (1.5E-5D * paramDouble);
    this.aluminumAmount = (0.00113D * paramDouble);
    this.steelAmount = (0.00272D * paramDouble);
  }
  
  public void calculateByWeight()
  {
    double d = this.input * 0.03393844045005621D / 0.113D;
    this.greenHouseGasesAmount = (2.99364E-5D * d * 10195.87D);
    this.leadAmount = (3.39E-4D * d);
    this.mercuryAmount = (4.0E-8D * d);
    this.cadmiumAmount = (3.0E-7D * d);
    this.arsenicAmount = (2.49673E-6D * d);
    this.copperAmount = (0.016D * d);
    this.goldAmount = (3.4E-5D * d);
    this.platinumAmount = (3.4E-7D * d);
    this.palladiumAmount = (1.5E-5D * d);
    this.aluminumAmount = (0.00113D * d);
    this.steelAmount = (0.00272D * d);
  }
  
  public void calculatebyComponentCount(double paramDouble)
  {
    this.greenHouseGasesAmount = (2.99364E-5D * (paramDouble / 0.113D) * 10195.87D);
    this.leadAmount = (3.39E-4D * paramDouble);
    this.mercuryAmount = (4.0E-8D * paramDouble);
    this.cadmiumAmount = (3.0E-7D * paramDouble);
    this.arsenicAmount = (2.49673E-6D * paramDouble);
    this.copperAmount = (0.016D * paramDouble);
    this.goldAmount = (3.4E-5D * paramDouble);
    this.platinumAmount = (3.4E-7D * paramDouble);
    this.palladiumAmount = (1.5E-5D * paramDouble);
    this.aluminumAmount = (0.00113D * paramDouble);
    this.steelAmount = (0.00272D * paramDouble);
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


/* Location:              C:\Users\Manish\Desktop\data\dex2jar-2.0\dex2jar-2.0\classes-dex2jar.jar!\com\keystrokecreative\ewastecalculator\Calculator\Mobile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */