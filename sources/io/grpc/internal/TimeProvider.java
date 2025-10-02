package io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public interface TimeProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeProvider f24111a = new AnonymousClass1();

    /* renamed from: io.grpc.internal.TimeProvider$1, reason: invalid class name */
    public class AnonymousClass1 implements TimeProvider {
        @Override // io.grpc.internal.TimeProvider
        public final long a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    long a();
}
