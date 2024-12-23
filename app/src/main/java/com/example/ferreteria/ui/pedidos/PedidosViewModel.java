package com.example.ferreteria.ui.pedidos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PedidosViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PedidosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Generar Pedido");
    }

    public LiveData<String> getText() {
        return mText;
    }
}