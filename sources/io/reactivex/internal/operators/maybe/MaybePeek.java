package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class MaybePeek<T> extends AbstractMaybeWithUpstream<T, T> {
    public final Consumer e;
    public final Consumer f;
    public final Consumer g;
    public final Action h;
    public final Action i;
    public final Action j;

    public static final class MaybePeekObserver<T> implements MaybeObserver<T>, Disposable {
        public final MaybeObserver d;
        public final MaybePeek e;
        public Disposable f;

        public MaybePeekObserver(MaybeObserver maybeObserver, MaybePeek maybePeek) {
            this.d = maybeObserver;
            this.e = maybePeek;
        }

        public final void a() {
            try {
                this.e.i.run();
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.b(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f.b();
        }

        public final void c(Throwable th) {
            try {
                this.e.g.accept(th);
            } catch (Throwable th2) {
                Exceptions.b(th2);
                th = new CompositeException(th, th2);
            }
            this.f = DisposableHelper.d;
            this.d.onError(th);
            a();
        }

        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            MaybeObserver maybeObserver = this.d;
            if (DisposableHelper.l(this.f, disposable)) {
                try {
                    this.e.e.accept(disposable);
                    this.f = disposable;
                    maybeObserver.d(this);
                } catch (Throwable th) {
                    Exceptions.b(th);
                    disposable.dispose();
                    this.f = DisposableHelper.d;
                    EmptyDisposable.d(th, maybeObserver);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            try {
                this.e.j.run();
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.b(th);
            }
            this.f.dispose();
            this.f = DisposableHelper.d;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            Disposable disposable = this.f;
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper) {
                return;
            }
            try {
                this.e.h.run();
                this.f = disposableHelper;
                this.d.onComplete();
                a();
            } catch (Throwable th) {
                Exceptions.b(th);
                c(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            if (this.f == DisposableHelper.d) {
                RxJavaPlugins.b(th);
            } else {
                c(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            Disposable disposable = this.f;
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper) {
                return;
            }
            try {
                this.e.f.accept(obj);
                this.f = disposableHelper;
                this.d.onSuccess(obj);
                a();
            } catch (Throwable th) {
                Exceptions.b(th);
                c(th);
            }
        }
    }

    public MaybePeek(Maybe maybe, Consumer consumer, Action action) {
        super(maybe);
        this.e = consumer;
        Consumer consumer2 = Functions.d;
        this.f = consumer2;
        this.g = consumer2;
        Action action2 = Functions.c;
        this.h = action2;
        this.i = action2;
        this.j = action;
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        this.d.a(new MaybePeekObserver(maybeObserver, this));
    }
}
