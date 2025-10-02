package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Mac;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.spec.SecretKeySpec;

@Immutable
/* loaded from: classes6.dex */
public final class MacJce implements Mac {

    /* renamed from: a, reason: collision with root package name */
    public final javax.crypto.Mac f15158a;
    public final int b;
    public final String c;
    public final SecretKeySpec d;

    public MacJce(String str, SecretKeySpec secretKeySpec, int i) throws NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                if (i > 20) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
                break;
            case "HMACSHA256":
                if (i > 32) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
                break;
            case "HMACSHA512":
                if (i > 64) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        this.c = str;
        this.b = i;
        this.d = secretKeySpec;
        javax.crypto.Mac mac = (javax.crypto.Mac) EngineFactory.f.a(str);
        this.f15158a = mac;
        mac.init(secretKeySpec);
    }

    @Override // com.google.crypto.tink.Mac
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!Bytes.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // com.google.crypto.tink.Mac
    public final byte[] b(byte[] bArr) throws IllegalStateException, InvalidKeyException {
        javax.crypto.Mac mac;
        try {
            mac = (javax.crypto.Mac) this.f15158a.clone();
        } catch (CloneNotSupportedException unused) {
            mac = (javax.crypto.Mac) EngineFactory.f.a(this.c);
            mac.init(this.d);
        }
        mac.update(bArr);
        int i = this.b;
        byte[] bArr2 = new byte[i];
        System.arraycopy(mac.doFinal(), 0, bArr2, 0, i);
        return bArr2;
    }
}
