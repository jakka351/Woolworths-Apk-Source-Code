package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes5.dex */
final class zzdd<T> extends zzcy<T> {
    private final T zza;

    public zzdd(T t) {
        this.zza = t;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof zzdd) {
            return this.zza.equals(((zzdd) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.vision.zzcy
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzcy
    public final T zzb() {
        return this.zza;
    }
}
