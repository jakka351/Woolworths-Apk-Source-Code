package io.jsonwebtoken.impl.crypto;

import YU.a;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.lang.Assert;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/* loaded from: classes7.dex */
public class RsaSignatureValidator extends RsaProvider implements SignatureValidator {
    private final RsaSigner SIGNER;

    public RsaSignatureValidator(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        boolean z = key instanceof RSAPrivateKey;
        Assert.isTrue(z || (key instanceof RSAPublicKey), "RSA Signature validation requires either a RSAPublicKey or RSAPrivateKey instance.");
        this.SIGNER = z ? new RsaSigner(signatureAlgorithm, key) : null;
    }

    public boolean doVerify(Signature signature, PublicKey publicKey, byte[] bArr, byte[] bArr2) throws SignatureException, InvalidKeyException {
        signature.initVerify(publicKey);
        signature.update(bArr);
        return signature.verify(bArr2);
    }

    @Override // io.jsonwebtoken.impl.crypto.SignatureValidator
    public boolean isValid(byte[] bArr, byte[] bArr2) {
        if (!(this.key instanceof PublicKey)) {
            Assert.notNull(this.SIGNER, "RSA Signer instance cannot be null.  This is a bug.  Please report it.");
            return MessageDigest.isEqual(this.SIGNER.sign(bArr), bArr2);
        }
        try {
            return doVerify(createSignatureInstance(), (PublicKey) this.key, bArr, bArr2);
        } catch (Exception e) {
            throw new io.jsonwebtoken.security.SignatureException(a.f(e, new StringBuilder("Unable to verify RSA signature using configured PublicKey. ")), e);
        }
    }
}
