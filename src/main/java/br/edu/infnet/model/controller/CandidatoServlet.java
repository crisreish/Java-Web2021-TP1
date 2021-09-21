package br.edu.infnet.model.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CandidatoServlet", value = "/CandidatoServlet")
public class CandidatoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CandidatoServlet () {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, ServletException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, ServletException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");

        System.out.printf("[%s] O Candidato %s (%s) está cadastrado com o e-mail %s", nome, email);
    }
}
