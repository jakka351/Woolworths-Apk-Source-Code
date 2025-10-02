package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzghj extends zzgho {
    public zzghj(zzghq zzghqVar, CharSequence charSequence, int i) {
        super(zzghqVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzgho
    public final int zzc(int i) {
        int i2 = i + 4000;
        if (i2 < ((zzgho) this).zzb.length()) {
            return i2;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgho
    public final int zzd(int i) {
        return i;
    }
}
