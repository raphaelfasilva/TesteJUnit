package tk.raphaels;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
     Pessoa pessoa = new Pessoa();
     pessoa.setNome("Fulano de tal");
     pessoa.setIdade(18);
     pessoa.setCidade("São Paulo");
     pessoa.setEstado("SP");
     JOptionPane.showMessageDialog(null,"Nome: " + pessoa.getNome()+"\n" + " Idade: " + pessoa.getIdade() +"\n"+ " Cidade: " +pessoa.getCidade() + "\n"+ " Estado: " +pessoa.getEstado());
     Boolean result = PessoaController.verificaSeaPessoaeDeMaior(pessoa);
     if(result == true){
         JOptionPane.showMessageDialog(null,pessoa.getNome() +" é de maior");
     }else{
         JOptionPane.showMessageDialog(null,pessoa.getNome() +" é de menor");
     }
    }
}
