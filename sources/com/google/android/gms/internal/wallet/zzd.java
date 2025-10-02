package com.google.android.gms.internal.wallet;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes5.dex */
public final class zzd extends Handler {
    private final Looper zza;

    public zzd() {
        this.zza = Looper.getMainLooper();
    }

    public zzd(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }
}
