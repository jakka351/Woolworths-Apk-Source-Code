package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Response;

/* loaded from: classes8.dex */
final class ResultObservable<T> extends Observable<Result<T>> {
    public final Observable d;

    public static class ResultObserver<R> implements Observer<Response<R>> {
        public final Observer d;

        public ResultObserver(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            this.d.d(disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.d.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            Observer observer = this.d;
            try {
                if (th == null) {
                    throw new NullPointerException("error == null");
                }
                observer.onNext(new Result());
                observer.onComplete();
            } catch (Throwable th2) {
                try {
                    observer.onError(th2);
                } catch (Throwable th3) {
                    Exceptions.b(th3);
                    RxJavaPlugins.b(new CompositeException(th2, th3));
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (((Response) obj) == null) {
                throw new NullPointerException("response == null");
            }
            this.d.onNext(new Result());
        }
    }

    public ResultObservable(Observable observable) {
        this.d = observable;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new ResultObserver(observer));
    }
}
