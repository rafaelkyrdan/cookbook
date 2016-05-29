/**
  * Renaming members on import
  *
  */

import java.util.{ArrayList => JavaList}
import java.util.{Date => JDate, HashMap => JHashMap}

val list = new JavaList[String]()

//won't compile anymore
//val map = new HashMap[String, String]()

import System.out.{println => p}

p("alias for a member")






