package org.grantharper;

public class MilkJug
{

  private Double mLMilk;

  public MilkJug()
  {
    this.mLMilk = 3750.0;
  }

  public void dispenseMilk(Double amount)
  {
    this.mLMilk -= amount;
  }

  public Double getmLMilk()
  {
    return mLMilk;
  }
  
  

}
