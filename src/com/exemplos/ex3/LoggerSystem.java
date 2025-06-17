package com.exemplos.ex3;

public final class LoggerSystem {
    private static LoggerSystem instance;

    private LoggerSystem(){
    }

    public static LoggerSystem getInstance(){
        if (instance == null) {
            instance = new LoggerSystem();
        }
        return instance;
    }

    public void info(){
        System.out.println("Log iniciado!");
    }

    public void error(){
        System.out.println("Falha ao conectar");
    }

    public void close(){
        System.out.println("Fechando sistema");
        getInstance().close();
    }

}
