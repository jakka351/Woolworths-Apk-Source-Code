package androidx.media3.extractor.mp3;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;

/* loaded from: classes2.dex */
final class XingFrame {

    /* renamed from: a, reason: collision with root package name */
    public final MpegAudioUtil.Header f3313a;
    public final long b;

    public XingFrame(MpegAudioUtil.Header header, long j, long j2, long[] jArr, int i, int i2) {
        MpegAudioUtil.Header header2 = new MpegAudioUtil.Header();
        header2.f3247a = header.f3247a;
        header2.b = header.b;
        header2.c = header.c;
        header2.d = header.d;
        header2.e = header.e;
        header2.f = header.f;
        header2.g = header.g;
        this.f3313a = header2;
        this.b = j;
    }

    public final long a() {
        long j = this.b;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        return Util.M(this.f3313a.d, (j * r0.g) - 1);
    }
}
