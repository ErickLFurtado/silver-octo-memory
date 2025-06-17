///***
/// Singleton criados dessa forma iniciam a instancia do objeto assim que o programa é iniciado
/// Utilizado em casos especificos, porém podem causar problema em casos de multThreads
/// Outra forma de utilizar é transformar o singleton em enum


package com.singleton;

public class SingletonPadrao {
    public static final SingletonPadrao INSTANCE = new SingletonPadrao();

    private SingletonPadrao() {
    }

    public static void mostrarMensagem(){
        System.out.println("SingletonFuncionando!");
    }
}
