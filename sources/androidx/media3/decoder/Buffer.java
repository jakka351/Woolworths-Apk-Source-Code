package androidx.media3.decoder;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class Buffer {
    public int d;

    public final void e(int i) {
        this.d = i | this.d;
    }

    public final boolean f(int i) {
        return (this.d & i) == i;
    }
}
