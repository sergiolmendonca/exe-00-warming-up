# Warming Up: instruções, declarações, variáveis, condicionais, laços e lógica

[My Führer ... first you should make simple programs](http://youtu.be/G1fFCnjThCQ)

* * *

## Exercício de Lógica

Apresentar preferencialmente dia: 2018-08-08

### Máximo Divisor Comum (MDC)

Implementar o MDC.

Casos de Teste:
```java
// primeiro caso de teste, considere dois números:
int n1 = 18;
int n2 = 12;
// pressupõe-se que o mdc seja 1
int mdc = 1;
// complete o algoritmo:

// para o caso de n1 = 18 e n2 = 12 deve imprimir 6
System.out.println(mdc); // 6
System.out.println(mdc == 6); // true
// -----------------------------------------------------
// segundo caso de teste, reatribuindo:
n1 = 34300;
n2 = 52880;
// algoritmo aqui:

// nestas condições (dada esta entrada)
System.out.println(mdc); // 20
System.out.println(mdc == 20); // true
// -----------------------------------------------------
// terceiro caso de teste, reatribuindo:
n1 = 862021;
n2 = 88739;
// algoritmo aqui:

// neste caso os números são primos entre si:
System.out.println(mdc); // 1
System.out.println(mdc == 1); // true
```

### Primalidade

Dado um número descobrir se ele é primo ou não.

Casos de Teste:
```java
// primeiro caso de teste, um número par:
int n = 18;
// pressupõe-se que ele não seja primo:
boolean primo = false;
// complete o algoritmo:

// para o caso de n = 18, é primo
System.out.println(primo); // true
System.out.println(primo == true); // true
// -----------------------------------------------------
// segundo caso de teste, reatribuindo:
n = 61;
// algoritmo aqui:

// nestas condições (dada esta entrada), **não** é primo:
System.out.println(primo); // false
System.out.println(primo == false); // true
// -----------------------------------------------------
// terceiro caso de teste, reatribuindo:
n = 966213;
// algoritmo aqui:

// neste caso é primo:
System.out.println(primo); // true
System.out.println(primo == true); // true
```

Ref: <https://oeis.org/A000040>

### Número Feliz

Dado um número descobrir se ele é um número feliz.

> Os números felizes são definidos pelo seguinte procedimento. Começando com qualquer número inteiro positivo, o número é substituído pela soma dos quadrados dos seus dígitos, e repetir o processo até que o número seja igual a 1 ou até que ele entre num ciclo infinito que não inclui um ou seja a soma dos quadrados dos algarismos do quadrado de um número positivo inicial. Os números no fim do processo de extremidade com 1, são conhecidos como números feliz, mas aqueles que não terminam com um 1 são números chamados infelizes.
>
> `7` é um número feliz:
> `7² = 49`,
> `4² + 9² = 97`,
> `9² + 7² = 130`,
> `1² + 3² + 0² = 10`,
> `1² + 0² = 1`.
>
> <https://pt.wikipedia.org/wiki/N%C3%BAmero_feliz>

Casos de Teste:
```java
// primeiro caso de teste, um caso conhecido:
int n = 47;
// mas pressupõe-se que ele não seja feliz:
boolean feliz = false;
// complete o algoritmo:

// para o caso de n = 47, é feliz
System.out.println(feliz); // true
System.out.println(feliz == true); // true
// -----------------------------------------------------
// segundo caso de teste, reatribuindo:
n = 37;
// algoritmo aqui:

// nestas condições (dada esta entrada), **não** é feliz:
System.out.println(feliz); // false
System.out.println(feliz == false); // true
// -----------------------------------------------------
// terceiro caso de teste, reatribuindo:
n = 331;
// algoritmo aqui:

// neste caso é feliz:
System.out.println(feliz); // true
System.out.println(feliz == true); // true
```

Ref: <https://oeis.org/A007770>

* * *

> _"You might not think that programmers are artists, but programming is an extremely creative profession. It's logic-based creativity."_
>
> - John Romero
