public class Operadores {
    
public static void main(String[] args) {
    
    String nomeCompleto = "LINGUAGEM " + "JAVA";
    System.out.println(nomeCompleto);

    int numero = 5;

    //x repetição aumentando o valor +1

    // numero = numero +1;


    System.out.println(++ numero);

    //x repetição diminuindo o valor -1

    System.out.println(-- numero);

    // podemos também negar expressões Booleanas(era pra ser true, mas por conta do ponto de exclamação antes da variavel, ele sempre vai negar o true)

    boolean variavel = true;

    System.out.println(!variavel);

    // classe Operadores.java TERNÁRIO

   /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
    if(a==b)
    resultado = "verdadeiro";
    else
    resultado = "falso";
    
    System.out.println(resultado);

   */
     //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO

    int a, b;

    a = 6;
    b = 6;
    // Nesta expressão abaixo, o ponto de interrogação seria o IF e os dois pontos seria o ELSE 
    String resultado = a == b ? "verdadeiro" : "falso";

    System.out.println(resultado);
    
    /*classe Operadores.java

Relacionais
Os operadores relacionais avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior ou maior ou igual ao da direita, retornando um valor booleano como resultado.

== Quando desejamos verificar se uma variável é IGUAL A outra.
!= Quando desejamos verificar se uma variável é DIFERENTE da outra.
> Quando desejamos verificar se uma variável é MAIOR QUE a outra.
>= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
< Quando desejamos verificar se uma variável é MENOR QUE outra.
<= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
*/

    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;


    if(numero1 == numero2);{System.out.println("a nossa condição é verdadeira");}


    System.out.println("numeroUm é igual a numeroDois? " + simNao);

    simNao = numero1 != numero2;

    System.out.println("numeroUm é diferente de numeroDois? " + simNao);

    simNao = numero1 > numero2;

    System.out.println("numeroUm é maior que numeroDois? " + simNao);

}   

}
