package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzahm implements zzadz {
    public final int zza;
    public final long zzb;
    public final int zzc;

    public zzahm(int i, long j, int i2) {
        this.zza = i;
        this.zzb = j;
        this.zzc = i2;
    }

    public final String toString() {
        String strZzx = zzeo.zzx(this.zza);
        int length = strZzx.length();
        long j = this.zzb;
        int length2 = String.valueOf(j).length();
        int i = this.zzc;
        StringBuilder sb = new StringBuilder(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.a(length, 29, length2, 16, String.valueOf(i).length()) + 1);
        androidx.compose.ui.input.pointer.a.w(sb, "AtomSizeTooSmall{type=", strZzx, ", size=");
        sb.append(j);
        sb.append(", minHeaderSize=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
