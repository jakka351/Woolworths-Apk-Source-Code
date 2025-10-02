package androidx.camera.video.internal.encoder;

import android.media.MediaCodecInfo;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class EncoderInfoImpl implements EncoderInfo {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f632a;

    public EncoderInfoImpl(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f632a = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new InvalidConfigException(YU.a.A("Unable to get CodecCapabilities for mime: ", str), e);
        }
    }
}
