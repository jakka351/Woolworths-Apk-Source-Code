package io.grpc.internal;

import java.security.Provider;

/* loaded from: classes7.dex */
public final class ConscryptLoader {
    static {
        try {
            Class<?> cls = Class.forName("org.conscrypt.Conscrypt");
            cls.getMethod("newProvider", null);
            cls.getMethod("isConscrypt", Provider.class);
        } catch (ClassNotFoundException unused) {
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }
}
