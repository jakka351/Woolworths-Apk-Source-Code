package androidx.media3.decoder;

import androidx.camera.core.impl.b;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes2.dex */
public class DecoderInputBuffer extends Buffer {
    public Format e;
    public final CryptoInfo f = new CryptoInfo();
    public ByteBuffer g;
    public boolean h;
    public long i;
    public ByteBuffer j;
    public final int k;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface BufferReplacementMode {
    }

    public static final class InsufficientCapacityException extends IllegalStateException {
    }

    static {
        MediaLibraryInfo.a("media3.decoder");
    }

    public DecoderInputBuffer(int i) {
        this.k = i;
    }

    public void l() {
        this.d = 0;
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.j;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.h = false;
    }

    public final ByteBuffer m(int i) {
        int i2 = this.k;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.g;
        throw new InsufficientCapacityException(b.j(byteBuffer == null ? 0 : byteBuffer.capacity(), i, "Buffer too small (", " < ", ")"));
    }

    public final void n(int i) {
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer == null) {
            this.g = m(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.g = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM = m(i2);
        byteBufferM.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM.put(byteBuffer);
        }
        this.g = byteBufferM;
    }

    public final void o() {
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.j;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
