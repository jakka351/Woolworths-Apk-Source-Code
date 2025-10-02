package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.DataStoreImpl;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes5.dex */
public final class zzfse implements zzhpx {
    private final zzhqg zza;

    private zzfse(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzfse zza(zzhqg zzhqgVar) {
        return new zzfse(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final Object zzb() {
        final Context context = ((zzchb) this.zza).zza();
        Intrinsics.h(context, "context");
        zzfsc zzfscVar = zzfsc.zza;
        Function0 function0 = new Function0() { // from class: com.google.android.gms.internal.ads.zzfsd
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Object invoke() {
                return DataStoreFile.a(context, "ad_quality_data.pb");
            }
        };
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f;
        CompletableJob completableJobB = SupervisorKt.b();
        defaultIoScheduler.getClass();
        DataStoreImpl dataStoreImplA = DataStoreFactory.a(zzfscVar, null, EmptyList.d, CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c(defaultIoScheduler, completableJobB)), function0);
        zzhqf.zzb(dataStoreImplA);
        return dataStoreImplA;
    }
}
