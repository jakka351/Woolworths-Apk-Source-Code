package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* loaded from: classes5.dex */
final class zzghi extends zzgho {
    final /* synthetic */ zzggp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzghi(zzghq zzghqVar, CharSequence charSequence, zzggp zzggpVar) {
        super(zzghqVar, charSequence);
        this.zza = zzggpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgho
    public final int zzc(int i) {
        Matcher matcher = ((zzggu) this.zza).zza;
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgho
    public final int zzd(int i) {
        return ((zzggu) this.zza).zza.end();
    }
}
