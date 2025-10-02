package androidx.camera.core.impl;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public interface Observable<T> {

    public interface Observer<T> {
        void a(Object obj);

        void onError(Throwable th);
    }

    ListenableFuture b();

    void c(Executor executor, Observer observer);

    void d(Observer observer);
}
