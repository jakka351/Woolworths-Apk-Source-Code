package androidx.camera.core.impl;

import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class LiveDataObservable<T> implements Observable<T> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableLiveData f491a = new MutableLiveData();
    public final HashMap b = new HashMap();

    public static final class LiveDataObserverAdapter<T> implements Observer<Result<T>> {
        public final AtomicBoolean d = new AtomicBoolean(true);
        public final Observable.Observer e;
        public final Executor f;

        public LiveDataObserverAdapter(Executor executor, Observable.Observer observer) {
            this.f = executor;
            this.e = observer;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            this.f.execute(new f(this, (Result) obj));
        }
    }

    public static final class Result<T> {

        /* renamed from: a, reason: collision with root package name */
        public final CameraInternal.State f492a;

        public Result(CameraInternal.State state) {
            this.f492a = state;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[Result: <");
            sb.append("Value: " + this.f492a);
            sb.append(">]");
            return sb.toString();
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public final ListenableFuture b() {
        return CallbackToFutureAdapter.a(new e(this, 0));
    }

    @Override // androidx.camera.core.impl.Observable
    public final void c(Executor executor, Observable.Observer observer) {
        synchronized (this.b) {
            final LiveDataObserverAdapter liveDataObserverAdapter = (LiveDataObserverAdapter) this.b.get(observer);
            if (liveDataObserverAdapter != null) {
                liveDataObserverAdapter.d.set(false);
            }
            final LiveDataObserverAdapter liveDataObserverAdapter2 = new LiveDataObserverAdapter(executor, observer);
            this.b.put(observer, liveDataObserverAdapter2);
            CameraXExecutors.d().execute(new Runnable() { // from class: androidx.camera.core.impl.g
                @Override // java.lang.Runnable
                public final void run() {
                    MutableLiveData mutableLiveData = this.d.f491a;
                    LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter3 = liveDataObserverAdapter;
                    if (liveDataObserverAdapter3 != null) {
                        mutableLiveData.k(liveDataObserverAdapter3);
                    }
                    mutableLiveData.g(liveDataObserverAdapter2);
                }
            });
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public final void d(Observable.Observer observer) {
        synchronized (this.b) {
            try {
                LiveDataObserverAdapter liveDataObserverAdapter = (LiveDataObserverAdapter) this.b.remove(observer);
                if (liveDataObserverAdapter != null) {
                    liveDataObserverAdapter.d.set(false);
                    CameraXExecutors.d().execute(new f(0, this, liveDataObserverAdapter));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
