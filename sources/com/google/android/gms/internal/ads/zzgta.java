package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzgta extends zzgrg {
    private final zzgsz zza;

    private zzgta(zzgsz zzgszVar) {
        this.zza = zzgszVar;
    }

    public static zzgta zzb(zzgsz zzgszVar) {
        return new zzgta(zzgszVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgta) && ((zzgta) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzgta.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        return YU.a.p(new StringBuilder(string.length() + 39), "ChaCha20Poly1305 Parameters (variant: ", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zza != zzgsz.zzc;
    }

    public final zzgsz zzc() {
        return this.zza;
    }
}
