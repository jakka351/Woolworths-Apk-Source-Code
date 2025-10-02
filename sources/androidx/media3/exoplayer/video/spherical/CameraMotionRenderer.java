package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes2.dex */
public final class CameraMotionRenderer extends BaseRenderer {
    public final DecoderInputBuffer u;
    public final ParsableByteArray v;
    public CameraMotionListener w;
    public long x;

    public CameraMotionRenderer() {
        super(6);
        this.u = new DecoderInputBuffer(1);
        this.v = new ParsableByteArray();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void E() {
        CameraMotionListener cameraMotionListener = this.w;
        if (cameraMotionListener != null) {
            cameraMotionListener.c();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void G(long j, boolean z) {
        this.x = Long.MIN_VALUE;
        CameraMotionListener cameraMotionListener = this.w;
        if (cameraMotionListener != null) {
            cameraMotionListener.c();
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int a(Format format) {
        return "application/x-camera-motion".equals(format.n) ? RendererCapabilities.g(4, 0, 0, 0) : RendererCapabilities.g(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public final void i(int i, Object obj) {
        if (i == 8) {
            this.w = (CameraMotionListener) obj;
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void m(long j, long j2) {
        float[] fArr;
        while (!f() && this.x < 100000 + j) {
            DecoderInputBuffer decoderInputBuffer = this.u;
            decoderInputBuffer.l();
            FormatHolder formatHolder = this.f;
            formatHolder.a();
            if (M(formatHolder, decoderInputBuffer, 0) != -4 || decoderInputBuffer.f(4)) {
                return;
            }
            long j3 = decoderInputBuffer.i;
            this.x = j3;
            boolean z = j3 < this.o;
            if (this.w != null && !z) {
                decoderInputBuffer.o();
                ByteBuffer byteBuffer = decoderInputBuffer.g;
                int i = Util.f2928a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    ParsableByteArray parsableByteArray = this.v;
                    parsableByteArray.E(iLimit, bArrArray);
                    parsableByteArray.G(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(parsableByteArray.i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.w.a(fArr, this.x - this.n);
                }
            }
        }
    }
}
