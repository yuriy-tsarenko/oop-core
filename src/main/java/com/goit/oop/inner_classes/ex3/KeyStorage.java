package com.goit.oop.inner_classes.ex3;

import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;

/**
 * Клас KeyStorage, який використовується для зберігання ключів.
 */
public class KeyStorage {
    /**
     * Метод getLiveDays(), який повертає кількість днів, протягом яких ключ є дійсним.
     */
    public int getLiveDays() {
        return 0;
    }

    /**
     * Метод getSecretKey(), який повертає секретний ключ.
     */
    public SecretKey getSecretKey() {
        return Keys.hmacShaKeyFor("asdcsdcsdcSDCSEFawrfrewcfawefawexfxawefa".getBytes());
    }
}