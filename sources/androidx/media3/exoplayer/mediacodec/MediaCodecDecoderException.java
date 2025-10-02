package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderException;

@UnstableApi
/* loaded from: classes2.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final int d;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, MediaCodecInfo mediaCodecInfo) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(mediaCodecInfo == null ? null : mediaCodecInfo.f3106a);
        super(sb.toString(), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        this.d = Util.f2928a >= 23 ? z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : Util.t(z ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null);
    }
}
