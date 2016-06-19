/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.furb.model;

import br.furb.Veiculo;
import br.furb.arquivo.Arquivo;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Flávio e Carol
 */
public class VeiculoModel implements Model {
    
    private static final String caminhoVeiculo = Paths.get("Veiculo").toAbsolutePath().toString();
    
    @Override
    public void salvar(Object info) throws Exception {
        Arquivo.getInstance().salvar(info, ((Veiculo) info).getPlaca(), caminhoVeiculo);
    }

    @Override
    public Object recuperar(String chave) throws Exception {
        return Arquivo.getInstance().recuperar(chave, "Veiculo");
    }

    @Override
    public List recuperar() throws Exception {
        return Arquivo.getInstance().recuperar(caminhoVeiculo);
    }
    
}
