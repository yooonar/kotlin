/*
형 변환 type casting

하나의 변수에 지정된 자료형을 호환되는 다른 자료형으로 변경하는 기능

기본 자료형은 자료형간의 형변환을 지원하기 위해 형 변환 함수 type casting function 를 제공하고 있다.

toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble(), toChar()

그냥 형변환을 하면 변환되지 않음. Type mismatch 에러 발생

코틀린은 형 변환 시 발생할 수 있는 오류를 막기 위해 다른 언어들이 지원하는 암시적 형변환은 지원하지 않는다.

명시적 형변환 = 변환될 자료형을 개발자가 직접 지정함
암시적 형변환 = 변수를 할당할 때 자료형을 지정하지 않아도 자동으로 형변환 됨
 */

fun main() {
    var a: Int = 54321
    var b: Long = a.toLong() // 명시적 형변환
    // var b: Long = a // 이 경우 에러 발생
    // Error: Type mismatch: inferred type is Int but Long was expected

    println(b)
}