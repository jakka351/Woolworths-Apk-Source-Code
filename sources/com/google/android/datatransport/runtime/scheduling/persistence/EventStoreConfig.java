package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
abstract class EventStoreConfig {

    /* renamed from: a, reason: collision with root package name */
    public static final AutoValue_EventStoreConfig f14482a;

    @AutoValue.Builder
    public static abstract class Builder {
    }

    static {
        AutoValue_EventStoreConfig.Builder builder = new AutoValue_EventStoreConfig.Builder();
        builder.f14480a = 10485760L;
        builder.b = 200;
        builder.c = Integer.valueOf(ModuleDescriptor.MODULE_VERSION);
        builder.d = 604800000L;
        builder.e = 81920;
        String strG = builder.f14480a == null ? " maxStorageSizeInBytes" : "";
        if (builder.b == null) {
            strG = strG.concat(" loadBatchSize");
        }
        if (builder.c == null) {
            strG = YU.a.g(strG, " criticalSectionEnterTimeoutMs");
        }
        if (builder.d == null) {
            strG = YU.a.g(strG, " eventCleanUpAge");
        }
        if (builder.e == null) {
            strG = YU.a.g(strG, " maxBlobByteSizePerRow");
        }
        if (!strG.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strG));
        }
        f14482a = new AutoValue_EventStoreConfig(builder.b.intValue(), builder.c.intValue(), builder.e.intValue(), builder.f14480a.longValue(), builder.d.longValue());
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
