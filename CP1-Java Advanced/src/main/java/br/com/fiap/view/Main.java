package br.com.fiap.view;

import br.com.fiap.dao.JpaDao;
import br.com.fiap.model.FuncionarioJunior;
import br.com.fiap.model.FuncionarioPleno;
import br.com.fiap.model.FuncionarioSenior;

public class Main {
    public static void main(String[] args) {

        JpaDao dao = new JpaDao();

        FuncionarioJunior fj = new FuncionarioJunior("Pedro",10.0,70.0);
        dao.pesquisar(fj);
        fj.imprimirInformacao();

        FuncionarioJunior j1 = new FuncionarioJunior("Larissa",8.0,70.0);
        dao.pesquisar(j1);
        j1.imprimirInformacao();

        FuncionarioPleno fp = new FuncionarioPleno("Murillo",20.0,80.0);
        dao.pesquisar(fp);
        fp.imprimirInformacao();

        FuncionarioSenior fs = new FuncionarioSenior("Luna",30.0,90.0);
        dao.pesquisar(fs);
        fs.imprimirInformacao();



    }
}