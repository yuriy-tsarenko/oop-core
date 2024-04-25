package com.goit.oop.http.server;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Головний клас Server, який створює HTTP сервер на порту 8080.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        /**
         * Створюємо новий екземпляр HttpServer, який слухає на localhost порту 8080.
         */
        HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8080), 0);

        /**
         * Створюємо ThreadPoolExecutor з 10 потоками для обробки HTTP запитів.
         */
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

        /**
         * Додаємо HttpDispatcher як обробник HTTP запитів до кореневого контексту сервера.
         */
        server.createContext("/", new HttpDispatcher());

        /**
         * Встановлюємо executor для HttpServer.
         */
        server.setExecutor(threadPoolExecutor);

        /**
         * Запускаємо сервер.
         */
        server.start();

        System.out.println(" Server started on port 8080");
    }
}