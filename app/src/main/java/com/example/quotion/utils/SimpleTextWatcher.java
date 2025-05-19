package com.example.quotion.utils;

import android.text.Editable;
import android.text.TextWatcher;

public class SimpleTextWatcher implements TextWatcher {
    private Runnable callback;

    public SimpleTextWatcher(Runnable callback) {
        this.callback = callback;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        callback.run();
    }

    @Override
    public void afterTextChanged(Editable s) { }
}