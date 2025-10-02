package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes6.dex */
public final class ThreadFactoryBuilder {

    /* renamed from: a, reason: collision with root package name */
    public String f14967a = null;
    public Boolean b = null;

    public final ThreadFactory a() {
        final String str = this.f14967a;
        final Boolean bool = this.b;
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        final AtomicLong atomicLong = str != null ? new AtomicLong(0L) : null;
        return new ThreadFactory() { // from class: com.google.common.util.concurrent.ThreadFactoryBuilder.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadNewThread = threadFactoryDefaultThreadFactory.newThread(runnable);
                Objects.requireNonNull(threadNewThread);
                String str2 = str;
                if (str2 != null) {
                    AtomicLong atomicLong2 = atomicLong;
                    Objects.requireNonNull(atomicLong2);
                    threadNewThread.setName(String.format(Locale.ROOT, str2, Long.valueOf(atomicLong2.getAndIncrement())));
                }
                Boolean bool2 = bool;
                if (bool2 != null) {
                    threadNewThread.setDaemon(bool2.booleanValue());
                }
                return threadNewThread;
            }
        };
    }
}
