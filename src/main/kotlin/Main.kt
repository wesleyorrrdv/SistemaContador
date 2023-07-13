fun main() {
    print("Digite um numero binario: ")
    val binary = readLine()?: return

    val decimal = binary.toIntOrNull(2)

    if(decimal== null){
        println("O numero binario inserido é invalido.")

    } else{println("O numero decimal é : $decimal")}

}