class MDC {
  public static void main(String[] args) {
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
  }
}
