package io.reactivex.internal.util;

import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class EmptyComponent implements FlowableSubscriber<Object>, Observer<Object>, MaybeObserver<Object>, SingleObserver<Object>, CompletableObserver, Subscription, Disposable {
    public static final EmptyComponent d;
    public static final /* synthetic */ EmptyComponent[] e;

    static {
        EmptyComponent emptyComponent = new EmptyComponent("INSTANCE", 0);
        d = emptyComponent;
        e = new EmptyComponent[]{emptyComponent};
    }

    public static EmptyComponent valueOf(String str) {
        return (EmptyComponent) Enum.valueOf(EmptyComponent.class, str);
    }

    public static EmptyComponent[] values() {
        return (EmptyComponent[]) e.clone();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return true;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        disposable.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        subscription.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        RxJavaPlugins.b(th);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
    }

    @Override // io.reactivex.MaybeObserver
    public final void onSuccess(Object obj) {
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
    }
}
