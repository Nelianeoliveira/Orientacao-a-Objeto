package br.com.Heranca.Polimorfismo_Sobrescrita;

class  RodarAplicacao {

    public static void main(String[] args) {
       //Cria um vetor classeMae
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

       //Sobrescrita e polimorfismo
        for (ClasseMae classe : classes) {
            classe.metodo1();
        }

        System.out.println("");

        //Sobrescrita e polimorfismo
        for (ClasseMae classe : classes) {
            classe.metodo2();
        }

        System.out.println("");

        //Sobrescrita
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}

