package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public final class zzzz implements zzsq {
    public static zzsq zza(zzso zzsoVar) throws GeneralSecurityException {
        zzsq zzsqVarZza = zzsv.zza(zzsoVar);
        try {
            return new zzaac(zzsqVarZza, zzsx.zza(zzsoVar));
        } catch (GeneralSecurityException unused) {
            return zzsqVarZza;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsq
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        throw new NoSuchMethodError();
    }
}
