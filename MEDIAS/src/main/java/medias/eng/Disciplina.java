/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package medias.eng;

/**
 *
 * @author kethe
 */
public class Disciplina {
private String nome;
    private double p1;
    private double p2;
    private double media;
    private String situacao;
    private MediaStrategy estrategia;

    // Construtor recebe apenas a estratégia
    public Disciplina(MediaStrategy estrategia) {
        this.estrategia = estrategia;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getMedia() {
        return media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void calcularMedia() {
        this.media = estrategia.calcularMedia(p1, p2);
        this.situacao = estrategia.verificarSituacao(media);
    }
}
