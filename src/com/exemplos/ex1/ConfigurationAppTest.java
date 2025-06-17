package com.exemplos.ex1;

public class ConfigurationAppTest extends ConfigurationApp{
    String name;
    String version;
    String color;

    protected ConfigurationAppTest(){
        this.name = "Singleton test";
        this.version = "1.1";
        this.color = "Green";
    }
}
