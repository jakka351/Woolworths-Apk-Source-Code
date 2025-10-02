package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Response;

/* loaded from: classes8.dex */
final class BodyObservable<T> extends Observable<T> {
    public final Observable d;

    public static class BodyObserver<R> implements Observer<Response<R>> {
        public final Observer d;
        public boolean e;

        public BodyObserver(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            this.d.d(disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.d.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (!this.e) {
                this.d.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            RxJavaPlugins.b(assertionError);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            Response response = (Response) obj;
            boolean z = response.f27002a.s;
            Observer observer = this.d;
            if (z) {
                observer.onNext(response.b);
                return;
            }
            this.e = true;
            HttpException httpException = new HttpException(response);
            try {
                observer.onError(httpException);
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.b(new CompositeException(httpException, th));
            }
        }
    }

    public BodyObservable(Observable observable) {
        this.d = observable;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new BodyObserver(observer));
    }
}
