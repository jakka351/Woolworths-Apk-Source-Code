package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzjo extends ContentObserver {
    final /* synthetic */ zzjr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjo(zzjr zzjrVar, Handler handler) {
        super(null);
        Objects.requireNonNull(zzjrVar);
        this.zza = zzjrVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zzc();
    }
}
