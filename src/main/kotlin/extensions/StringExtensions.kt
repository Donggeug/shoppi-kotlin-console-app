package extensions

fun String?.getNotEmptyString():String{
    var input = this
    while(input.isNullOrBlank()){
        println("값을 입력해주세요")
        input = readLine()
    }
    return input.trim()
}
// 빈값 혹은 공백을 입력하지 않도록 확인하는 용도로 사용

fun String?.getNotEmptyInt():Int{
    var input = this?.trim()
    while (input.isNullOrEmpty() || input.toIntOrNull()== null){
        println("값을 입력해주세요")
        input = readLine()
    }
    return input.toInt()
}
// 상품 번호를 입력 받을때, Int 타입으로 변환할 수 있는 값인지 확인하는 용도로 사용