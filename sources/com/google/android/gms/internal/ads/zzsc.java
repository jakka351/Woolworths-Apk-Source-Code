package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzsc extends Handler {
    final /* synthetic */ zzse zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzsc(zzse zzseVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(zzseVar);
        this.zza = zzseVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zza.zzh(message);
    }
}
