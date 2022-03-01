package cursoClasse;

import java.util.Objects;

//classe Disciplina serva para todas instâncias
public class Disciplina {

    private String disciplinas;
    private int notas;

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "disciplinas='" + disciplinas + '\'' +
                ", notas=" + notas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina)) return false;
        Disciplina that = (Disciplina) o;
        return getNotas() == that.getNotas() && getDisciplinas().equals(that.getDisciplinas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDisciplinas(), getNotas());
    }
}
