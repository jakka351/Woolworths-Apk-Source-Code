package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class EventStoreModule_DbNameFactory implements Factory<String> {

    public static final class InstanceHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final EventStoreModule_DbNameFactory f14483a = new EventStoreModule_DbNameFactory();
    }

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        return "com.google.android.datatransport.events";
    }
}
