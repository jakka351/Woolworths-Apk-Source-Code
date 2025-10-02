package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class zzfth {
    @NotNull
    public static final zzftf zza(@NotNull final ExecutorService executorService) {
        Intrinsics.h(executorService, "executorService");
        return new zzftf() { // from class: com.google.android.gms.internal.ads.zzftg
            @Override // com.google.android.gms.internal.ads.zzftf
            public final CoroutineScope zza() {
                return CoroutineScopeKt.a(new ExecutorCoroutineDispatcherImpl(executorService));
            }
        };
    }
}
