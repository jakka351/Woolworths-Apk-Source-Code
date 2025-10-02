package androidx.media3.exoplayer.mediacodec;

import android.os.Bundle;
import androidx.media3.decoder.CryptoInfo;

/* loaded from: classes2.dex */
interface MediaCodecBufferEnqueuer {
    void a(int i, CryptoInfo cryptoInfo, long j, int i2);

    void b(Bundle bundle);

    void c(int i, int i2, int i3, long j);

    void d();

    void flush();

    void shutdown();

    void start();
}
