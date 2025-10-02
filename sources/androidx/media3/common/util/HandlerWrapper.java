package androidx.media3.common.util;

import android.os.Looper;

@UnstableApi
/* loaded from: classes2.dex */
public interface HandlerWrapper {

    public interface Message {
        void a();
    }

    boolean a();

    Message b(int i);

    void c();

    Message d(int i, Object obj);

    Message e(int i, int i2, int i3);

    Message f(int i, int i2, Object obj);

    boolean g(Message message);

    Looper h();

    boolean i(long j);

    boolean j(int i);

    void k(int i);

    boolean post(Runnable runnable);
}
