package androidx.camera.core.impl.utils.futures;

/* loaded from: classes2.dex */
public interface FutureCallback<V> {
    void onFailure(Throwable th);

    void onSuccess(Object obj);
}
