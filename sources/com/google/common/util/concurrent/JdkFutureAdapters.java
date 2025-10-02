package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes6.dex */
public final class JdkFutureAdapters {

    public static class ListenableFutureAdapter<V> extends ForwardingFuture<V> implements ListenableFuture<V> {
        public static final ExecutorService d;

        static {
            ThreadFactoryBuilder threadFactoryBuilder = new ThreadFactoryBuilder();
            threadFactoryBuilder.b = Boolean.TRUE;
            Locale locale = Locale.ROOT;
            threadFactoryBuilder.f14967a = "ListenableFutureAdapter-thread-%d";
            d = Executors.newCachedThreadPool(threadFactoryBuilder.a());
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ Object P1() {
            return null;
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture
        /* renamed from: R1 */
        public final Future P1() {
            return null;
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public final void addListener(Runnable runnable, Executor executor) {
            throw null;
        }
    }
}
