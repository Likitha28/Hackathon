package com.example.root.hackathon;

public class Other
{
  private final double AluminumConstant = 0.3807978D;
  private final double ArsenicConstant = 0.0D;
  private final double CO2FromExportConstant = 2.99364E-5D;
  private final double CO2FromPrimaryProductionValue = 0.0D;
  private final double CadmiumConstant = 0.0D;
  private final double CopperConstant = 1.338828D;
  private final double GoldConstant = 7.5579E-5D;
  private final double LeadConstant = 0.0410286D;
  private final double MercuryConstant = 0.0D;
  private final double PalladiumConstant = 2.37534E-4D;
  private final double PlatinumConstant = 0.0D;
  private final double SteelConstant = 0.0D;
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
  private final double unitWeight = 17.7D;
  private final double wasteWeight = 1.8120914324E8D;
  
  public Other(double paramDouble)
  {
    this.input = paramDouble;
  }
  
  public void calculateByComponentWeight(double paramDouble)
  {
    paramDouble /= 17.7D;
    this.greenHouseGasesAmount = (2.99364E-5D * paramDouble * 10195.87D);
    this.leadAmount = (0.0410286D * paramDouble);
    this.mercuryAmount = (0.0D * paramDouble);
    this.cadmiumAmount = (0.0D * paramDouble);
    this.arsenicAmount = (0.0D * paramDouble);
    this.copperAmount = (1.338828D * paramDouble);
    this.goldAmount = (7.5579E-5D * paramDouble);
    this.platinumAmount = (0.0D * paramDouble);
    this.palladiumAmount = (2.37534E-4D * paramDouble);
    this.aluminumAmount = (0.3807978D * paramDouble);
    this.steelAmount = (0.0D * paramDouble);
  }
  
  public void calculateByWeight()
  {
    double d = this.input * 0.053134680142600116D / 17.7D;
    this.greenHouseGasesAmount = (2.99364E-5D * d * 10195.87D);
    this.leadAmount = (0.0410286D * d);
    this.mercuryAmount = (0.0D * d);
    this.cadmiumAmount = (0.0D * d);
    this.arsenicAmount = (0.0D * d);
    this.copperAmount = (1.338828D * d);
    this.goldAmount = (7.5579E-5D * d);
    this.platinumAmount = (0.0D * d);
    this.palladiumAmount = (2.37534E-4D * d);
    this.aluminumAmount = (0.3807978D * d);
    this.steelAmount = (0.0D * d);
  }
  
  public void calculatebyComponentCount(double paramDouble)
  {
    this.greenHouseGasesAmount = (2.99364E-5D * (paramDouble / 17.7D) * 10195.87D);
    this.leadAmount = (0.0410286D * paramDouble);
    this.mercuryAmount = (0.0D * paramDouble);
    this.cadmiumAmount = (0.0D * paramDouble);
    this.arsenicAmount = (0.0D * paramDouble);
    this.copperAmount = (1.338828D * paramDouble);
    this.goldAmount = (7.5579E-5D * paramDouble);
    this.platinumAmount = (0.0D * paramDouble);
    this.palladiumAmount = (2.37534E-4D * paramDouble);
    this.aluminumAmount = (0.3807978D * paramDouble);
    this.steelAmount = (0.0D * paramDouble);
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


/* Location:              C:\Users\Manish\Desktop\data\dex2jar-2.0\dex2jar-2.0\classes-dex2jar.jar!\com\keystrokecreative\ewastecalculator\Calculator\Other.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */