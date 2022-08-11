package tk.raphaels;
public class PessoaController {
    static public Boolean verificaSeaPessoaeDeMaior(Pessoa pessoa){
        if (pessoa == null){
            throw new NullPointerException();
        }
        String result;
        if(pessoa.getIdade() >= 18){
            return true;
        }else{
            return false;
        }
    }
}
