package com.example.ferreteria;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ferreteria.modelo.dto.Categoria;

import java.util.List;

public class CategoriaAdapter extends RecyclerView.Adapter<CategoriaAdapter.CategoriaViewHolder> {

    private List<Categoria> listCategorias;
    private static final String TAG = "CategoriaAdapter";

    public CategoriaAdapter(List<Categoria> categorias) {
        this.listCategorias = categorias;
        Log.i(TAG, "Adaptador de categorías inicializado con " + categorias.size() + " categorías.");
    }

    @NonNull
    @Override
    public CategoriaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.i(TAG, "onCreateViewHolder: Creando nueva vista para el elemento de categoría.");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_categoria, parent, false);
        return new CategoriaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriaViewHolder holder, int position) {
        Categoria categoria = listCategorias.get(position);
        holder.nombreTextView.setText(categoria.getNombre());
        holder.descripcionTextView.setText(categoria.getDescripcion());
        holder.imagenImageView.setImageResource(categoria.getImagen());
        Log.i(TAG, "onBindViewHolder: Asociando datos a la posición " + position + ", Categoría: " + categoria.getNombre());
    }

    @Override
    public int getItemCount() {
        return listCategorias.size();
    }

    static class CategoriaViewHolder extends RecyclerView.ViewHolder {
        ImageView imagenImageView;
        TextView nombreTextView, descripcionTextView;

        CategoriaViewHolder(View itemView) {
            super(itemView);
            imagenImageView = itemView.findViewById(R.id.imagenOf);
            nombreTextView = itemView.findViewById(R.id.marcaOf);
            descripcionTextView = itemView.findViewById(R.id.precio);
            Log.i(TAG, "CategoriaViewHolder: Vista del elemento de categoría inicializada.");
        }
    }
}
