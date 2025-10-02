package com.google.android.gms.ads.initialization;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface AdapterStatus {

    public enum State {
        NOT_READY,
        READY
    }

    @NonNull
    String getDescription();

    @NonNull
    State getInitializationState();

    int getLatency();
}
