package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
final class zzmx implements zzmt {
    private zzmx() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmt
    public final zzms zza() throws GeneralSecurityException {
        byte[] bArrZza = zzaah.zza();
        return new zzms(bArrZza, zzaah.zza(bArrZza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmt
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzaah.zza(bArr, bArr2);
    }
}
