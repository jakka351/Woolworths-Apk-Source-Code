package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes5.dex */
final class zzoy {
    public static final zzoy zza;
    public final int zzb;
    public final int zzc;

    @Nullable
    private final zzgke zzd;

    static {
        zzoy zzoyVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzgkd zzgkdVar = new zzgkd();
            for (int i = 1; i <= 10; i++) {
                zzgkdVar.zzf(Integer.valueOf(zzeo.zzB(i)));
            }
            zzoyVar = new zzoy(2, zzgkdVar.zzi());
        } else {
            zzoyVar = new zzoy(2, 10);
        }
        zza = zzoyVar;
    }

    public zzoy(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzoy)) {
            return false;
        }
        zzoy zzoyVar = (zzoy) obj;
        return this.zzb == zzoyVar.zzb && this.zzc == zzoyVar.zzc && Objects.equals(this.zzd, zzoyVar.zzd);
    }

    public final int hashCode() {
        zzgke zzgkeVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgkeVar == null ? 0 : zzgkeVar.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.a(length, 38, String.valueOf(i2).length(), 15, strValueOf.length()) + 1);
        androidx.constraintlayout.core.state.a.t(i, i2, "AudioProfile[format=", ", maxChannelCount=", sb);
        return YU.a.p(sb, ", channelMasks=", strValueOf, "]");
    }

    public final boolean zza(int i) {
        zzgke zzgkeVar = this.zzd;
        if (zzgkeVar == null) {
            return i <= this.zzc;
        }
        int iZzB = zzeo.zzB(i);
        if (iZzB == 0) {
            return false;
        }
        return zzgkeVar.contains(Integer.valueOf(iZzB));
    }

    public final int zzb(int i, zzc zzcVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) zzoz.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i2 = this.zzb;
        for (int i3 = 10; i3 > 0; i3--) {
            int iZzB = zzeo.zzB(i3);
            if (iZzB != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i).setChannelMask(iZzB).build(), zzcVar.zza())) {
                return i3;
            }
        }
        return 0;
    }

    @RequiresApi
    public zzoy(int i, Set set) {
        this.zzb = i;
        zzgke zzgkeVarZzo = zzgke.zzo(set);
        this.zzd = zzgkeVarZzo;
        zzgmd it = zzgkeVarZzo.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }
}
