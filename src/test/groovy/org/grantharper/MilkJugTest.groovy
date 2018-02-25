package org.grantharper

import spock.lang.Specification

class MilkJugTest extends Specification
{
  
  def "milk jugs start with 3.75L of milk in them when pulled"() {
    expect: "milk jug has 3.75L of milk"
    new MilkJug().getmLMilk() == 3750.0;
    
  }
  
  def "milk jug loses volume when dispensing milk"() {
    given: "milk jug"
    MilkJug milkJug = new MilkJug();
    Double originalAmount = milkJug.getmLMilk();
    Double dispenseAmount = 150.0;
    
    when: "dispensing milk"
    milkJug.dispenseMilk(dispenseAmount);
    
    then: "milk volume decreases by the amount dispensed"
    milkJug.getmLMilk() == originalAmount - dispenseAmount;
    
  }

}
