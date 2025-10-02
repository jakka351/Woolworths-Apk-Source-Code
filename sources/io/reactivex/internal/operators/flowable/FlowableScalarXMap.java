package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes7.dex */
public final class FlowableScalarXMap {

    public static final class ScalarXMapFlowable<T, R> extends Flowable<R> {
        @Override // io.reactivex.Flowable
        public final void c(FlowableSubscriber flowableSubscriber) {
            try {
                throw null;
            } catch (Throwable th) {
                EmptySubscription.b(th, flowableSubscriber);
            }
        }
    }

    public static boolean a(Publisher publisher, Subscriber subscriber) {
        if (!(publisher instanceof Callable)) {
            return false;
        }
        try {
            if (((Callable) publisher).call() == null) {
                EmptySubscription.a(subscriber);
                return true;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                EmptySubscription.b(th, subscriber);
                return true;
            }
        } catch (Throwable th2) {
            Exceptions.b(th2);
            EmptySubscription.b(th2, subscriber);
            return true;
        }
    }
}
