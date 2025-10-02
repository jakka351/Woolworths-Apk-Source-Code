package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import android.util.Size;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig;
import com.google.android.gms.common.Scopes;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes2.dex */
public abstract class VideoEncoderConfig implements EncoderConfig {

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract VideoEncoderConfig a();

        public abstract Builder b(int i);

        public abstract Builder c(VideoEncoderDataSpace videoEncoderDataSpace);

        public abstract Builder d(int i);

        public abstract Builder e(Timebase timebase);

        public abstract Builder f(String str);

        public abstract Builder g(int i);

        public abstract Builder h(Size size);
    }

    public static Builder d() {
        AutoValue_VideoEncoderConfig.Builder builder = new AutoValue_VideoEncoderConfig.Builder();
        builder.b = -1;
        builder.h = 1;
        builder.e = 2130708361;
        builder.f = VideoEncoderDataSpace.f635a;
        return builder;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final MediaFormat c() {
        Size sizeK = k();
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(((AutoValue_VideoEncoderConfig) this).f622a, sizeK.getWidth(), sizeK.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", f());
        mediaFormatCreateVideoFormat.setInteger("bitrate", e());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", h());
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i());
        if (j() != -1) {
            mediaFormatCreateVideoFormat.setInteger(Scopes.PROFILE, j());
        }
        VideoEncoderDataSpace videoEncoderDataSpaceG = g();
        if (videoEncoderDataSpaceG.b() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", videoEncoderDataSpaceG.b());
        }
        if (videoEncoderDataSpaceG.c() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", videoEncoderDataSpaceG.c());
        }
        if (videoEncoderDataSpaceG.a() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", videoEncoderDataSpaceG.a());
        }
        return mediaFormatCreateVideoFormat;
    }

    public abstract int e();

    public abstract int f();

    public abstract VideoEncoderDataSpace g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract Size k();
}
