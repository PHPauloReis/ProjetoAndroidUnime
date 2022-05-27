package br.com.othonbatista.jogodeperguntas;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import lombok.Data;

@Data
@Entity
public class Questoes {

    @PrimaryKey(autoGenerate = true)
    private int id;


    private String pergunta;
    private String resposta;
}
