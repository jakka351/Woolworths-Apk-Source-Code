package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderOutputBuffer;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class ImageOutputBuffer extends DecoderOutputBuffer {
    public Bitmap h;

    @Override // androidx.media3.decoder.DecoderOutputBuffer
    public final void l() {
        this.h = null;
        super.l();
    }

    @Override // androidx.media3.decoder.DecoderOutputBuffer
    public void m() {
        l();
    }
}
