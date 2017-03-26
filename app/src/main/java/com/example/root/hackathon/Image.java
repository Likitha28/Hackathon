package com.example.root.hackathon;

public class Image
{
  private final double AluminumConstant = 0.359728D;
  private final double ArsenicConstant = 1.19364E-4D;
  private final double CO2FromExportConstant = 2.99364E-5D;
  private final double CO2FromPrimaryProductionValue = 4.0E-8D;
  private final double CadmiumConstant = 1.30274E-4D;
  private final double CopperConstant = 1.0266D;
  private final double GoldConstant = 6.16134E-5D;
  private final double LeadConstant = 0.0266D;
  private final double MercuryConstant = 4.0E-8D;
  private final double PalladiumConstant = 2.47028E-4D;
  private final double PlatinumConstant = 3.75144E-5D;
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
  private final double unitWeight = 17.4D;
  private final double wasteWeight = 6.844480811E7D;
  
  public Image(double paramDouble)
  {
    this.input = paramDouble;
  }
  
  public void calculateByComponentWeight(double paramDouble)
  {
    paramDouble /= 17.4D;
    this.greenHouseGasesAmount = (2.99364E-5D * paramDouble * 10195.87D);
    this.leadAmount = (0.0266D * paramDouble);
    this.mercuryAmount = (4.0E-8D * paramDouble);
    this.cadmiumAmount = (1.30274E-4D * paramDouble);
    this.arsenicAmount = (1.19364E-4D * paramDouble);
    this.copperAmount = (1.0266D * paramDouble);
    this.goldAmount = (6.16134E-5D * paramDouble);
    this.platinumAmount = (3.75144E-5D * paramDouble);
    this.palladiumAmount = (2.47028E-4D * paramDouble);
    this.aluminumAmount = (0.359728D * paramDouble);
    this.steelAmount = (0.0D * paramDouble);
  }
  
  public void calculateByWeight()
  {
    double d = this.input * 0.020069588770859046D / 17.4D;
    this.greenHouseGasesAmount = (2.99364E-5D * d * 10195.87D);
    this.leadAmount = (0.0266D * d);
    this.mercuryAmount = (4.0E-8D * d);
    this.cadmiumAmount = (1.30274E-4D * d);
    this.arsenicAmount = (1.19364E-4D * d);
    this.copperAmount = (1.0266D * d);
    this.goldAmount = (6.16134E-5D * d);
    this.platinumAmount = (3.75144E-5D * d);
    this.palladiumAmount = (2.47028E-4D * d);
    this.aluminumAmount = (0.359728D * d);
    this.steelAmount = (0.0D * d);
  }
  
  public void calculatebyComponentCount(double paramDouble)
  {
    this.greenHouseGasesAmount = (2.99364E-5D * (paramDouble / 17.4D) * 10195.87D);
    this.leadAmount = (0.0266D * paramDouble);
    this.mercuryAmount = (4.0E-8D * paramDouble);
    this.cadmiumAmount = (1.30274E-4D * paramDouble);
    this.arsenicAmount = (1.19364E-4D * paramDouble);
    this.copperAmount = (1.0266D * paramDouble);
    this.goldAmount = (6.16134E-5D * paramDouble);
    this.platinumAmount = (3.75144E-5D * paramDouble);
    this.palladiumAmount = (2.47028E-4D * paramDouble);
    this.aluminumAmount = (0.359728D * paramDouble);
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


/* Location:              C:\Users\Manish\Desktop\data\dex2jar-2.0\dex2jar-2.0\classes-dex2jar.jar!\com\keystrokecreative\ewastecalculator\Calculator\Image.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */