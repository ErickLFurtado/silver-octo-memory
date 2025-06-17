///***
/// Utilizando os singletons, podemos garantir que uma instancia tenha um ponto de acesso global
/// ao mesmo tempo em que garantimos que seu construtor não seja exposto
/// Além disso, garantimos que somente haja uma unica instancia desse objeto
/// evitando sobrecarga de memória

import com.exemplos.ex2.SimpleThreadSingleton;
import com.exemplos.ex3.LoggerSystem;

public class Main {
    public static void main(String[] args) {

        //Exmeplo 2 instanciado

        System.out.println("O mesmo valor deve aparecer caso a mesma instancia seja retornada!");

        SimpleThreadSingleton singleton = SimpleThreadSingleton.getInstance("10");
        SimpleThreadSingleton novosingleton = SimpleThreadSingleton.getInstance("9");

        System.out.println(singleton.value);
        System.out.println(novosingleton.value);

        // Podemos ver com esse exemplo que apesar de um novo objeto ter sido criado
        //a instancia utilizada segue sendo a mesma.


        //Exemplo 3 instanciado


        LoggerSystem log = LoggerSystem.getInstance();
        log.info();
        log.error();
        log.close();

        //Com nosso construtor privado e nossa instancia sendo global, garantimos que não haja erros em
        //sistemas como de log.
        //Nesse caso, caso haja a necessidade de salvar mensagem/arquivos/logs
        //multiplas instancias poderiam atrapalhar.
        //Portanto, com o singleton garantimos a segurança dos nossos arquivos para casos como esse
    }
}