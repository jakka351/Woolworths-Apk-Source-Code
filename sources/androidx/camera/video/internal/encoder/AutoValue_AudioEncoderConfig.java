package androidx.camera.video.internal.encoder;

import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;

/* loaded from: classes2.dex */
final class AutoValue_AudioEncoderConfig extends AudioEncoderConfig {

    public static final class Builder extends AudioEncoderConfig.Builder {
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final String a() {
        return null;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final Timebase b() {
        return null;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public final int d() {
        return 0;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioEncoderConfig) {
            throw null;
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public final int f() {
        return 0;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    public final int g() {
        return 0;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb.append((String) null);
        sb.append(", profile=");
        sb.append(0);
        sb.append(", inputTimebase=null, bitrate=");
        sb.append(0);
        sb.append(", sampleRate=");
        sb.append(0);
        sb.append(", channelCount=");
        return YU.a.m(sb, 0, "}");
    }
}
