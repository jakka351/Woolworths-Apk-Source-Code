package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
final class zzx extends zzy {
    private final Callable zze;

    public /* synthetic */ zzx(Callable callable, byte[] bArr) {
        super(false, 1, 5, null, null, -1L, null);
        this.zze = callable;
    }

    @Override // com.google.android.gms.common.zzy
    public final String zza() {
        try {
            return (String) this.zze.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
