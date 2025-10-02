package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import java.io.IOException;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes2.dex */
public final class SynchronousMediaCodecAdapter implements MediaCodecAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f3113a;
    public final LoudnessCodecController b;

    public static class Factory implements MediaCodecAdapter.Factory {
        public static MediaCodec b(MediaCodecAdapter.Configuration configuration) throws IOException {
            String str = configuration.f3105a.f3106a;
            Trace.beginSection("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            return mediaCodecCreateByCodecName;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.media3.exoplayer.mediacodec.MediaCodecAdapter a(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration r6) throws java.lang.Throwable {
            /*
                r5 = this;
                r0 = 0
                android.media.MediaCodec r0 = b(r6)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                java.lang.String r1 = "configureCodec"
                android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                android.view.Surface r1 = r6.d     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                if (r1 != 0) goto L21
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo r2 = r6.f3105a     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                boolean r2 = r2.h     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                if (r2 == 0) goto L21
                int r2 = androidx.media3.common.util.Util.f2928a     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                r3 = 35
                if (r2 < r3) goto L21
                r2 = 8
                goto L22
            L1d:
                r6 = move-exception
                goto L3f
            L1f:
                r6 = move-exception
                goto L3f
            L21:
                r2 = 0
            L22:
                android.media.MediaFormat r3 = r6.b     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                android.media.MediaCrypto r4 = r6.e     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                r0.configure(r3, r1, r4, r2)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                java.lang.String r1 = "startCodec"
                android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                r0.start()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter r1 = new androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                androidx.media3.exoplayer.mediacodec.LoudnessCodecController r6 = r6.f     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                r1.<init>(r0, r6)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L1f
                return r1
            L3f:
                if (r0 == 0) goto L44
                r0.release()
            L44:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter.Factory.a(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$Configuration):androidx.media3.exoplayer.mediacodec.MediaCodecAdapter");
        }
    }

    public SynchronousMediaCodecAdapter(MediaCodec mediaCodec, LoudnessCodecController loudnessCodecController) {
        this.f3113a = mediaCodec;
        this.b = loudnessCodecController;
        if (Util.f2928a < 35 || loudnessCodecController == null) {
            return;
        }
        android.media.LoudnessCodecController loudnessCodecController2 = loudnessCodecController.c;
        if (loudnessCodecController2 == null || loudnessCodecController2.addMediaCodec(mediaCodec)) {
            Assertions.f(loudnessCodecController.f3102a.add(mediaCodec));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void a(int i, CryptoInfo cryptoInfo, long j, int i2) throws MediaCodec.CryptoException {
        this.f3113a.queueSecureInputBuffer(i, 0, cryptoInfo.i, j, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void b(Bundle bundle) {
        this.f3113a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void c(int i, int i2, int i3, long j) throws MediaCodec.CryptoException {
        this.f3113a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void d(int i) {
        this.f3113a.setVideoScalingMode(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void e(int i) {
        this.f3113a.releaseOutputBuffer(i, false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void f(int i, long j) {
        this.f3113a.releaseOutputBuffer(i, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void flush() {
        this.f3113a.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final int g(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f3113a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void i(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.f3113a.setOnFrameRenderedListener(new a(this, onFrameRenderedListener, 1), handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final MediaFormat j() {
        return this.f3113a.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void k() {
        this.f3113a.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final ByteBuffer l(int i) {
        return this.f3113a.getInputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void m(Surface surface) {
        this.f3113a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final int n() {
        return this.f3113a.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final ByteBuffer o(int i) {
        return this.f3113a.getOutputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void release() {
        LoudnessCodecController loudnessCodecController = this.b;
        MediaCodec mediaCodec = this.f3113a;
        try {
            int i = Util.f2928a;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && loudnessCodecController != null) {
                loudnessCodecController.a(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Util.f2928a >= 35 && loudnessCodecController != null) {
                loudnessCodecController.a(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }
}
