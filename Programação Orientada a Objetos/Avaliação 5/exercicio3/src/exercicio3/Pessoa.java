package exercicio3;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa  {
    private int idade;
    private String nome, dia, mes, ano;

    public Pessoa() {

    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDia() {
        return this.dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return this.mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void ajustaDataDeNascimento (String dia, String mes, String ano) throws Exception {
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);

        if (Integer.parseInt(this.getDia()) <= 0 || Integer.parseInt(this.getDia()) > 31) {
            throw new Exception("Nova Exceção");
        } else if (Integer.parseInt(this.getMes()) <= 0 || Integer.parseInt(this.getMes()) > 12) {
            throw new Exception("Nova Exceção");
        } else if (Integer.parseInt(this.getAno()) <= 0) {
            throw new Exception("Nova Exceção");
        }
    }

    public void calculaIdade () {
        String dataNascimento = this.getDia() + "/" + this.getMes() + "/" + this.getAno();
        LocalDate dataAtual = LocalDate.now(); // Instancia de um objeto do tipo LocalDate que representa a data atual sem hora;

        // Conversão da data de nascimento para LocalDate
        LocalDate dataNascimentoLocalDate = LocalDate.parse(dataNascimento, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        // Cálculo da diferença entre ambas as datas em anos
        this.setIdade(Period.between(dataNascimentoLocalDate, dataAtual).getYears());
    }
}
