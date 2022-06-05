package br.com.othonbatista.jogodeperguntas;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.room.Dao;

@Dao
public class QuestoesDAO {

    public static long inserirQuestao(Context context, Questoes questoes) {
        BancoDeDadosSQLite bancoDeDadosSQLite = new BancoDeDadosSQLite(context);
        SQLiteDatabase sqLiteDatabase = bancoDeDadosSQLite.getWritableDatabase();

        ContentValues contentValues = new ContentValues();

        contentValues.put("pergunta", questoes.getPergunta());
        contentValues.put("resposta", questoes.getResposta());

        return sqLiteDatabase.insert("Questoes", null, contentValues);
    }

}
