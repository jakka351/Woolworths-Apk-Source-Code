package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes5.dex */
final class zzdk<T> implements zzdf<T> {
    private volatile zzdf<T> zza;
    private volatile boolean zzb;

    @NullableDecl
    private T zzc;

    public zzdk(zzdf<T> zzdfVar) {
        this.zza = (zzdf) zzde.zza(zzdfVar);
    }

    public final String toString() {
        Object string = this.zza;
        if (string == null) {
            String strValueOf = String.valueOf(this.zzc);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.vision.zzdf
    public final T zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        T tZza = this.zza.zza();
                        this.zzc = tZza;
                        this.zzb = true;
                        this.zza = null;
                        return tZza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
