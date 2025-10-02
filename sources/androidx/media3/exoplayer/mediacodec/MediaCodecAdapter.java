package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.CryptoInfo;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes2.dex */
public interface MediaCodecAdapter {

    public static final class Configuration {

        /* renamed from: a, reason: collision with root package name */
        public final MediaCodecInfo f3105a;
        public final MediaFormat b;
        public final Format c;
        public final Surface d;
        public final MediaCrypto e;
        public final LoudnessCodecController f;

        public Configuration(MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat, Format format, Surface surface, MediaCrypto mediaCrypto, LoudnessCodecController loudnessCodecController) {
            this.f3105a = mediaCodecInfo;
            this.b = mediaFormat;
            this.c = format;
            this.d = surface;
            this.e = mediaCrypto;
            this.f = loudnessCodecController;
        }
    }

    public interface Factory {
        MediaCodecAdapter a(Configuration configuration);
    }

    public interface OnBufferAvailableListener {
    }

    public interface OnFrameRenderedListener {
        void a(long j);
    }

    void a(int i, CryptoInfo cryptoInfo, long j, int i2);

    void b(Bundle bundle);

    void c(int i, int i2, int i3, long j);

    void d(int i);

    void e(int i);

    void f(int i, long j);

    void flush();

    int g(MediaCodec.BufferInfo bufferInfo);

    default boolean h(OnBufferAvailableListener onBufferAvailableListener) {
        return false;
    }

    void i(OnFrameRenderedListener onFrameRenderedListener, Handler handler);

    MediaFormat j();

    void k();

    ByteBuffer l(int i);

    void m(Surface surface);

    int n();

    ByteBuffer o(int i);

    void release();
}
