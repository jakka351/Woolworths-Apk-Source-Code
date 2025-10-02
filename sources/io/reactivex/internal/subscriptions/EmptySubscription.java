package io.reactivex.internal.subscriptions;

import io.reactivex.internal.fuseable.QueueSubscription;
import org.reactivestreams.Subscriber;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class EmptySubscription implements QueueSubscription<Object> {
    public static final EmptySubscription d;
    public static final /* synthetic */ EmptySubscription[] e;

    static {
        EmptySubscription emptySubscription = new EmptySubscription("INSTANCE", 0);
        d = emptySubscription;
        e = new EmptySubscription[]{emptySubscription};
    }

    public static void a(Subscriber subscriber) {
        subscriber.m(d);
        subscriber.onComplete();
    }

    public static void b(Throwable th, Subscriber subscriber) {
        subscriber.m(d);
        subscriber.onError(th);
    }

    public static EmptySubscription valueOf(String str) {
        return (EmptySubscription) Enum.valueOf(EmptySubscription.class, str);
    }

    public static EmptySubscription[] values() {
        return (EmptySubscription[]) e.clone();
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int l(int i) {
        return 2;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        return null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        SubscriptionHelper.f(j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }
}
