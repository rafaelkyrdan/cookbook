/**
  * Limiting which class can use a trait
  *
  */

//base syntax
//trait [TraitName] extends [SuperThing]

//trait and class extend common class
//so class can be mixed into class
class StarfleetComponent
trait StarfleetWarpCore extends StarfleetComponent
class Starship extends StarfleetComponent with StarfleetWarpCore

// won't compile
//class Warbird extends RomulanStuff with StarfleetWarpCore



