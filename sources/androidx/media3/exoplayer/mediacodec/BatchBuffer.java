package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.util.Assertions;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class BatchBuffer extends DecoderInputBuffer {
    public long l;
    public int m;
    public int n;

    @Override // androidx.media3.decoder.DecoderInputBuffer
    public final void l() {
        super.l();
        this.m = 0;
    }

    public final boolean p(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        Assertions.b(!decoderInputBuffer.f(1073741824));
        Assertions.b(!decoderInputBuffer.f(268435456));
        Assertions.b(!decoderInputBuffer.f(4));
        if (q()) {
            if (this.m >= this.n) {
                return false;
            }
            ByteBuffer byteBuffer2 = decoderInputBuffer.g;
            if (byteBuffer2 != null && (byteBuffer = this.g) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.m;
        this.m = i + 1;
        if (i == 0) {
            this.i = decoderInputBuffer.i;
            if (decoderInputBuffer.f(1)) {
                this.d = 1;
            }
        }
        ByteBuffer byteBuffer3 = decoderInputBuffer.g;
        if (byteBuffer3 != null) {
            n(byteBuffer3.remaining());
            this.g.put(byteBuffer3);
        }
        this.l = decoderInputBuffer.i;
        return true;
    }

    public final boolean q() {
        return this.m > 0;
    }
}
