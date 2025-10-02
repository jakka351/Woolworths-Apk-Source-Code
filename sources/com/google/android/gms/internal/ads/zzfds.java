package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzfds {
    @VisibleForTesting
    public zzfds() {
        try {
            zzgqw.zza();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() throws GeneralSecurityException {
        byte[] byteArray;
        try {
            zzgqo zzgqoVarZzf = zzgqo.zzf(zzgqg.zzb(zzgyk.zza().zzc("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzgqa.zzb(zzgqoVarZzf, zzgpz.zzb(byteArrayOutputStream));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CryptoUtils.generateKey");
            byteArray = new byte[0];
        }
        return Base64.encodeToString(byteArray, 11);
    }

    @Nullable
    public static final String zzb(byte[] bArr, byte[] bArr2, @Nullable String str, zzdsg zzdsgVar) {
        zzgqo zzgqoVarZzc;
        if (str != null && (zzgqoVarZzc = zzc(str)) != null) {
            try {
                byte[] bArrZza = ((zzgpx) zzgqoVarZzc.zzg(zzgre.zza(), zzgpx.class)).zza(bArr, bArr2);
                zzdsgVar.zzc().put("ds", "1");
                return new String(bArrZza, "UTF-8");
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e.toString()));
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CryptoUtils.decrypt");
                zzdsgVar.zzc().put("dsf", e.toString());
            }
        }
        return null;
    }

    @Nullable
    private static final zzgqo zzc(String str) throws GeneralSecurityException {
        try {
            try {
                return zzgqa.zza(zzgpy.zzb(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
