package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public final class zzhga implements zzhbw {
    public static zzhbw zzb(zzhbu zzhbuVar) throws GeneralSecurityException {
        zzhbw zzhbwVarZzb = zzhca.zzb(zzhbuVar);
        try {
            return new zzhfz(zzhbwVarZzb, zzhcb.zzb(zzhbuVar), null);
        } catch (GeneralSecurityException unused) {
            return zzhbwVarZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbw
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        throw null;
    }
}
