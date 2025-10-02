package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements MediaCodecUtil.ScoreProvider {
    public final /* synthetic */ Format c;

    public /* synthetic */ e(Format format) {
        this.c = format;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    public final int b(Object obj) {
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
        HashMap map = MediaCodecUtil.f3110a;
        String str = mediaCodecInfo.b;
        Format format = this.c;
        return ((str.equals(format.n) || str.equals(MediaCodecUtil.b(format))) && mediaCodecInfo.c(format, false) && mediaCodecInfo.d(format)) ? 1 : 0;
    }
}
