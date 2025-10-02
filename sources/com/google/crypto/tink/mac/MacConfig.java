package com.google.crypto.tink.mac;

import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class MacConfig {
    static {
        new HmacKeyManager();
        RegistryConfig.getDefaultInstance();
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        Registry.g(new HmacKeyManager(), true);
        Registry.g(new AesCmacKeyManager(), true);
        Registry.h(new MacWrapper());
    }
}
