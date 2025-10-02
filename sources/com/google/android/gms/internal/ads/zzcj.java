package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzcj extends zzcg {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // com.google.android.gms.internal.ads.zzcf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcj.zzd(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcc zzm(zzcc zzccVar) throws zzce {
        int i = zzccVar.zzd;
        if (i != 3) {
            if (i == 2) {
                return zzcc.zza;
            }
            if (i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
                throw new zzce("Unhandled input format:", zzccVar);
            }
        }
        return new zzcc(zzccVar.zzb, zzccVar.zzc, 2);
    }
}
