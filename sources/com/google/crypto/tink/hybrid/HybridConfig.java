package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.Registry;
import com.google.crypto.tink.aead.AeadConfig;
import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class HybridConfig {

    /* renamed from: a, reason: collision with root package name */
    public static final RegistryConfig f14997a;
    public static final RegistryConfig b;
    public static final RegistryConfig c;

    static {
        new EciesAeadHkdfPublicKeyManager();
        new EciesAeadHkdfPrivateKeyManager();
        f14997a = RegistryConfig.getDefaultInstance();
        b = RegistryConfig.getDefaultInstance();
        c = RegistryConfig.getDefaultInstance();
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        AeadConfig.a();
        Registry.f(new EciesAeadHkdfPrivateKeyManager(), new EciesAeadHkdfPublicKeyManager());
        Registry.h(new HybridDecryptWrapper());
        Registry.h(new HybridEncryptWrapper());
    }
}
