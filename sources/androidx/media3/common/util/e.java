package androidx.media3.common.util;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements ThreadFactory {
    public final /* synthetic */ String d;

    public /* synthetic */ e(String str) {
        this.d = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = Util.f2928a;
        return new Thread(runnable, this.d);
    }
}
