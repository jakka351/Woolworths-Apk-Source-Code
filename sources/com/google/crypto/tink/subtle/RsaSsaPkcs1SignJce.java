package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.subtle.Enums;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* loaded from: classes6.dex */
public final class RsaSsaPkcs1SignJce implements PublicKeySign {

    /* renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f15160a;
    public final RSAPublicKey b;
    public final String c;

    public RsaSsaPkcs1SignJce(RSAPrivateCrtKey rSAPrivateCrtKey, Enums.HashType hashType) throws GeneralSecurityException {
        Validators.d(hashType);
        Validators.c(rSAPrivateCrtKey.getModulus().bitLength());
        this.f15160a = rSAPrivateCrtKey;
        Validators.d(hashType);
        this.c = hashType + "withRSA";
        this.b = (RSAPublicKey) ((KeyFactory) EngineFactory.j.a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
    }

    public final byte[] a(byte[] bArr) throws SignatureException, InvalidKeyException {
        EngineFactory engineFactory = EngineFactory.g;
        String str = this.c;
        Signature signature = (Signature) engineFactory.a(str);
        signature.initSign(this.f15160a);
        signature.update(bArr);
        byte[] bArrSign = signature.sign();
        Signature signature2 = (Signature) engineFactory.a(str);
        signature2.initVerify(this.b);
        signature2.update(bArr);
        if (signature2.verify(bArrSign)) {
            return bArrSign;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }
}
