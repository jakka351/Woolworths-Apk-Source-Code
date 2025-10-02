package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import android.util.Range;
import androidx.camera.video.internal.utils.CodecUtil;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
public class VideoEncoderInfoImpl extends EncoderInfoImpl implements VideoEncoderInfo {
    public static final androidx.camera.camera2.internal.compat.workaround.b c = new androidx.camera.camera2.internal.compat.workaround.b(3);
    public final MediaCodecInfo.VideoCapabilities b;

    public VideoEncoderInfoImpl(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f632a.getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.b = videoCapabilities;
    }

    public static VideoEncoderInfoImpl k(VideoEncoderConfig videoEncoderConfig) throws Throwable {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodecCreateEncoderByType;
        LruCache lruCache = CodecUtil.f636a;
        AutoValue_VideoEncoderConfig autoValue_VideoEncoderConfig = (AutoValue_VideoEncoderConfig) videoEncoderConfig;
        String str = autoValue_VideoEncoderConfig.f622a;
        LruCache lruCache2 = CodecUtil.f636a;
        synchronized (lruCache2) {
            mediaCodecInfo = (MediaCodecInfo) lruCache2.get(str);
        }
        try {
            if (mediaCodecInfo == null) {
                try {
                    mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
                    try {
                        MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
                        synchronized (lruCache2) {
                            lruCache2.put(str, codecInfo);
                        }
                        mediaCodecCreateEncoderByType.release();
                        mediaCodecInfo = codecInfo;
                    } catch (Throwable th) {
                        th = th;
                        if (mediaCodecCreateEncoderByType != null) {
                            mediaCodecCreateEncoderByType.release();
                        }
                        throw th;
                    }
                } catch (IOException | IllegalArgumentException e) {
                    throw new InvalidConfigException(e);
                }
            }
            return new VideoEncoderInfoImpl(mediaCodecInfo, autoValue_VideoEncoderConfig.f622a);
        } catch (Throwable th2) {
            th = th2;
            mediaCodecCreateEncoderByType = null;
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range a(int i) {
        try {
            return this.b.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range c() {
        return this.b.getBitrateRange();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range d(int i) {
        try {
            return this.b.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range e() {
        return this.b.getSupportedWidths();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final Range f() {
        return this.b.getSupportedHeights();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean g() {
        return true;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int h() {
        return this.b.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean i(int i, int i2) {
        return this.b.isSizeSupported(i, i2);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int j() {
        return this.b.getWidthAlignment();
    }
}
