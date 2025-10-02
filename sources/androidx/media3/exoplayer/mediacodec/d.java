package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements MediaCodecUtil.ScoreProvider, LoudnessCodecController.LoudnessParameterUpdateListener, MediaCodecSelector {
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
    public List a(String str, boolean z, boolean z2) {
        return MediaCodecUtil.e(str, z, z2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    public int b(Object obj) {
        HashMap map = MediaCodecUtil.f3110a;
        String str = ((MediaCodecInfo) obj).f3106a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Util.f2928a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
