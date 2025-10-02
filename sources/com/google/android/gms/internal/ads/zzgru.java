package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzgru extends zzgrg {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzgrt zze;
    private final zzgrs zzf;

    public /* synthetic */ zzgru(int i, int i2, int i3, int i4, zzgrt zzgrtVar, zzgrs zzgrsVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = zzgrtVar;
        this.zzf = zzgrsVar;
    }

    public static zzgrr zzb() {
        return new zzgrr(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgru)) {
            return false;
        }
        zzgru zzgruVar = (zzgru) obj;
        return zzgruVar.zza == this.zza && zzgruVar.zzb == this.zzb && zzgruVar.zzc == this.zzc && zzgruVar.zzd == this.zzd && zzgruVar.zze == this.zze && zzgruVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzgru.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        zzgrs zzgrsVar = this.zzf;
        String strValueOf = String.valueOf(this.zze);
        String strValueOf2 = String.valueOf(zzgrsVar);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i = this.zzc;
        int length3 = String.valueOf(i).length();
        int i2 = this.zzd;
        int length4 = String.valueOf(i2).length();
        int i3 = this.zza;
        int length5 = String.valueOf(i3).length();
        int i4 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i4).length() + 15);
        androidx.constraintlayout.core.state.a.B(sb, "AesCtrHmacAead Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        androidx.constraintlayout.core.state.a.t(i, i2, ", ", "-byte IV, and ", sb);
        androidx.constraintlayout.core.state.a.t(i3, i4, "-byte tags, and ", "-byte AES key, and ", sb);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zze != zzgrt.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zzc;
    }

    public final zzgrt zzg() {
        return this.zze;
    }

    public final zzgrs zzh() {
        return this.zzf;
    }
}
