package br.com.Herança.Upcast.Downcast;

public class RodarAplicacao {

    public static void main(String[] args) {

        //Instancicia a classe
        Funcionario funcionario = new Funcionario();

        //Upcasts
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcasts, deve ser evitados pois dão erro.
        Vendedor vededor_ = (Vendedor) new Funcionario();

    }
}
