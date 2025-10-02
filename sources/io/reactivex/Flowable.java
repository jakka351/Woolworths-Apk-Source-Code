package io.reactivex;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.StrictSubscriber;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes.dex */
public abstract class Flowable<T> implements Publisher<T> {
    public static final int d = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public final void a(FlowableSubscriber flowableSubscriber) {
        ObjectHelper.b(flowableSubscriber, "s is null");
        try {
            c(flowableSubscriber);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.b(th);
            RxJavaPlugins.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void c(FlowableSubscriber flowableSubscriber);

    @Override // org.reactivestreams.Publisher
    public final void e(Subscriber subscriber) {
        if (subscriber instanceof FlowableSubscriber) {
            a((FlowableSubscriber) subscriber);
        } else {
            ObjectHelper.b(subscriber, "s is null");
            a(new StrictSubscriber(subscriber));
        }
    }
}
