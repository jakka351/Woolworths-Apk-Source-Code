package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzaux {
    private final ListenableFuture zza;

    public zzaux(final Context context, Executor executor) {
        this.zza = zzgot.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzauw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Context context2 = context;
                try {
                    return zzfoo.zza(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, executor);
    }

    public final ListenableFuture zza() {
        return this.zza;
    }
}
