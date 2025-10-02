package androidx.media3.exoplayer.mediacodec;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.Comparator;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Comparator {
    public final /* synthetic */ MediaCodecUtil.ScoreProvider d;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        HashMap map = MediaCodecUtil.f3110a;
        MediaCodecUtil.ScoreProvider scoreProvider = this.d;
        return scoreProvider.b(obj2) - scoreProvider.b(obj);
    }
}
