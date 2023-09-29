package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private boolean inclusoNoPlano;
    private double somaAvaliacoes;
    private int numeroDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo (String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getNumeroDeAvaliacoes() {
        return numeroDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean getInclusoNoPlano() {
        return inclusoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano) {
        this.inclusoNoPlano = inclusoNoPlano;
    }

    public void exibeFichaTecnica () {
        System.out.println ("O nome do título é: " + nome);
        System.out.println("Foi lançado em " + anoDeLancamento);
        System.out.println("Seu tempo de duração é de " + getDuracaoEmMinutos() + " minutos.");
    }
    public void avalia (double somaAvaliacoes){
        this.somaAvaliacoes += somaAvaliacoes;
        numeroDeAvaliacoes ++;
    }
    public double obtennhaMedia () {
        return somaAvaliacoes/numeroDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return getNome().compareTo(outroTitulo.getNome());
    }
}
