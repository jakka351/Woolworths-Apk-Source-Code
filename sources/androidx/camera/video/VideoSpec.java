package androidx.camera.video;

import android.util.Range;
import androidx.annotation.RestrictTo;
import androidx.camera.video.AutoValue_VideoSpec;
import com.google.auto.value.AutoValue;
import java.util.Arrays;

@AutoValue
@RestrictTo
/* loaded from: classes2.dex */
public abstract class VideoSpec {

    /* renamed from: a, reason: collision with root package name */
    public static final Range f605a = new Range(0, Integer.MAX_VALUE);
    public static final Range b = new Range(0, Integer.MAX_VALUE);
    public static final QualitySelector c;

    @AutoValue.Builder
    @RestrictTo
    public static abstract class Builder {
        public abstract VideoSpec a();

        public abstract Builder b(int i);

        public abstract Builder c(QualitySelector qualitySelector);
    }

    static {
        Quality quality = Quality.c;
        c = QualitySelector.a(Arrays.asList(quality, Quality.b, Quality.f586a), new AutoValue_FallbackStrategy_RuleStrategy(quality, 1));
    }

    public static Builder a() {
        AutoValue_VideoSpec.Builder builder = new AutoValue_VideoSpec.Builder();
        builder.c(c);
        Range range = f605a;
        if (range == null) {
            throw new NullPointerException("Null frameRate");
        }
        builder.b = range;
        Range range2 = b;
        if (range2 == null) {
            throw new NullPointerException("Null bitrate");
        }
        builder.c = range2;
        builder.d = -1;
        return builder;
    }

    public abstract int b();

    public abstract Range c();

    public abstract Range d();

    public abstract QualitySelector e();

    public abstract Builder f();
}
