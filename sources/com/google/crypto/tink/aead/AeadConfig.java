package com.google.crypto.tink.aead;

import com.google.crypto.tink.Registry;
import com.google.crypto.tink.mac.MacConfig;
import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class AeadConfig {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14987a;
    public static final String b;

    static {
        new AesCtrHmacAeadKeyManager();
        f14987a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new AesGcmKeyManager();
        b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new AesEaxKeyManager();
        new KmsAeadKeyManager();
        new KmsEnvelopeAeadKeyManager();
        new ChaCha20Poly1305KeyManager();
        new XChaCha20Poly1305KeyManager();
        RegistryConfig.getDefaultInstance();
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        MacConfig.a();
        Registry.g(new AesCtrHmacAeadKeyManager(), true);
        Registry.g(new AesEaxKeyManager(), true);
        Registry.g(new AesGcmKeyManager(), true);
        Registry.g(new ChaCha20Poly1305KeyManager(), true);
        Registry.g(new KmsAeadKeyManager(), true);
        Registry.g(new KmsEnvelopeAeadKeyManager(), true);
        Registry.g(new XChaCha20Poly1305KeyManager(), true);
        Registry.h(new AeadWrapper());
    }
}
