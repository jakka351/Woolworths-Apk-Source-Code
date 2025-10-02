package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class EventStoreModule_SchemaVersionFactory implements Factory<Integer> {

    public static final class InstanceHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final EventStoreModule_SchemaVersionFactory f14485a = new EventStoreModule_SchemaVersionFactory();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return Integer.valueOf(SchemaManager.g);
    }
}
