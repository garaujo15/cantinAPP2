package br.com.zottesso.persistenciaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class ProdutosActivity extends AppCompatActivity {

    private TextView textProdutos;
    private ListView listas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        textProdutos = (TextView) findViewById(R.id.textProdutos);
        listas = (ListView) findViewById(R.id.lista);
        // Buscar todos os produtos do banco

        List<Produto> produtos = Produto.listAll(Produto.class);

        ArrayAdapter<Produto> adapter = new ArrayAdapter<Produto>(this,
                android.R.layout.simple_list_item_1, produtos);

        listas.setAdapter(adapter);

    }
}
