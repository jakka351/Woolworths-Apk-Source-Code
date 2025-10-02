package androidx.media3.common.util;

import android.os.Looper;

@UnstableApi
/* loaded from: classes2.dex */
public final class BackgroundThreadStateHandler<T> {

    /* renamed from: a, reason: collision with root package name */
    public final HandlerWrapper f2905a;
    public final HandlerWrapper b;
    public final StateChangeListener c;
    public Object d;
    public Object e;

    public interface StateChangeListener<T> {
        void a(Object obj, Object obj2);
    }

    public BackgroundThreadStateHandler(Object obj, Looper looper, Looper looper2, SystemClock systemClock, StateChangeListener stateChangeListener) {
        this.f2905a = systemClock.b(looper, null);
        this.b = systemClock.b(looper2, null);
        this.d = obj;
        this.e = obj;
        this.c = stateChangeListener;
    }
}
