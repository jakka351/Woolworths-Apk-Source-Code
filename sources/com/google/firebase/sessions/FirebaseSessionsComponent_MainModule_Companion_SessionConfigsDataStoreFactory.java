package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.InstanceFactory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import com.google.firebase.sessions.settings.SessionConfigs;
import com.google.firebase.sessions.settings.SessionConfigsSerializer;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory implements Factory<DataStore<SessionConfigs>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f15800a;
    public final Provider b;

    public FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2) {
        this.f15800a = instanceFactory;
        this.b = instanceFactory2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context appContext = (Context) this.f15800a.get();
        CoroutineContext blockingDispatcher = (CoroutineContext) this.b.get();
        Intrinsics.h(appContext, "appContext");
        Intrinsics.h(blockingDispatcher, "blockingDispatcher");
        return FirebaseSessionsComponent.MainModule.Companion.a(SessionConfigsSerializer.f15845a, new ReplaceFileCorruptionHandler(new au.com.woolworths.android.onesite.analytics.a11y.a(18)), CoroutineScopeKt.a(blockingDispatcher), new a(appContext, 0));
    }
}
