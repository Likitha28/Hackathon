package com.example.root.hackathon;

public class Displays
{
  private final double AluminumConstant = 0.40388D;
  private final double ArsenicConstant = 5.178E-5D;
  private final double CO2FromExportConstant = 2.99364E-5D;
  private final double CO2FromPrimaryProductionValue = 0.0D;
  private final double CadmiumConstant = 0.0D;
  private final double CopperConstant = 0.197774D;
  private final double GoldConstant = 0.004747D;
  private final double LeadConstant = 0.01071D;
  private final double MercuryConstant = 4.574E-5D;
  private final double PalladiumConstant = 0.0D;
  private final double PlatinumConstant = 4.4075E-5D;
  private final double SteelConstant = 7.6151D;
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
  private final double unitWeight = 17.26D;
  private final double wasteWeight = 4.677334975E7D;
  
  public Displays(double paramDouble)
  {
    this.input = paramDouble;
  }
  
  public void calculateByComponentWeight(double paramDouble)
  {
    paramDouble /= 17.26D;
    this.greenHouseGasesAmount = (2.99364E-5D * paramDouble * 10195.87D);
    this.leadAmount = (0.01071D * paramDouble);
    this.mercuryAmount = (4.574E-5D * paramDouble);
    this.cadmiumAmount = (0.0D * paramDouble);
    this.arsenicAmount = (5.178E-5D * paramDouble);
    this.copperAmount = (0.197774D * paramDouble);
    this.goldAmount = (0.004747D * paramDouble);
    this.platinumAmount = (4.4075E-5D * paramDouble);
    this.palladiumAmount = (0.0D * paramDouble);
    this.aluminumAmount = (0.40388D * paramDouble);
    this.steelAmount = (7.6151D * paramDouble);
  }
  
  public void calculateByWeight()
  {
    double d = this.input * 0.013715019748604023D / 17.26D;
    this.greenHouseGasesAmount = (2.99364E-5D * d * 10195.87D);
    this.leadAmount = (0.01071D * d);
    this.mercuryAmount = (4.574E-5D * d);
    this.cadmiumAmount = (0.0D * d);
    this.arsenicAmount = (5.178E-5D * d);
    this.copperAmount = (0.197774D * d);
    this.goldAmount = (0.004747D * d);
    this.platinumAmount = (4.4075E-5D * d);
    this.palladiumAmount = (0.0D * d);
    this.aluminumAmount = (0.40388D * d);
    this.steelAmount = (7.6151D * d);
  }
  
  public void calculatebyComponentCount(double paramDouble)
  {
    this.greenHouseGasesAmount = (2.99364E-5D * (paramDouble / 17.26D) * 10195.87D);
    this.leadAmount = (0.01071D * paramDouble);
    this.mercuryAmount = (4.574E-5D * paramDouble);
    this.cadmiumAmount = (0.0D * paramDouble);
    this.arsenicAmount = (5.178E-5D * paramDouble);
    this.copperAmount = (0.197774D * paramDouble);
    this.goldAmount = (0.004747D * paramDouble);
    this.platinumAmount = (4.4075E-5D * paramDouble);
    this.palladiumAmount = (0.0D * paramDouble);
    this.aluminumAmount = (0.40388D * paramDouble);
    this.steelAmount = (7.6151D * paramDouble);
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


/* Location:              C:\Users\Manish\Desktop\data\dex2jar-2.0\dex2jar-2.0\classes-dex2jar.jar!\com\keystrokecreative\ewastecalculator\Calculator\Displays.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */