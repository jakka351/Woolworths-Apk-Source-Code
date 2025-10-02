package io.jsonwebtoken.impl.lang;

import io.jsonwebtoken.lang.UnknownClassException;

@Deprecated
/* loaded from: classes7.dex */
public final class LegacyServices {
    public static <T> T loadFirst(Class<T> cls) {
        try {
            return (T) Services.loadFirst(cls);
        } catch (UnavailableImplementationException e) {
            throw new UnknownClassException(e.getMessage(), e);
        }
    }
}
