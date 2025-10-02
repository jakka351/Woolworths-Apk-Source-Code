package androidx.camera.video;

import androidx.annotation.RestrictTo;
import androidx.camera.video.AutoValue_MediaSpec;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@AutoValue
@RestrictTo
/* loaded from: classes2.dex */
public abstract class MediaSpec {

    @AutoValue.Builder
    @RestrictTo
    public static abstract class Builder {
        public abstract MediaSpec a();

        public abstract VideoSpec b();

        public abstract Builder c(VideoSpec videoSpec);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface OutputFormat {
    }

    public static Builder a() {
        AutoValue_MediaSpec.Builder builder = new AutoValue_MediaSpec.Builder();
        builder.c = -1;
        builder.b = AudioSpec.a().a();
        builder.f581a = VideoSpec.a().a();
        return builder;
    }

    public abstract AudioSpec b();

    public abstract int c();

    public abstract VideoSpec d();

    public abstract Builder e();
}
