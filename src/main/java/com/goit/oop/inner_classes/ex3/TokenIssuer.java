package com.goit.oop.inner_classes.ex3;

import io.jsonwebtoken.Jwts;

import java.sql.Date;
import java.time.LocalDate;

/**
 * Клас TokenIssuer, який використовується для видачі токенів.
 */
public class TokenIssuer {

    /**
     * Метод issueToken(), який видає токен для аутентифікації.
     */
    public String issueToken(Authentication authenticate, String password) {

        /**
         * Внутрішній клас Generator, який генерує токен.
         */
        class Generator {
            /**
             * Метод generateToken(), який генерує токен.
             */
            public String generateToken() {
                KeyStorage storage = new KeyStorage();
                int LIVE_DAYS = storage.getLiveDays();
                LocalDate currentDate = LocalDate.now();
                LocalDate expirationDate = currentDate.plusDays(LIVE_DAYS);
                return Jwts.builder()
                        .setSubject(String.format("%s_%s", authenticate.getName(), password))
                        .claim("authorities", authenticate.getAuthorities())
                        .setIssuedAt(Date.valueOf(currentDate))
                        .setExpiration(Date.valueOf(expirationDate))
                        .signWith(storage.getSecretKey())
                        .compact();
            }
        }
        return new Generator().generateToken();
    }

}