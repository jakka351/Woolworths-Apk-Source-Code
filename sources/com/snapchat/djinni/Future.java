package com.snapchat.djinni;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
public class Future<T> implements java.util.concurrent.Future<T> {

    @FunctionalInterface
    public interface FutureHandler<U> {
    }

    @FunctionalInterface
    public interface FutureHandlerWithReturn<U, R> {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            throw null;
        } catch (TimeoutException unused) {
            return null;
        }
    }
}
