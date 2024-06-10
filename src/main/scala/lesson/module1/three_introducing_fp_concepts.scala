package lesson.module1

object three_introducing_fp_concepts {

  /**
   * реализовать вычисление N числа Фибоначчи
   * F0 = 0, F1 = 1, Fn = Fn-1 + Fn - 2
   *
   */

  object Fibonacci {
    def computeFibonacci(n: Int): Int = {
      n match {
        case 0 => 0
        case 1 => 1
        case _ => computeFibonacci(n - 1) + computeFibonacci(n - 2)
      }
    }


    /**
     *
     * (Опционально) Реализовать ф-цию, которая будет читать записи Request из топика,
     * и сохранять их в базу
     */


    /**
     *
     * Реализовать метод printIfAny
     * , который будет печатать значение
     * , если оно есть
     */

    def printIfAny(value: Option[Any]): Unit = {
      value match {
        case Some(v) => println(s"Значение: $v")
        case None => println("Значение отсутствует.")
      }


      /**
       *
       * Реализовать метод zip, который будет создавать Option от пары значений из 2-х Option
       */

      def zip[A, B](optionA: Option[A], optionB: Option[B]): Option[(A, B)] = {
        (optionA, optionB) match {
          case (Some(valueA), Some(valueB)) => Some((valueA, valueB))
          case _ => None
        }
      }


      /**
       *
       * Реализовать метод filter, который будет возвращать не пустой Option
       * в случае если исходный не пуст и предикат от значения = true
       */

      def filter[A](option: Option[A])(predicate: A => Boolean): Option[A] = {
        option match {
          case Some(value) if predicate(value) => Some(value)
          case _ => None
        }
      }

    }
  }
}

