package io.reactivex.internal.util;

import YU.a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class EndConsumerHelper {
    public static void a(Class cls) {
        String name = cls.getName();
        RxJavaPlugins.b(new ProtocolViolationException(a.j("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
    }

    public static void b(AtomicReference atomicReference, Disposable disposable, Class cls) {
        ObjectHelper.b(disposable, "next is null");
        while (!atomicReference.compareAndSet(null, disposable)) {
            if (atomicReference.get() != null) {
                disposable.dispose();
                if (atomicReference.get() != DisposableHelper.d) {
                    a(cls);
                    return;
                }
                return;
            }
        }
    }

    public static boolean c(AtomicReference atomicReference, Subscription subscription, Class cls) {
        ObjectHelper.b(subscription, "next is null");
        while (!atomicReference.compareAndSet(null, subscription)) {
            if (atomicReference.get() != null) {
                subscription.cancel();
                if (atomicReference.get() == SubscriptionHelper.d) {
                    return false;
                }
                a(cls);
                return false;
            }
        }
        return true;
    }
}
