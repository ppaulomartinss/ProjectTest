package br.iesb.projecttest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 1514290054 on 25/08/2017.
 */

public class ListaAdapter extends RecyclerView.Adapter {

    private Context context;

    public ListaAdapter(Context context) {this.context = context;}

    @Override
    public ListaViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(context).inflate(R.layout.format_itens_layout, parent, false);

        return new ListaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListaViewHolder extends RecyclerView.ViewHolder {
        public TextView cargo;
        public TextView cidade;
        public TextView restricao;
        public TextView salario;
        public TextView descricao;

        public ListaViewHolder(View v){
            super(v);

            cargo = (TextView) v.findViewById(R.id.txtCargo);
            cidade = (TextView) v.findViewById(R.id.txtCidade);
            restricao = (TextView) v.findViewById(R.id.txtRestricao);
            salario = (TextView) v.findViewById(R.id.txtSalario);
            descricao = (TextView) v.findViewById(R.id.txtDescricaoVaga);
        }
    }
}
