package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public final class zzcj {
    public static zzcb zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzxb zzxbVarZza = zzxb.zza(bArr, zzaku.zza());
            zzoz zzozVarZza = zzoz.zza();
            zzqe zzqeVarZza = zzqe.zza(zzxbVarZza);
            return !zzozVarZza.zzc(zzqeVarZza) ? new zzoi(zzqeVarZza) : zzozVarZza.zza((zzoz) zzqeVarZza);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] zza(zzcb zzcbVar) throws GeneralSecurityException {
        if (zzcbVar instanceof zzoi) {
            return ((zzoi) zzcbVar).zzb().zza().zzk();
        }
        return ((zzqe) zzoz.zza().zza((zzoz) zzcbVar, zzqe.class)).zza().zzk();
    }
}
