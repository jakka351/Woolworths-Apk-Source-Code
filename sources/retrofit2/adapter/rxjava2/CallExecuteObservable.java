package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes8.dex */
final class CallExecuteObservable<T> extends Observable<Response<T>> {
    public final Call d;

    public static final class CallDisposable implements Disposable {
        public final Call d;
        public volatile boolean e;

        public CallDisposable(Call call) {
            this.d = call;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.e;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.e = true;
            this.d.cancel();
        }
    }

    public CallExecuteObservable(Call call) {
        this.d = call;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        Call callClone = this.d.clone();
        CallDisposable callDisposable = new CallDisposable(callClone);
        observer.d(callDisposable);
        if (callDisposable.e) {
            return;
        }
        boolean z = false;
        try {
            Object objExecute = callClone.execute();
            if (!callDisposable.e) {
                observer.onNext(objExecute);
            }
            if (callDisposable.e) {
                return;
            }
            try {
                observer.onComplete();
            } catch (Throwable th) {
                th = th;
                z = true;
                Exceptions.b(th);
                if (z) {
                    RxJavaPlugins.b(th);
                    return;
                }
                if (callDisposable.e) {
                    return;
                }
                try {
                    observer.onError(th);
                } catch (Throwable th2) {
                    Exceptions.b(th2);
                    RxJavaPlugins.b(new CompositeException(th, th2));
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
