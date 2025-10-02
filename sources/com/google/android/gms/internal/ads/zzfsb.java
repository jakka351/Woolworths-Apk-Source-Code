package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class zzfsb {

    @NotNull
    private final zzfrx zza;

    @PublishedApi
    public final /* synthetic */ zzfrz zza() {
        zzhih zzhihVarZzbu = this.zza.zzbu();
        Intrinsics.g(zzhihVarZzbu, "build(...)");
        return (zzfrz) zzhihVarZzbu;
    }

    @JvmName
    public final /* synthetic */ zzhll zzb() {
        Map mapZzb = this.zza.zzb();
        Intrinsics.g(mapZzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zzhll(mapZzb);
    }

    @JvmName
    public final void zzc(@NotNull zzhll zzhllVar, @NotNull String key, @NotNull zzfrv value) {
        Intrinsics.h(zzhllVar, "<this>");
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
        this.zza.zzc(key, value);
    }

    @JvmName
    public final /* synthetic */ void zzd(zzhll zzhllVar, String key) {
        Intrinsics.h(zzhllVar, "<this>");
        Intrinsics.h(key, "key");
        this.zza.zza(key);
    }
}
