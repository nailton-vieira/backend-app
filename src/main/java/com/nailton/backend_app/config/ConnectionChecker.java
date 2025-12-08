package com.nailton.backend_app.config;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConnectionChecker implements CommandLineRunner{
     
    @Autowired
    private DataSource dataSource;
    
    @Override
    public void run(String... args) {
        try (Connection conn = dataSource.getConnection()) {
            System.out.println("✅ Backend conectado ao banco!");
        } catch (Exception e) {
            System.out.println("❌ Erro: " + e.getMessage());
        }
    }
}
