package com.google.crypto.tink.daead;

import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class DeterministicAeadConfig {

    /* renamed from: a, reason: collision with root package name */
    public static final RegistryConfig f14993a;
    public static final RegistryConfig b;

    static {
        new AesSivKeyManager();
        f14993a = RegistryConfig.getDefaultInstance();
        b = RegistryConfig.getDefaultInstance();
        try {
            Registry.g(new AesSivKeyManager(), true);
            Registry.h(new DeterministicAeadWrapper());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
