package androidx.media3.common.util;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = Util.f2928a;
        return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
    }
}
