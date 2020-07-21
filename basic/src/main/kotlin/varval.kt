// var : 일반적으로 통용되는 변수. 언제든지 읽기 쓰기가 가능함.
// val : 선언시에만 초기화 가능. 중간에 값을 변경할 수 없음.

// 변수의 종류
/*
변수의 종류

클래스에 선언된 변수 = Property (속성)
이 외 Scope 내에 선언된 변수 = Local Variable (로컬 변수)

코틀린이 고전적인 언어들과 다른 점
고전적인 언어들은 변수가 선언된 후 초기화되지 않으면 기본값으로 초기화 되거나 값이 할당되지 않았다는 표시로 null 값을 가지게 된다.
그러나 Kotlin은 기본 변수에서 null 을 허용하지 않으며, 또한 변수에 값을 할당하지 않은 채로 사용하게 되면 문법 오류를 표현하게 되고 컴파일을 할 수 없으므로 의도치 않은 동작이나 null pointer exception 등을 원천적으로 차단해준다는 장점이 있음.
 */

fun main() {
    var a: Int = 123
    println(a)
    // a 변수에 값을 넣지 않을 경우 오류 발생
    // Error: Variable 'a' must be initialized

    // 옵셔널 Int 타입. 자료형 뒤에 물음표를 붙이면 null 을 허용하는 nullable 변수로 선언해줄 수 있
    var b: Int? = null

    /*
    nullable 변수

    값이 null 인 상태로 연산할 때 null pointer exception 이 발생할 수 있으므로, 꼭 필요한 경우에 한해 주의해서 사용해야 한다.

    lazy 속, lateinit
    변수의 초기화를 늦추는 속성
     */
}
// 선언과 동시에 값을 넣을 필요는 없으며, 변수를 참조하여 사용하기 전까지만 값을 넣어주면 됨
