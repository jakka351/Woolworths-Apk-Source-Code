package com.google.android.recaptcha.internal;

import java.util.concurrent.Executors;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzbi {

    @NotNull
    private final CoroutineScope zza;

    @NotNull
    private final CoroutineScope zzb;

    @NotNull
    private final CoroutineScope zzc;

    @NotNull
    private final CoroutineScope zzd;

    public zzbi() {
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        this.zza = new ContextScope(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, MainDispatcherLoader.f24726a));
        ContextScope contextScopeA = CoroutineScopeKt.a(new ExecutorCoroutineDispatcherImpl(Executors.newSingleThreadExecutor()));
        BuildersKt.c(contextScopeA, null, null, new zzbh(null), 3);
        this.zzb = contextScopeA;
        this.zzc = CoroutineScopeKt.a(DefaultIoScheduler.f);
        ContextScope contextScopeA2 = CoroutineScopeKt.a(new ExecutorCoroutineDispatcherImpl(Executors.newSingleThreadExecutor()));
        BuildersKt.c(contextScopeA2, null, null, new zzbg(null), 3);
        this.zzd = contextScopeA2;
    }

    @NotNull
    public final CoroutineScope zza() {
        return this.zzc;
    }

    @NotNull
    public final CoroutineScope zzb() {
        return this.zza;
    }

    @NotNull
    public final CoroutineScope zzc() {
        return this.zzd;
    }

    @NotNull
    public final CoroutineScope zzd() {
        return this.zzb;
    }
}
