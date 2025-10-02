package okhttp3.internal;

import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ a(String str, boolean z) {
        this.d = str;
        this.e = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        TimeZone timeZone = _UtilJvmKt.f26699a;
        Thread thread = new Thread(runnable, this.d);
        thread.setDaemon(this.e);
        return thread;
    }
}
