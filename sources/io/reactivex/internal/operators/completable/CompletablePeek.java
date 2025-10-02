package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class CompletablePeek extends Completable {
    public final Completable d;
    public final Consumer e;
    public final Consumer f = Functions.d;
    public final Action g;
    public final Action h;
    public final Action i;
    public final Action j;

    public final class CompletableObserverImplementation implements CompletableObserver, Disposable {
        public final CompletableObserver d;
        public Disposable e;

        public CompletableObserverImplementation(CompletableObserver completableObserver) {
            this.d = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.e.b();
        }

        @Override // io.reactivex.CompletableObserver
        public final void d(Disposable disposable) {
            CompletableObserver completableObserver = this.d;
            try {
                CompletablePeek.this.e.accept(disposable);
                if (DisposableHelper.l(this.e, disposable)) {
                    this.e = disposable;
                    completableObserver.d(this);
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                disposable.dispose();
                this.e = DisposableHelper.d;
                EmptyDisposable.c(th, completableObserver);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            try {
                CompletablePeek.this.j.run();
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.b(th);
            }
            this.e.dispose();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            CompletableObserver completableObserver = this.d;
            CompletablePeek completablePeek = CompletablePeek.this;
            if (this.e == DisposableHelper.d) {
                return;
            }
            try {
                completablePeek.g.run();
                Action action = Functions.c;
                completableObserver.onComplete();
                try {
                    action.run();
                } catch (Throwable th) {
                    Exceptions.b(th);
                    RxJavaPlugins.b(th);
                }
            } catch (Throwable th2) {
                Exceptions.b(th2);
                completableObserver.onError(th2);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            if (this.e == DisposableHelper.d) {
                RxJavaPlugins.b(th);
                return;
            }
            this.d.onError(th);
            try {
                Functions.c.run();
            } catch (Throwable th2) {
                Exceptions.b(th2);
                RxJavaPlugins.b(th2);
            }
        }
    }

    public CompletablePeek(Completable completable, Consumer consumer, Action action) {
        this.d = completable;
        this.e = consumer;
        this.g = action;
        Action action2 = Functions.c;
        this.h = action2;
        this.i = action2;
        this.j = action2;
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        this.d.a(new CompletableObserverImplementation(completableObserver));
    }
}
