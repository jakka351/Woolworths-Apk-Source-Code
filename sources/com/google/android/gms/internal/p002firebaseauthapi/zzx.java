package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
final class zzx extends zzaa {
    private final /* synthetic */ zzm zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzx(zzt zztVar, CharSequence charSequence, zzm zzmVar) {
        super(zztVar, charSequence);
        this.zzb = zzmVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaa
    public final int zza(int i) {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaa
    public final int zzb(int i) {
        if (this.zzb.zza(i)) {
            return this.zzb.zzb();
        }
        return -1;
    }
}
