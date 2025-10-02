package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public final class zzln {
    private static final byte[] zza = new byte[0];

    public static zzlr zza(zzkb zzkbVar) throws GeneralSecurityException {
        zzcb zzcbVarZzb = zzkbVar.zzb();
        if (zzcbVarZzb instanceof zzdx) {
            return new zzlp((zzdx) zzcbVarZzb);
        }
        if (zzcbVarZzb instanceof zzdi) {
            return new zzlm((zzdi) zzcbVarZzb);
        }
        if (zzcbVarZzb instanceof zzjf) {
            return new zzlo((zzjf) zzcbVarZzb);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: ".concat(String.valueOf(zzcbVarZzb)));
    }
}
