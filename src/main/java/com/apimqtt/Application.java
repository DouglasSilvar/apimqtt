package com.apimqtt;

import io.micronaut.runtime.Micronaut;
import org.h2.tools.Server;

public class Application {
    public static void main(String[] args) throws Exception {
        Server.createWebServer().start();
        Micronaut.run(Application.class);
    }
}
