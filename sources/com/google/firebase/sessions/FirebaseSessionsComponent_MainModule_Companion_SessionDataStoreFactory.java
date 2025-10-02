package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import au.com.woolworths.feature.shared.instore.wifi.ui.d;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.InstanceFactory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory implements Factory<DataStore<SessionData>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f15801a;
    public final Provider b;
    public final com.google.firebase.sessions.dagger.internal.Provider c;

    public FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, com.google.firebase.sessions.dagger.internal.Provider provider) {
        this.f15801a = instanceFactory;
        this.b = instanceFactory2;
        this.c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context appContext = (Context) this.f15801a.get();
        CoroutineContext blockingDispatcher = (CoroutineContext) this.b.get();
        SessionDataSerializer sessionDataSerializer = (SessionDataSerializer) this.c.get();
        Intrinsics.h(appContext, "appContext");
        Intrinsics.h(blockingDispatcher, "blockingDispatcher");
        Intrinsics.h(sessionDataSerializer, "sessionDataSerializer");
        return FirebaseSessionsComponent.MainModule.Companion.a(sessionDataSerializer, new ReplaceFileCorruptionHandler(new d(sessionDataSerializer, 6)), CoroutineScopeKt.a(blockingDispatcher), new a(appContext, 1));
    }
}
