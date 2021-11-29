package br.com.manoella.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private static List<Empresa> empresas = new ArrayList<>();
	
	public void adiciona(Empresa empresa) {
		empresas.add(empresa);		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.empresas;
	}

}
