package br.com.caelum.jdbc.dao;

import java.sql.Connection;

import br.com.caelum.jdbc.ConnectionFactory;

public class ContatoDao {

    // a conexão com o banco de dados
    private Connection connection;

    public ContatoDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

}