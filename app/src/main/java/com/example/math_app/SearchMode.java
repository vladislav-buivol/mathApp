package com.example.math_app;

import ir.mirrajabi.searchdialog.core.Searchable;

public class SearchMode implements Searchable {
    private String mTitle;

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public SearchMode(String mTitle) {

        this.mTitle = mTitle;
    }

    @Override
    public String getTitle() {
        return mTitle;
    }
}
