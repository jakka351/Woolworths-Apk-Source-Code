package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public interface VideoGraph {

    @UnstableApi
    public interface Listener {
    }

    VideoFrameProcessor a();

    void b();

    void c();

    void initialize();

    void release();
}
