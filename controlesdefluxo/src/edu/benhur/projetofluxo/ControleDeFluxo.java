package edu.benhur.projetofluxo;

public class ControleDeFluxo {
    public static void main(String[] args) {

        ifArrow();

        ifNoArrow();

        bigIf();

        ifFerias();

        switchSemana();

        switchNumero();

        switchFerias();
    }

    public static void ifArrow() {
        int mes = 9;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Mail");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dazembro");
                                                    } else {

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void ifNoArrow() {
        int mes = 9;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");   
        } else if (mes == 3) {
            System.out.println("Março");   
        } else if (mes == 4) {
            System.out.println("Abril");   
        } else if (mes == 5) {
            System.out.println("Mail");   
        } else if (mes == 6) {
            System.out.println("Junho");   
        } else if (mes == 7) {
            System.out.println("Julho");   
        } else if (mes == 8) {
            System.out.println("Agosto");   
        } else if (mes == 9) {
            System.out.println("Setembro");   
        } else if (mes == 10) {
            System.out.println("Outubro");   
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        }
    }
    public static void ifFerias() {
        //Não Fazer
        String mes = "junho";
        if (mes == "julho" || mes == "dezembro" || mes == "junho") {
            System.out.println("Férias");
        }

    }
    public static void bigIf() {
        
    }
    public static void switchSemana() {
        
    }
    public static void switchNumero() {
        
    }
    public static void switchFerias() {
        
    }
}
