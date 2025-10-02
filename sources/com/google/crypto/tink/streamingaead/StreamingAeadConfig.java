package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class StreamingAeadConfig {

    /* renamed from: a, reason: collision with root package name */
    public static final RegistryConfig f15128a;
    public static final RegistryConfig b;

    static {
        new AesCtrHmacStreamingKeyManager();
        new AesGcmHkdfStreamingKeyManager();
        f15128a = RegistryConfig.getDefaultInstance();
        b = RegistryConfig.getDefaultInstance();
        try {
            Registry.g(new AesCtrHmacStreamingKeyManager(), true);
            Registry.g(new AesGcmHkdfStreamingKeyManager(), true);
            Registry.h(new StreamingAeadWrapper());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
