package org.grantharper;

public class CoffeeGrinder
{

  private Double gramsCoffee;
  
  public CoffeeGrinder() {
    this.gramsCoffee = 1000.00;
  }
  
  public Double grindBeans() {
    Double grindAmount = 10.0;
    this.gramsCoffee = this.gramsCoffee - grindAmount;
    return grindAmount;
  }

  public Double getGramsCoffee()
  {
    return gramsCoffee;
  }

  public void setGramsCoffee(Double gramsCoffee)
  {
    this.gramsCoffee = gramsCoffee;
  }
  
  
  
  
}
