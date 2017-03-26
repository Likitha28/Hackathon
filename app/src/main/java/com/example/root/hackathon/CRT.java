package com.example.root.hackathon;

public class CRT
{
  private final double AluminumConstant = 0.15857D;
  private final double ArsenicConstant = 1.51032E-4D;
  private final double CO2FromExportConstant = 2.99364E-5D;
  private final double CO2FromPrimaryProductionValue = 0.0D;
  private final double CadmiumConstant = 2.48E-4D;
  private final double CopperConstant = 1.1225D;
  private final double GoldConstant = 1.079E-5D;
  private final double LeadConstant = 1.082D;
  private final double MercuryConstant = 0.0D;
  private final double PalladiumConstant = 4.315E-5D;
  private final double PlatinumConstant = 4.74572E-5D;
  private final double SteelConstant = 6.0512D;
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
  private final double unitWeight = 24.8D;
  private final double wasteWeight = 2.12301804265E9D;
  
  public CRT(double paramDouble)
  {
    this.input = paramDouble;
  }
  
  public void calculateByComponentWeight(double paramDouble)
  {
    paramDouble /= 24.8D;
    this.greenHouseGasesAmount = (2.99364E-5D * paramDouble * 10195.87D);
    this.leadAmount = (1.082D * paramDouble);
    this.mercuryAmount = (0.0D * paramDouble);
    this.cadmiumAmount = (2.48E-4D * paramDouble);
    this.arsenicAmount = (1.51032E-4D * paramDouble);
    this.copperAmount = (1.1225D * paramDouble);
    this.goldAmount = (1.079E-5D * paramDouble);
    this.platinumAmount = (4.74572E-5D * paramDouble);
    this.palladiumAmount = (4.315E-5D * paramDouble);
    this.aluminumAmount = (0.15857D * paramDouble);
    this.steelAmount = (6.0512D * paramDouble);
  }
  
  public void calculateByWeight()
  {
    double d = this.input * 0.6225176203375814D / 24.8D;
    this.greenHouseGasesAmount = (2.99364E-5D * d * 10195.87D);
    this.leadAmount = (1.082D * d);
    this.mercuryAmount = (0.0D * d);
    this.cadmiumAmount = (2.48E-4D * d);
    this.arsenicAmount = (1.51032E-4D * d);
    this.copperAmount = (1.1225D * d);
    this.goldAmount = (1.079E-5D * d);
    this.platinumAmount = (4.74572E-5D * d);
    this.palladiumAmount = (4.315E-5D * d);
    this.aluminumAmount = (0.15857D * d);
    this.steelAmount = (6.0512D * d);
  }
  
  public void calculatebyComponentCount(double paramDouble)
  {
    this.greenHouseGasesAmount = (2.99364E-5D * (paramDouble / 24.8D) * 10195.87D);
    this.leadAmount = (1.082D * paramDouble);
    this.mercuryAmount = (0.0D * paramDouble);
    this.cadmiumAmount = (2.48E-4D * paramDouble);
    this.arsenicAmount = (1.51032E-4D * paramDouble);
    this.copperAmount = (1.1225D * paramDouble);
    this.goldAmount = (1.079E-5D * paramDouble);
    this.platinumAmount = (4.74572E-5D * paramDouble);
    this.palladiumAmount = (4.315E-5D * paramDouble);
    this.aluminumAmount = (0.15857D * paramDouble);
    this.steelAmount = (6.0512D * paramDouble);
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


/* Location:              C:\Users\Manish\Desktop\data\dex2jar-2.0\dex2jar-2.0\classes-dex2jar.jar!\com\keystrokecreative\ewastecalculator\Calculator\CRT.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */