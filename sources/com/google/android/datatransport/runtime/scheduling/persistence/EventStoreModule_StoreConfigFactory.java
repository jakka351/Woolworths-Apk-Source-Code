package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class EventStoreModule_StoreConfigFactory implements Factory<EventStoreConfig> {

    public static final class InstanceHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final EventStoreModule_StoreConfigFactory f14486a = new EventStoreModule_StoreConfigFactory();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AutoValue_EventStoreConfig autoValue_EventStoreConfig = EventStoreConfig.f14482a;
        if (autoValue_EventStoreConfig != null) {
            return autoValue_EventStoreConfig;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
