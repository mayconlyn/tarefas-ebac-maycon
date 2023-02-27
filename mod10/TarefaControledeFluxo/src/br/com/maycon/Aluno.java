package br.com.maycon;

/**
 * @author maycon.garcia
 */
public class Aluno {

        private String nome;
        private Double nota1;
        private Double nota2;
        private Double nota3;
        private Double nota4;

        public Aluno(String nome, double nota1, double nota2, double nota3, double nota4) {
            this.nome = nome;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
            this.nota4 = nota4;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
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

        /**
         * Método de cálculo de média
         * @return
         */
        private double calculoMedia(){

            return (nota1+nota2+nota3+nota4)/4;
        }

        /**
         * Método que retorna a situação do aluno: Aprovado, Recuperação, Reprovado
         * @return
         */
        public String situacaoAluno(){
                Double media = calculoMedia();
                if(media < 5)
                    return "Media = "+media+" - "+"Reprovado";
                if(media < 7)
                    return "Media = "+media+" - "+"Recuperação";
                else
                    return "Media = "+media+" - "+"Aprovado";

            }
}

