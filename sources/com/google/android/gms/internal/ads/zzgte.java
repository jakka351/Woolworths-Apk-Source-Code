package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zzgte implements zzgpx {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final Set zze;
    private final String zzc;
    private final zzgpx zzd;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zze = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public zzgte(zzhdw zzhdwVar, zzgpx zzgpxVar) throws GeneralSecurityException {
        if (!zze.contains(zzhdwVar.zza())) {
            String strZza = zzhdwVar.zza();
            throw new IllegalArgumentException(YU.a.p(new StringBuilder(String.valueOf(strZza).length() + 67), "Unsupported DEK key type: ", strZza, ". Only Tink AEAD key types are supported."));
        }
        this.zzc = zzhdwVar.zza();
        zzhdv zzhdvVarZzg = zzhdw.zzg(zzhdwVar);
        zzhdvVarZzg.zzc(zzhep.RAW);
        zzgqu.zzb(((zzhdw) zzhdvVarZzg.zzbu()).zzaN());
        this.zzd = zzgpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > 4096 || i > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrZza = this.zzd.zza(bArr3, zzb);
            String str = this.zzc;
            zzhhb zzhhbVar = zzhhb.zzb;
            return ((zzgpx) zzgyl.zza().zzd(zzgyo.zza().zzg(zzgzj.zza(str, zzhhb.zzr(bArrZza, 0, bArrZza.length), zzhds.SYMMETRIC, zzhep.RAW, null), zzgqc.zza()), zzgpx.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
