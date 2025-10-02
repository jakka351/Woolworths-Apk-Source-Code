package com.google.firebase.auth.internal;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.inject.Provider;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class zzad extends FirebaseAuth {
    public zzad(FirebaseApp firebaseApp, Provider provider, Provider provider2, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, Executor executor3) {
        super(firebaseApp, provider, provider2, executor, executor2, scheduledExecutorService, executor3);
    }
}
