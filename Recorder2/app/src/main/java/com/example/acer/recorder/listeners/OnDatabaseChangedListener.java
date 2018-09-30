package com.example.acer.recorder.listeners;

/**
 * Created by acer on 9/30/2018.
 */

public interface OnDatabaseChangedListener{
    void onNewDatabaseEntryAdded();
    void onDatabaseEntryRenamed();
}