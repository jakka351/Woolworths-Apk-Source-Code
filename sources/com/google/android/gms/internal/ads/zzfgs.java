package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class zzfgs {
    public static final zzfgy zza(ListenableFuture listenableFuture, Object obj, zzfgz zzfgzVar) {
        return new zzfgy(zzfgzVar, obj, null, zzfgz.zza, Collections.EMPTY_LIST, listenableFuture, null);
    }

    public static final zzfgy zzb(Callable callable, Object obj, zzfgz zzfgzVar) {
        return zzc(callable, zzfgzVar.zze(), obj, zzfgzVar);
    }

    public static final zzfgy zzc(Callable callable, zzgpd zzgpdVar, Object obj, zzfgz zzfgzVar) {
        return new zzfgy(zzfgzVar, obj, null, zzfgz.zza, Collections.EMPTY_LIST, zzgpdVar.submit(callable), null);
    }

    public static final zzfgy zzd(final zzfgn zzfgnVar, zzgpd zzgpdVar, Object obj, zzfgz zzfgzVar) {
        return zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfgr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() throws Exception {
                zzfgnVar.zza();
                return null;
            }
        }, zzgpdVar, obj, zzfgzVar);
    }
}
