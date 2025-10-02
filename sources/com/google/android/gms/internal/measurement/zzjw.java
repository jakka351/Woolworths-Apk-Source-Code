package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzjw extends ContentObserver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjw(zzjy zzjyVar, Handler handler) {
        super(null);
        Objects.requireNonNull(zzjyVar);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        zzkm.zzc();
    }
}
