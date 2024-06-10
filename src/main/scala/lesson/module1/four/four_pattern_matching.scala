package lesson.module1.four

object four_pattern_matching {

  class Person(val name: String, val age: Int)

  object Person {
    def apply(name: String, age:Int):Person = new Person(name, age)
    def unapply(p: Person): Option[(String, Int)] = Some(p.name, p.age)
  }

  val p: Person = Person("Alex", 40)

  /**
   * Паттерн матчинг может содержать литералы.
   * Реализовать паттерн матчинг на alex с двумя кейсами.
   * 1. Имя должно соотвествовать Alex
   * 2. Все остальные
   */

  p match {
    case Person("Alex", _) => println("Her name Alex")
    case _ => println("Everything else")
  }

  /**
   * Паттерны могут содержать условия. В этом случае case сработает,
   * если и паттерн совпал и условие true.
   * Условия в паттерн матчинге называются гардами.
   */
  /**
   * Реализовать паттерн матчинг на alex с двумя кейсами.
   * 1. Имя должно начинаться с A
   * 2. Все остальные
   */


  p match {
    case Person(name, _) if name.startsWith("A") => println("Yes")
    case _ => println("Everything else")
  }

  /**
   *
   * Мы можем поместить кусок паттерна в переменную использую `as` паттерн,
   * x @ ..., где x это любая переменная.
   * Это переменная может использоваться, как в условии,
   * так и внутри кейса
   */

  p match {
    case p@Person(name, age) => println(p.name)
  }








}
