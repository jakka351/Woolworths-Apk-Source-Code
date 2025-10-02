package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.d = i;
        this.f = obj;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws ExecutionException, InterruptedException {
        switch (this.d) {
            case 0:
                ((LiveDataObservable) this.f).f491a.k((LiveDataObservable.LiveDataObserverAdapter) this.e);
                return;
            case 1:
                LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter = (LiveDataObservable.LiveDataObserverAdapter) this.e;
                LiveDataObservable.Result result = (LiveDataObservable.Result) this.f;
                Observable.Observer observer = liveDataObserverAdapter.e;
                if (liveDataObserverAdapter.d.get()) {
                    result.getClass();
                    observer.a(result.f492a);
                    return;
                }
                return;
            case 2:
                ConstantObservable constantObservable = (ConstantObservable) this.f;
                Observable.Observer observer2 = (Observable.Observer) this.e;
                ConstantObservable constantObservable2 = ConstantObservable.b;
                try {
                    observer2.a(constantObservable.f484a.get());
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    observer2.onError(e);
                    return;
                }
            case 3:
                DeferrableSurface deferrableSurface = (DeferrableSurface) this.f;
                String str = (String) this.e;
                Size size = DeferrableSurface.k;
                try {
                    deferrableSurface.e.get();
                    deferrableSurface.e(DeferrableSurface.n.decrementAndGet(), DeferrableSurface.m.get(), "Surface terminated");
                    return;
                } catch (Exception e2) {
                    Logger.b("DeferrableSurface", "Unexpected surface termination for " + deferrableSurface + "\nStack Trace:\n" + str);
                    synchronized (deferrableSurface.f486a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", deferrableSurface, Boolean.valueOf(deferrableSurface.c), Integer.valueOf(deferrableSurface.b)), e2);
                    }
                }
            default:
                LiveDataObservable liveDataObservable = (LiveDataObservable) this.f;
                CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) this.e;
                LiveDataObservable.Result result2 = (LiveDataObservable.Result) liveDataObservable.f491a.e();
                if (result2 == null) {
                    completer.d(new IllegalStateException("Observable has not yet been initialized with a value."));
                    return;
                } else {
                    completer.b(result2.f492a);
                    return;
                }
        }
    }

    public /* synthetic */ f(LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter, LiveDataObservable.Result result) {
        this.d = 1;
        this.e = liveDataObserverAdapter;
        this.f = result;
    }
}
