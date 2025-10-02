package androidx.camera.core.impl;

import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ConstantObservable<T> implements Observable<T> {
    public static final ConstantObservable b = new ConstantObservable(null);

    /* renamed from: a, reason: collision with root package name */
    public final ListenableFuture f484a;

    public ConstantObservable(Object obj) {
        this.f484a = Futures.g(obj);
    }

    @Override // androidx.camera.core.impl.Observable
    public final ListenableFuture b() {
        return this.f484a;
    }

    @Override // androidx.camera.core.impl.Observable
    public final void c(Executor executor, Observable.Observer observer) {
        this.f484a.addListener(new f(2, this, observer), executor);
    }

    @Override // androidx.camera.core.impl.Observable
    public final void d(Observable.Observer observer) {
    }
}
