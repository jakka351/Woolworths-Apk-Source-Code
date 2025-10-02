package androidx.media3.exoplayer.video;

import android.media.MediaFormat;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public interface VideoFrameMetadataListener {
    void d(long j, long j2, Format format, MediaFormat mediaFormat);
}
