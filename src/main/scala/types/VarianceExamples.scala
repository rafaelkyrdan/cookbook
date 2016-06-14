package types

/**
  * Variance example
  */

class Grandparent

class Parent extends Grandparent

class Child extends Parent

class InvariantClass[A]

class CovariantClass[+A]

class ContravariantClass[-A]

class VarianceExamples {

  def invarMethod(x: InvariantClass[Parent]) {}

  def covarMethod(x: CovariantClass[Parent]) {}

  def contraMethod(x: ContravariantClass[Parent]) {}


  //Invariant example
  //won't compile
  //invarMethod(new InvariantClass[Child])
  invarMethod(new InvariantClass[Parent])
  //won't compile
  //invarMethod(new InvariantClass[Grandparent])

  //Covariant example
  covarMethod(new CovariantClass[Child])
  covarMethod(new CovariantClass[Parent])
  //won't compile
  //covarMethod(new CovariantClass[Grandparent])


  //Contravariant example
  //won't compile
  //contraMethod(new ContravariantClass[Child])
  contraMethod(new ContravariantClass[Parent])
  contraMethod(new ContravariantClass[Grandparent])

}


