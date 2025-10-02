package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes5.dex */
public final class zzavc {
    private static Cipher zza;
    private static final Object zzb = new Object();
    private static final Object zzc = new Object();

    public zzavc(SecureRandom secureRandom) {
    }

    private static final Cipher zzc() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher;
        synchronized (zzc) {
            try {
                if (zza == null) {
                    zza = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    public final String zza(byte[] bArr, byte[] bArr2) throws zzavb {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzb) {
                zzc().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = zzc().doFinal(bArr2);
                iv = zzc().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return zzatn.zza(bArr3, false);
        } catch (InvalidKeyException e) {
            throw new zzavb(this, e);
        } catch (NoSuchAlgorithmException e2) {
            throw new zzavb(this, e2);
        } catch (BadPaddingException e3) {
            throw new zzavb(this, e3);
        } catch (IllegalBlockSizeException e4) {
            throw new zzavb(this, e4);
        } catch (NoSuchPaddingException e5) {
            throw new zzavb(this, e5);
        }
    }

    public final byte[] zzb(byte[] bArr, String str) throws zzavb {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrZzb = zzatn.zzb(str, false);
            int length2 = bArrZzb.length;
            if (length2 <= 16) {
                throw new zzavb(this);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrZzb);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzb) {
                zzc().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = zzc().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e) {
            throw new zzavb(this, e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new zzavb(this, e2);
        } catch (InvalidKeyException e3) {
            throw new zzavb(this, e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new zzavb(this, e4);
        } catch (BadPaddingException e5) {
            throw new zzavb(this, e5);
        } catch (IllegalBlockSizeException e6) {
            throw new zzavb(this, e6);
        } catch (NoSuchPaddingException e7) {
            throw new zzavb(this, e7);
        }
    }
}
