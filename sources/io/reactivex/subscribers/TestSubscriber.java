package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.observers.BaseTestConsumer;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public class TestSubscriber<T> extends BaseTestConsumer<T, TestSubscriber<T>> implements FlowableSubscriber<T>, Subscription, Disposable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EmptySubscriber implements FlowableSubscriber<Object> {
        public static final /* synthetic */ EmptySubscriber[] d = {new EmptySubscriber("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        EmptySubscriber EF5;

        public static EmptySubscriber valueOf(String str) {
            return (EmptySubscriber) Enum.valueOf(EmptySubscriber.class, str);
        }

        public static EmptySubscriber[] values() {
            return (EmptySubscriber[]) d.clone();
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return true;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        Thread.currentThread();
        subscription.getClass();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw null;
     */
    @Override // org.reactivestreams.Subscriber
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onComplete() {
        /*
            r1 = this;
            r0 = 0
            java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L5
            throw r0     // Catch: java.lang.Throwable -> L5
        L5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.subscribers.TestSubscriber.onComplete():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw null;
     */
    @Override // org.reactivestreams.Subscriber
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onError(java.lang.Throwable r1) {
        /*
            r0 = this;
            r1 = 0
            java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L5
            throw r1     // Catch: java.lang.Throwable -> L5
        L5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.subscribers.TestSubscriber.onError(java.lang.Throwable):void");
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        Thread.currentThread();
        throw null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        SubscriptionHelper.b(null, null, j);
        throw null;
    }
}
