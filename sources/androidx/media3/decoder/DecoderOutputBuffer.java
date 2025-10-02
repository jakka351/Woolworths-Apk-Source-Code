package androidx.media3.decoder;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class DecoderOutputBuffer extends Buffer {
    public long e;
    public int f;
    public boolean g;

    public interface Owner<S extends DecoderOutputBuffer> {
    }

    public void l() {
        this.d = 0;
        this.e = 0L;
        this.f = 0;
        this.g = false;
    }

    public abstract void m();
}
