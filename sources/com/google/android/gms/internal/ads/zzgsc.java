package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzgsc extends zzgrg {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzgsb zzd;

    public /* synthetic */ zzgsc(int i, int i2, int i3, zzgsb zzgsbVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzd = zzgsbVar;
    }

    public static zzgsa zzb() {
        return new zzgsa(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgsc)) {
            return false;
        }
        zzgsc zzgscVar = (zzgsc) obj;
        return zzgscVar.zza == this.zza && zzgscVar.zzb == this.zzb && zzgscVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgsc.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int i = this.zzb;
        int length2 = String.valueOf(i).length();
        int length3 = String.valueOf(16).length();
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(YU.a.b(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.a(length, 30, length2, 10, length3), 15, String.valueOf(i2).length(), 10));
        sb.append("AesEax Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        return androidx.constraintlayout.core.state.a.k(sb, "-byte IV, 16-byte tag, and ", i2, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zzd != zzgsb.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final zzgsb zze() {
        return this.zzd;
    }
}
