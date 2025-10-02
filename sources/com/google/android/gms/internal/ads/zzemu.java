package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
final /* synthetic */ class zzemu implements zzgob {
    static final /* synthetic */ zzemu zza = new zzemu();

    private /* synthetic */ zzemu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        return ((Throwable) obj) instanceof TimeoutException ? zzgot.zza(new zzemx(Integer.toString(17))) : zzgot.zza(new zzemx(null));
    }
}
