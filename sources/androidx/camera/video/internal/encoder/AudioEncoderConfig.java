package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes2.dex */
public abstract class AudioEncoderConfig implements EncoderConfig {

    @AutoValue.Builder
    public static abstract class Builder {
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final MediaFormat c() {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(null, g(), e());
        mediaFormatCreateAudioFormat.setInteger("bitrate", d());
        if (f() == -1) {
            return mediaFormatCreateAudioFormat;
        }
        throw null;
    }

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();
}
