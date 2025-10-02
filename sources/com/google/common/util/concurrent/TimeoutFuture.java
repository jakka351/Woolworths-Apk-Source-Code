package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.TimeoutException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
@J2ktIncompatible
/* loaded from: classes6.dex */
final class TimeoutFuture<V> extends FluentFuture.TrustedFuture<V> {

    public static final class Fire<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class TimeoutFutureException extends TimeoutException {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void c() {
        j(null);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String k() {
        return null;
    }
}
