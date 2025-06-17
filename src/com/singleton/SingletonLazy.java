///***
/// SingletonLazy é criado assim como o singleton padrão
/// Porém, ao invés de iniciarmos direto o nosso objeto
/// primeiro realizamos uma validação, onde caso a instancia não tenha sido criada
/// Criaremos uma, mas caso ela já exista, direcionamos para a instancia existente

package com.singleton;

public class SingletonLazy {
    private static SingletonLazy instanceLazy;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance(){
        // Se a nossa isntancia for "null" ou seja, não existir, então criamos uma instancia
        if (getInstance() == null){
            instanceLazy = new SingletonLazy();
        }
        // Caso já exista uma instancia, ele retorna a instancia existente
        return instanceLazy;
    }
}
