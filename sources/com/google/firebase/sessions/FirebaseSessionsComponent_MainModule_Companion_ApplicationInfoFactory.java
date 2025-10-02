package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.InstanceFactory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory implements Factory<ApplicationInfo> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f15799a;

    public FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory(InstanceFactory instanceFactory) {
        this.f15799a = instanceFactory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        FirebaseApp firebaseApp = (FirebaseApp) this.f15799a.get();
        Intrinsics.h(firebaseApp, "firebaseApp");
        SessionEvents sessionEvents = SessionEvents.f15818a;
        return SessionEvents.a(firebaseApp);
    }
}
