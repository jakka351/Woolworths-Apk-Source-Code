package com.google.firebase.perf.injection.modules;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import dagger.Module;

@Module
/* loaded from: classes.dex */
public class FirebasePerformanceModule {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseApp f15694a;
    public final FirebaseInstallationsApi b;
    public final Provider c;
    public final Provider d;

    public FirebasePerformanceModule(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider, Provider provider2) {
        this.f15694a = firebaseApp;
        this.b = firebaseInstallationsApi;
        this.c = provider;
        this.d = provider2;
    }
}
