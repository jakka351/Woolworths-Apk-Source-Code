package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes5.dex */
final class zzgny extends zzgnw {
    private zzgny() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnw
    public final void zza(zzgnz zzgnzVar, Set set, Set set2) {
        synchronized (zzgnzVar) {
            try {
                if (zzgnzVar.seenExceptionsField == null) {
                    zzgnzVar.seenExceptionsField = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnw
    public final int zzb(zzgnz zzgnzVar) {
        int i;
        synchronized (zzgnzVar) {
            i = zzgnzVar.remainingField - 1;
            zzgnzVar.remainingField = i;
        }
        return i;
    }

    public /* synthetic */ zzgny(byte[] bArr) {
        super(null);
    }
}
