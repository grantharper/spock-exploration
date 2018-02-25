package org.grantharper

import spock.lang.Specification

class CoffeeGrinderTest extends Specification
{
  
  def "Coffee Grinder starts up with 1kg of beans"() {
    given: "coffee grinder"
    CoffeeGrinder coffeeGrinder
    
    when: "coffee grinder is created"
    coffeeGrinder = new CoffeeGrinder();
    
    then: "1kg of beans is loaded into the machine"
    coffeeGrinder.getGramsCoffee() == 1000.0
    
  }
  
  def "Coffee grinder supplies 10g of beans with one grind"() {
    given: "coffee grinder"
    CoffeeGrinder coffeeGrinder = new CoffeeGrinder();
    
    when: "beans are ground"
    Double grindAmount = coffeeGrinder.grindBeans()
    
    then: "10g of beans are supplied"
    grindAmount == 10.0
    
    and: "the amount of beans in the grinder decreases by 10g"
    coffeeGrinder.getGramsCoffee() == 990.0
    
  }


}
