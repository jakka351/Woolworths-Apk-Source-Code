package com.google.common.util.concurrent;

import com.google.common.annotations.J2ktIncompatible;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

@J2ktIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class ForwardingCondition implements Condition {
    public abstract Condition a();

    @Override // java.util.concurrent.locks.Condition
    public final void await() throws InterruptedException {
        a().await();
    }

    @Override // java.util.concurrent.locks.Condition
    public final long awaitNanos(long j) {
        return a().awaitNanos(j);
    }

    @Override // java.util.concurrent.locks.Condition
    public final void awaitUninterruptibly() {
        a().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public final boolean awaitUntil(Date date) {
        return a().awaitUntil(date);
    }

    @Override // java.util.concurrent.locks.Condition
    public final void signal() {
        a().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public final void signalAll() {
        a().signalAll();
    }

    @Override // java.util.concurrent.locks.Condition
    public final boolean await(long j, TimeUnit timeUnit) {
        return a().await(j, timeUnit);
    }
}
