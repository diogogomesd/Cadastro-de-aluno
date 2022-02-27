package cursoClasse;

import java.util.Objects;

//esta é a classe objeto que representa o aluno
public class Aluno {

    private String nome;
    private int idade;
    private String dataNascimento;
    private int registroGeral;
    private int numeroCpf;
    private String nomeMae;
    private String nomePai;
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(int registroGeral) {
        this.registroGeral = registroGeral;
    }

    public int getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(int numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMediaNota(){
        double media = 0;
        media =(nota1 + nota2 + nota3 + nota4)/4;
        return media;
    }
    public boolean getAlunoAprovado(){
        double media = this.getMediaNota();
        if (media >= 70){
            return true;
        }else{
            return false;
        }
    }
    public String getAlunoAprovado2(){
        double media = this.getMediaNota();
        if (media >= 70){
            return "Aluno Aprovado";
        }else{
            return "Aluno Reprovado";
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral=" + registroGeral +
                ", numeroCpf=" + numeroCpf +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return getIdade() == aluno.getIdade() && getRegistroGeral() == aluno.getRegistroGeral() && getNumeroCpf() == aluno.getNumeroCpf() && Objects.equals(getNome(), aluno.getNome()) && Objects.equals(getDataNascimento(), aluno.getDataNascimento()) && Objects.equals(getNomeMae(), aluno.getNomeMae()) && Objects.equals(getNomePai(), aluno.getNomePai()) && Objects.equals(getDataMatricula(), aluno.getDataMatricula()) && Objects.equals(getNomeEscola(), aluno.getNomeEscola()) && Objects.equals(getSerieMatriculado(), aluno.getSerieMatriculado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getIdade(), getDataNascimento(), getRegistroGeral(), getNumeroCpf(), getNomeMae(), getNomePai(), getDataMatricula(), getNomeEscola(), getSerieMatriculado());
    }
}
