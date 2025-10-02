package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {
    public final /* synthetic */ String d;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.d);
        thread.setPriority(10);
        return thread;
    }
}
