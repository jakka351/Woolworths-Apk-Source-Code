package com.google.crypto.tink.signature;

import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.RegistryConfig;
import com.google.crypto.tink.proto.RsaSsaPssPublicKey;
import com.google.crypto.tink.signature.RsaSsaPssVerifyKeyManager;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class SignatureConfig {

    /* renamed from: a, reason: collision with root package name */
    public static final RegistryConfig f15125a;
    public static final RegistryConfig b;
    public static final RegistryConfig c;

    static {
        new EcdsaVerifyKeyManager();
        new EcdsaSignKeyManager();
        new Ed25519PublicKeyManager();
        new Ed25519PrivateKeyManager();
        new RsaSsaPkcs1SignKeyManager();
        new RsaSsaPkcs1VerifyKeyManager();
        f15125a = RegistryConfig.getDefaultInstance();
        b = RegistryConfig.getDefaultInstance();
        c = RegistryConfig.getDefaultInstance();
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        Registry.f(new EcdsaSignKeyManager(), new EcdsaVerifyKeyManager());
        Registry.f(new Ed25519PrivateKeyManager(), new Ed25519PublicKeyManager());
        Registry.f(new RsaSsaPkcs1SignKeyManager(), new RsaSsaPkcs1VerifyKeyManager());
        Registry.f(new RsaSsaPssSignKeyManager(), new RsaSsaPssVerifyKeyManager(RsaSsaPssPublicKey.class, new RsaSsaPssVerifyKeyManager.AnonymousClass1(PublicKeyVerify.class)));
        Registry.h(new PublicKeySignWrapper());
        Registry.h(new PublicKeyVerifyWrapper());
    }
}
