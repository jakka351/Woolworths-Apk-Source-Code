package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzpy extends Exception {
    public final int zza;
    public final boolean zzb;

    public zzpy(int i, int i2, int i3, int i4, int i5, zzu zzuVar, boolean z, @Nullable Exception exc) {
        String strValueOf = String.valueOf(zzuVar);
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i2).length();
        int length3 = String.valueOf(i3).length();
        int length4 = String.valueOf(i4).length();
        int length5 = String.valueOf(i5).length();
        int length6 = strValueOf.length();
        int i6 = length + 31 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2;
        String str = true != z ? "" : " (recoverable)";
        StringBuilder sb = new StringBuilder(str.length() + i6 + length6);
        androidx.constraintlayout.core.state.a.t(i, i2, "AudioTrack init failed ", " Config(", sb);
        androidx.constraintlayout.core.state.a.t(i3, i4, ", ", ", ", sb);
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.t(i5, ", ", ") ", strValueOf, sb);
        sb.append(str);
        super(sb.toString(), exc);
        this.zza = i;
        this.zzb = z;
    }
}
