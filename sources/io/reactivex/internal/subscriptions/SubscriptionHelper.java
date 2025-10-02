package io.reactivex.internal.subscriptions;

import androidx.camera.core.impl.b;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class SubscriptionHelper implements Subscription {
    public static final SubscriptionHelper d;
    public static final /* synthetic */ SubscriptionHelper[] e;

    static {
        SubscriptionHelper subscriptionHelper = new SubscriptionHelper("CANCELLED", 0);
        d = subscriptionHelper;
        e = new SubscriptionHelper[]{subscriptionHelper};
    }

    public static boolean a(AtomicReference atomicReference) {
        Subscription subscription;
        Subscription subscription2 = (Subscription) atomicReference.get();
        SubscriptionHelper subscriptionHelper = d;
        if (subscription2 == subscriptionHelper || (subscription = (Subscription) atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (subscription == null) {
            return true;
        }
        subscription.cancel();
        return true;
    }

    public static void b(AtomicReference atomicReference, AtomicLong atomicLong, long j) {
        Subscription subscription = (Subscription) atomicReference.get();
        if (subscription != null) {
            subscription.request(j);
            return;
        }
        if (f(j)) {
            BackpressureHelper.a(atomicLong, j);
            Subscription subscription2 = (Subscription) atomicReference.get();
            if (subscription2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    subscription2.request(andSet);
                }
            }
        }
    }

    public static void c(AtomicReference atomicReference, AtomicLong atomicLong, Subscription subscription) {
        if (e(atomicReference, subscription)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                subscription.request(andSet);
            }
        }
    }

    public static void d(AtomicReference atomicReference, Subscription subscription, long j) {
        if (e(atomicReference, subscription)) {
            subscription.request(j);
        }
    }

    public static boolean e(AtomicReference atomicReference, Subscription subscription) {
        ObjectHelper.b(subscription, "s is null");
        while (!atomicReference.compareAndSet(null, subscription)) {
            if (atomicReference.get() != null) {
                subscription.cancel();
                if (atomicReference.get() == d) {
                    return false;
                }
                RxJavaPlugins.b(new ProtocolViolationException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean f(long j) {
        if (j > 0) {
            return true;
        }
        RxJavaPlugins.b(new IllegalArgumentException(b.k(j, "n > 0 required but it was ")));
        return false;
    }

    public static boolean l(Subscription subscription, Subscription subscription2) {
        if (subscription2 == null) {
            RxJavaPlugins.b(new NullPointerException("next is null"));
            return false;
        }
        if (subscription == null) {
            return true;
        }
        subscription2.cancel();
        RxJavaPlugins.b(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static SubscriptionHelper valueOf(String str) {
        return (SubscriptionHelper) Enum.valueOf(SubscriptionHelper.class, str);
    }

    public static SubscriptionHelper[] values() {
        return (SubscriptionHelper[]) e.clone();
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
    }
}
