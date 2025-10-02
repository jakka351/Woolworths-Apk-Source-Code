package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzcc {
    public static final zzcc zza = new zzcc(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzcc(int i, int i2, int i3) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = zzeo.zzA(i3) ? zzeo.zzE(i3) * i2 : -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcc)) {
            return false;
        }
        zzcc zzccVar = (zzcc) obj;
        return this.zzb == zzccVar.zzb && this.zzc == zzccVar.zzc && this.zzd == zzccVar.zzd;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i2 = this.zzc;
        int length2 = String.valueOf(i2).length();
        int i3 = this.zzd;
        StringBuilder sb = new StringBuilder(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.a(length, 38, length2, 11, String.valueOf(i3).length()) + 1);
        androidx.constraintlayout.core.state.a.t(i, i2, "AudioFormat[sampleRate=", ", channelCount=", sb);
        return androidx.constraintlayout.core.state.a.k(sb, ", encoding=", i3, "]");
    }
}
