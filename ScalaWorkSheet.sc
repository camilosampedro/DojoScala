object ScalaWorkSheet {
  val lista = List(1, 2, 3, 4)                    //> lista  : List[Int] = List(1, 2, 3, 4)
    val conjunto = Set(1, 2, 3, 4, 5, 1)          //> conjunto  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
    val mapa = Map(1 -> "Luis", 2 -> "Juan")      //> mapa  : scala.collection.immutable.Map[Int,String] = Map(1 -> Luis, 2 -> Jua
                                                  //| n)
    lista.map(_ + 3)                              //> res0: List[Int] = List(4, 5, 6, 7)
    lista                                         //> res1: List[Int] = List(1, 2, 3, 4)
    lista.filter(_ < 2)                           //> res2: List[Int] = List(1)
    val names = List("Juan", "Carlos", "Andrés")  //> names  : List[String] = List(Juan, Carlos, Andrés)
    names.map(_.length)                           //> res3: List[Int] = List(4, 6, 6)
    
    var pares = List.range(1,20)                  //> pares  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                                                  //|  16, 17, 18, 19)
    pares.filter(_ % 2 == 0)                      //> res4: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18)
    
    val megaLista = List(
    List("Andrés", "24 years", "male"),
    List("Juan", "20 years", "male"),
    List("Sofia", "29 years", "female")
    )                                             //> megaLista  : List[List[String]] = List(List(Andrés, 24 years, male), List(J
                                                  //| uan, 20 years, male), List(Sofia, 29 years, female))
                                                  
    megaLista.filter(persona => persona(0) == "Juan")
                                                  //> res5: List[List[String]] = List(List(Juan, 20 years, male))
}