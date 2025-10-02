package androidx.camera.video;

import android.util.Range;
import androidx.annotation.RestrictTo;
import androidx.camera.video.AutoValue_AudioSpec;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@AutoValue
@RestrictTo
/* loaded from: classes2.dex */
public abstract class AudioSpec {

    /* renamed from: a, reason: collision with root package name */
    public static final Range f577a = new Range(0, Integer.MAX_VALUE);
    public static final Range b = new Range(0, Integer.MAX_VALUE);

    @AutoValue.Builder
    @RestrictTo
    public static abstract class Builder {
        public abstract AudioSpec a();
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ChannelCount {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Source {
    }

    static {
        AutoValue_AudioSpec.Builder builder = (AutoValue_AudioSpec.Builder) a();
        builder.e = 0;
        builder.a();
    }

    public static Builder a() {
        AutoValue_AudioSpec.Builder builder = new AutoValue_AudioSpec.Builder();
        builder.b = -1;
        builder.c = -1;
        builder.e = -1;
        Range range = f577a;
        if (range == null) {
            throw new NullPointerException("Null bitrate");
        }
        builder.f579a = range;
        Range range2 = b;
        if (range2 == null) {
            throw new NullPointerException("Null sampleRate");
        }
        builder.d = range2;
        return builder;
    }

    public abstract Range b();

    public abstract int c();

    public abstract Range d();

    public abstract int e();

    public abstract int f();
}
