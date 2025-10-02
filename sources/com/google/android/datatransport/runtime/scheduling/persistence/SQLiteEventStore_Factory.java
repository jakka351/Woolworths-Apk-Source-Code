package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import com.google.android.datatransport.runtime.time.UptimeClock;
import com.google.android.datatransport.runtime.time.WallTimeClock;
import javax.inject.Provider;

@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes.dex */
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f14488a;
    public final Provider b;

    public SQLiteEventStore_Factory(TimeModule_EventClockFactory timeModule_EventClockFactory, TimeModule_UptimeClockFactory timeModule_UptimeClockFactory, Provider provider, Provider provider2) {
        this.f14488a = provider;
        this.b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SQLiteEventStore(new WallTimeClock(), new UptimeClock(), (EventStoreConfig) EventStoreModule_StoreConfigFactory.InstanceHolder.f14486a.get(), (SchemaManager) this.f14488a.get(), this.b);
    }
}
