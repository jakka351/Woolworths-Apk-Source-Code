package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
final class AtomicLongCounter implements LongCounter {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f23984a = new AtomicLong();

    @Override // io.grpc.internal.LongCounter
    public final void a() {
        this.f23984a.getAndAdd(1L);
    }
}
