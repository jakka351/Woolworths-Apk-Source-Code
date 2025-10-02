package androidx.camera.view;

import androidx.camera.core.impl.utils.Threads;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes2.dex */
class PendingValue<T> {

    /* renamed from: a, reason: collision with root package name */
    public Pair f643a;

    public final ListenableFuture a(Object obj) {
        Threads.a();
        return CallbackToFutureAdapter.a(new d(0, this, obj));
    }
}
