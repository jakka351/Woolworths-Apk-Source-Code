package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class zzfxt {
    private MessageDigest zza;
    private final zzgea zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private SecureRandom zze;

    public zzfxt(zzgea zzgeaVar) {
        this.zzb = zzgeaVar;
    }

    public final void zza() {
        if (zzc()) {
            return;
        }
        zzb(new SecureRandom());
    }

    public final synchronized void zzb(SecureRandom secureRandom) {
        zzgdy zzgdyVarZza = this.zzb.zza(DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER);
        try {
            try {
                try {
                    zzgdyVarZza.zza();
                    this.zze = secureRandom;
                    this.zza = MessageDigest.getInstance("MD5");
                    this.zzd = true;
                } catch (NoSuchAlgorithmException e) {
                    zzgdyVarZza.zzb(e);
                }
                zzgdyVarZza.zzc();
            } catch (Throwable th) {
                zzgdyVarZza.zzb(th);
                throw th;
            }
        } catch (Throwable th2) {
            zzgdyVarZza.zzc();
            throw th2;
        }
    }

    public final synchronized boolean zzc() {
        return this.zzd;
    }

    public final byte[] zzd(byte[] bArr, String str, boolean z) throws UnsupportedEncodingException {
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        zzghc.zza(length <= i);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i + 1).put((byte) length);
        if (length < i) {
            int i2 = i - length;
            byte[] bArr2 = new byte[i2];
            this.zze.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i2);
            System.arraycopy(bArr2, 0, bArr, length, i2);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzfxw[] zzfxwVarArr = new zzfyj().zzcG;
        int length2 = zzfxwVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            zzfxwVarArr[i3].zza(bArrArray, bArr3);
        }
        if (!zzghs.zzc(str)) {
            new zzfxv(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8)).zza(bArr3);
        }
        return bArr3;
    }

    public final byte[] zze(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.zzc) {
            this.zza.reset();
            this.zza.update(bArr);
            bArrDigest = this.zza.digest();
        }
        return bArrDigest;
    }

    public final zzatj zzf(byte[] bArr, String str) throws UnsupportedEncodingException {
        zzatj zzatjVarZza = zzatk.zza();
        byte[] bArrZze = zze(bArr);
        zzhhb zzhhbVar = zzhhb.zzb;
        zzatjVarZza.zzb(zzhhb.zzr(bArrZze, 0, bArrZze.length));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= ((length - 1) / 255) + 1) {
                break;
            }
            int i2 = i * 255;
            int i3 = i2 + 255;
            if (length > i3) {
                length = i3;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i2, length));
            i++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzatjVarZza.zza(zzhhb.zzr(zzd((byte[]) it.next(), str, false), 0, 256));
        }
        return zzatjVarZza;
    }

    public final String zzg(int i, String str) throws UnsupportedEncodingException {
        zzarw zzarwVarZzi = zzast.zzi();
        zzarwVarZzi.zzl(i);
        return Base64.encodeToString(zzd(((zzast) zzarwVarZzi.zzbu()).zzaN(), str, true), 11);
    }
}
