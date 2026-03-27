public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double notaReavaliacao;

    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String m) {
        this.matricula = m;
    }

    public double getNota1() {
        return nota1;
    }
    public void setNota1(double n1) {
        this.nota1 = n1;    
    }

    public double getNota2() {
        return nota2;
    }
     public void setNota2(double n2) {
        this.nota2 = n2;
    }

    public double getNotaReavaliacao() {
        return notaReavaliacao;
    }
    public void setNotaReavaliacao(double nr) {
        this.notaReavaliacao = nr;
    }


    public double calcularMedia() {
        return (nota1 + nota2) / 2;
        
    }
    public double calcularMediaFinal() {
        if (calcularMedia() >= 6) {
            return calcularMedia();
        } else {
            return (calcularMedia() + notaReavaliacao) / 2;
        }
    }
    public void exibir() {
        System.out.println("Nome do aluno: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nota P1: " + getNota1());
        System.out.println("Nota P2: " + getNota2());
        System.out.printf("Media Final: %.2f %n" , calcularMediaFinal());
    }
}
