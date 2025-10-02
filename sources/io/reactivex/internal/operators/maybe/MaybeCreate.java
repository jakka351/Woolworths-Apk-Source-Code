package io.reactivex.internal.operators.maybe;

import androidx.camera.camera2.interop.e;
import au.com.woolworths.feature.shop.delivery.address.a;
import au.com.woolworths.geolocation.location.LocationInteractor;
import io.reactivex.Maybe;
import io.reactivex.MaybeEmitter;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class MaybeCreate<T> extends Maybe<T> {
    public final a d;

    public static final class Emitter<T> extends AtomicReference<Disposable> implements MaybeEmitter<T>, Disposable {
        public final MaybeObserver d;

        public Emitter(MaybeObserver maybeObserver) {
            this.d = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.MaybeEmitter
        public final void onComplete() {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                this.d.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.MaybeEmitter
        public final void onSuccess(Object obj) {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            MaybeObserver maybeObserver = this.d;
            try {
                if (obj == null) {
                    maybeObserver.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    maybeObserver.onSuccess(obj);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th;
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return androidx.constraintlayout.core.state.a.i(Emitter.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public MaybeCreate(a aVar) {
        this.d = aVar;
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        Disposable andSet;
        Emitter emitter = new Emitter(maybeObserver);
        maybeObserver.d(emitter);
        try {
            LocationInteractor locationInteractor = (LocationInteractor) this.d.e;
            try {
                Intrinsics.e(locationInteractor.c.getLastLocation().addOnCompleteListener(new e(28, locationInteractor, emitter)));
            } catch (Exception unused) {
                emitter.onComplete();
            }
        } catch (Throwable th) {
            Exceptions.b(th);
            Disposable disposable = emitter.get();
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper || (andSet = emitter.getAndSet(disposableHelper)) == disposableHelper) {
                RxJavaPlugins.b(th);
                return;
            }
            try {
                emitter.d.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }
}
