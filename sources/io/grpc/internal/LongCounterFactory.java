package io.grpc.internal;

/* loaded from: classes7.dex */
final class LongCounterFactory {
    public static LongCounter a() {
        return ReflectionLongAdderCounter.e == null ? new ReflectionLongAdderCounter() : new AtomicLongCounter();
    }
}
