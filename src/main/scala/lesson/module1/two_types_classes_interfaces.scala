package lesson.module1

object two_types_classes_interfaces {
  /**
   * Задание 1: Создать класс "Прямоугольник"(Rectangle),
   * мы должны иметь возможность создавать прямоугольник с заданной
   * длиной(length) и шириной(width), а также вычислять его периметр и площадь
   *
   */

  class Rectangle(val length: Int,val width: Int){
    def perimeter: Int =  (length + width) * 2
    def square: Int =  length * width

  }



}
