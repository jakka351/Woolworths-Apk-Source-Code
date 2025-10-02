package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@SuppressLint
/* loaded from: classes.dex */
class DelegatingScheduledFuture<V> extends AbstractResolvableFuture<V> implements ScheduledFuture<V> {
    public static final /* synthetic */ int l = 0;
    public final ScheduledFuture k;

    /* renamed from: com.google.firebase.concurrent.DelegatingScheduledFuture$1, reason: invalid class name */
    class AnonymousClass1 implements Completer<Object> {
        public AnonymousClass1() {
        }

        public final void a(Object obj) {
            int i = DelegatingScheduledFuture.l;
            DelegatingScheduledFuture.this.n(obj);
        }

        public final void b(Exception exc) {
            int i = DelegatingScheduledFuture.l;
            DelegatingScheduledFuture.this.o(exc);
        }
    }

    public interface Completer<T> {
    }

    public interface Resolver<T> {
        ScheduledFuture a(AnonymousClass1 anonymousClass1);
    }

    public DelegatingScheduledFuture(Resolver resolver) {
        this.k = resolver.a(new AnonymousClass1());
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public final void b() {
        this.k.cancel(p());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.k.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.k.getDelay(timeUnit);
    }
}
