package tk.raphaels;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tk.raphaels.Pessoa;
import tk.raphaels.PessoaController;

public class Teste{
    private Pessoa pessoa = null;
    @BeforeEach
    public void Reseta(){}{
        pessoa = null;
    }
    @Test
    @DisplayName("Verifica se a pessoa e de maior")
    public void verificaSeaPessoaeDeMaior(){
        pessoa = new Pessoa();
        pessoa.setNome("Fulano de tal");
        pessoa.setIdade(21);
        pessoa.setCidade("São Paulo");
        pessoa.setEstado("SP");
        Assertions.assertTrue(PessoaController.verificaSeaPessoaeDeMaior(pessoa));
    }
    @Test
    @DisplayName("Verifica se a pessoa e de menor")
    public void verificaSeaPessoaeDeMenor(){
        pessoa = new Pessoa();
        pessoa.setNome("Ciclano de tal");
        pessoa.setIdade(14);
        pessoa.setCidade("São Paulo");
        pessoa.setEstado("SP");
        Assertions.assertFalse(PessoaController.verificaSeaPessoaeDeMaior(pessoa));
    }
    @Test
    @DisplayName("Verifica se idade da pessoal foi passado como null")
    public void verificaSeaIdadeFoiPassadoComoNUll(){
        Assertions.assertThrows(NullPointerException.class, () ->PessoaController.verificaSeaPessoaeDeMaior(pessoa));
    }
}
