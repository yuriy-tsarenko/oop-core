package com.goit.oop.http.server;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Клас HttpDispatcher, який реалізує інтерфейс HttpHandler.
 * Цей клас обробляє HTTP запити та відправляє відповіді.
 */
public class HttpDispatcher implements HttpHandler {

    /**
     * Метод handle, який обробляє HTTP запити.
     */
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        if ("GET".equals(httpExchange.getRequestMethod())) {
            handleResponse(httpExchange);
        } else if ("POST".equals(httpExchange.getRequestMethod())) {
            // handlePostRequest(httpExchange);
        }
    }

    /**
     * Метод handleResponse, який обробляє HTTP відповіді.
     */
    private void handleResponse(HttpExchange httpExchange) throws IOException {
        OutputStream outputStream = httpExchange.getResponseBody();
        httpExchange.getResponseHeaders().add("AUTHORIZATION","Bearer adawfdfarecaercservserrvraervaervervaervaevrv");
        Gson gson = new GsonBuilder().create();

        List<User> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            list.add(new User((long) i, "user"+i, true));
        }
        String json = gson.toJson(list);

        httpExchange.sendResponseHeaders(200, json.length());

        outputStream.write(json.getBytes());
        outputStream.flush();
        outputStream.close();
    }
}