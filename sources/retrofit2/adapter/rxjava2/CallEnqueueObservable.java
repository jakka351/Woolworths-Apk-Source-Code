package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: classes8.dex */
final class CallEnqueueObservable<T> extends Observable<Response<T>> {

    public static final class CallCallback<T> implements Disposable, Callback<T> {
        public final Call d;
        public final Observer e;
        public volatile boolean f;
        public boolean g = false;

        public CallCallback(Call call, Observer observer) {
            this.d = call;
            this.e = observer;
        }

        @Override // retrofit2.Callback
        public final void a(Call call, Throwable th) {
            if (call.isCanceled()) {
                return;
            }
            try {
                this.e.onError(th);
            } catch (Throwable th2) {
                Exceptions.b(th2);
                RxJavaPlugins.b(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f;
        }

        @Override // retrofit2.Callback
        public final void c(Call call, Response response) {
            if (this.f) {
                return;
            }
            try {
                this.e.onNext(response);
                if (this.f) {
                    return;
                }
                this.g = true;
                this.e.onComplete();
            } catch (Throwable th) {
                Exceptions.b(th);
                if (this.g) {
                    RxJavaPlugins.b(th);
                    return;
                }
                if (this.f) {
                    return;
                }
                try {
                    this.e.onError(th);
                } catch (Throwable th2) {
                    Exceptions.b(th2);
                    RxJavaPlugins.b(new CompositeException(th, th2));
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f = true;
            this.d.cancel();
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        throw null;
    }
}
