package br.com.othonbatista.jogodeperguntas;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Questoes {

    @PrimaryKey(autoGenerate = true)
    private int id;


    private String pergunta;
    private String resposta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
