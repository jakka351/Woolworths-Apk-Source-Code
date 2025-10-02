package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes2.dex */
public abstract class StreamSpec {

    /* renamed from: a, reason: collision with root package name */
    public static final Range f502a = new Range(0, 0);

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract StreamSpec a();

        public abstract Builder b(DynamicRange dynamicRange);

        public abstract Builder c(Range range);

        public abstract Builder d(Config config);

        public abstract Builder e(Size size);

        public abstract Builder f(boolean z);
    }

    public static Builder a(Size size) {
        AutoValue_StreamSpec.Builder builder = new AutoValue_StreamSpec.Builder();
        builder.e(size);
        builder.c(f502a);
        builder.b = DynamicRange.d;
        builder.f(false);
        return builder;
    }

    public abstract DynamicRange b();

    public abstract Range c();

    public abstract Config d();

    public abstract Size e();

    public abstract boolean f();

    public abstract Builder g();
}
