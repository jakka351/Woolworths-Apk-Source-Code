package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class zzdg extends zzdk {
    private final Object zza;
    private boolean zzb;

    public zzdg(Object obj) {
        this.zza = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzb;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zzb) {
            throw new NoSuchElementException();
        }
        this.zzb = true;
        return this.zza;
    }
}
