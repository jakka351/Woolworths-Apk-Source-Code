package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.StreamSpec;

/* loaded from: classes2.dex */
final class AutoValue_StreamSpec extends StreamSpec {
    public final Size b;
    public final DynamicRange c;
    public final Range d;
    public final Config e;
    public final boolean f;

    public static final class Builder extends StreamSpec.Builder {

        /* renamed from: a, reason: collision with root package name */
        public Size f468a;
        public DynamicRange b;
        public Range c;
        public Config d;
        public Boolean e;

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final StreamSpec a() {
            String strG = this.f468a == null ? " resolution" : "";
            if (this.b == null) {
                strG = strG.concat(" dynamicRange");
            }
            if (this.c == null) {
                strG = YU.a.g(strG, " expectedFrameRateRange");
            }
            if (this.e == null) {
                strG = YU.a.g(strG, " zslDisabled");
            }
            if (strG.isEmpty()) {
                return new AutoValue_StreamSpec(this.f468a, this.b, this.c, this.d, this.e.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strG));
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final StreamSpec.Builder b(DynamicRange dynamicRange) {
            if (dynamicRange == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.b = dynamicRange;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final StreamSpec.Builder c(Range range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.c = range;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final StreamSpec.Builder d(Config config) {
            this.d = config;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final StreamSpec.Builder e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f468a = size;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final StreamSpec.Builder f(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }
    }

    public AutoValue_StreamSpec(Size size, DynamicRange dynamicRange, Range range, Config config, boolean z) {
        this.b = size;
        this.c = dynamicRange;
        this.d = range;
        this.e = config;
        this.f = z;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final DynamicRange b() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final Range c() {
        return this.d;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final Config d() {
        return this.e;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final Size e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamSpec)) {
            return false;
        }
        StreamSpec streamSpec = (StreamSpec) obj;
        if (!this.b.equals(streamSpec.e()) || !this.c.equals(streamSpec.b()) || !this.d.equals(streamSpec.c())) {
            return false;
        }
        Config config = this.e;
        if (config == null) {
            if (streamSpec.d() != null) {
                return false;
            }
        } else if (!config.equals(streamSpec.d())) {
            return false;
        }
        return this.f == streamSpec.f();
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final boolean f() {
        return this.f;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final StreamSpec.Builder g() {
        Builder builder = new Builder();
        builder.f468a = e();
        builder.b = b();
        builder.c = c();
        builder.d = d();
        builder.e = Boolean.valueOf(f());
        return builder;
    }

    public final int hashCode() {
        int iHashCode = (((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        Config config = this.e;
        return ((iHashCode ^ (config == null ? 0 : config.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.b);
        sb.append(", dynamicRange=");
        sb.append(this.c);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.d);
        sb.append(", implementationOptions=");
        sb.append(this.e);
        sb.append(", zslDisabled=");
        return YU.a.k("}", sb, this.f);
    }
}
