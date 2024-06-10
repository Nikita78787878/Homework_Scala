package lesson.module1

object one_functions {

  /**
   * Задание 1. Написать ф-цию метод isEven, которая будет вычислять является ли число четным
   */
  def isEven(x: Int): Boolean = if (x % 2 > 0) false else true // изначальная версия

  def isEven2(num: Int): Boolean = num % 2 == 0 // сокращенная версия


  /**
   * Задание 2. Написать ф-цию метод isOdd, которая будет вычислять является ли число нечетным *
   *
   */
  def isOdd(x: Int): Boolean = if (x % 2 > 0) true else false // изначальная версия

  def isOdd2(num: Int): Boolean = num % 2 != 0 // сокращенная версия


  /**
   * Задание 3. Написать ф-цию метод filterEven, которая получает на вход массив чисел и возвращает массив тех из них,
   * которые являются четными
   */


  def filterEven(a: Array[Int]): Array[Int] = { // изначальная весрия
    val newA = a.filter(el => el % 2 == 0)
    newA
  }

  def filterEven2(numbers: Array[Int]): Array[Int] = numbers.filter(isEven2) // сокращенная версия


  def filterEvenNumbers(a: List[Int]): List[Int] = {   // как работает под капотом
    val filterFunction = new Function1[Int, Boolean] {
      def apply(el: Int): Boolean = el % 2 == 0
    }
    a.filter(filterFunction)
  }




  /**
   * Задание 4. Написать ф-цию метод filterOdd, которая получает на вход массив чисел и возвращает массив тех из них,
   * которые являются нечетными
   */

  def filterOdd(a: Array[Int]): Array[Int] = {
    val newA = a.filter(el => el % 2 != 0)
    newA
  }


}
