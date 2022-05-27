package br.com.othonbatista.jogodeperguntas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BancoDeDadosSQLite extends SQLiteOpenHelper  {

    public BancoDeDadosSQLite(Context context) {

        super(context, "SQliteBancoDeDados", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE questoes (id INTEGER PRIMARY KEY AUTOINCREMENT, pergunta TEXT, resposta TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
