package com.exemplos.ex1;

public class ConfigurationApp {
    //Criamos a instancia
    public static ConfigurationApp instance;

    String name;
    String version;
    String color;

    // O construtor dessa forma deve ser protected para que possa ser acessado em uma classe filha
    protected ConfigurationApp() {
        this.name = "Singleton App";
        this.version = "1.0";
        this.color = "red";
    }

    //Iniciamos o Singleton através de uma validação
    public ConfigurationApp getInstance(){
        if (instance == null){
            String config = System.getProperty("class.config");
            if (config == "test"){
                instance = new ConfigurationAppTest();
            }
            instance = new ConfigurationApp();
        }
        return instance;
    }



}
