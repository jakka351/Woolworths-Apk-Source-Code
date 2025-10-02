package androidx.camera.video;

import android.util.Range;
import androidx.camera.video.VideoSpec;

/* loaded from: classes2.dex */
final class AutoValue_VideoSpec extends VideoSpec {
    public final QualitySelector d;
    public final Range e;
    public final Range f;
    public final int g;

    public static final class Builder extends VideoSpec.Builder {

        /* renamed from: a, reason: collision with root package name */
        public QualitySelector f583a;
        public Range b;
        public Range c;
        public Integer d;

        @Override // androidx.camera.video.VideoSpec.Builder
        public final VideoSpec a() {
            String strG = this.f583a == null ? " qualitySelector" : "";
            if (this.b == null) {
                strG = strG.concat(" frameRate");
            }
            if (this.c == null) {
                strG = YU.a.g(strG, " bitrate");
            }
            if (this.d == null) {
                strG = YU.a.g(strG, " aspectRatio");
            }
            if (strG.isEmpty()) {
                return new AutoValue_VideoSpec(this.f583a, this.b, this.c, this.d.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strG));
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public final VideoSpec.Builder b(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public final VideoSpec.Builder c(QualitySelector qualitySelector) {
            if (qualitySelector == null) {
                throw new NullPointerException("Null qualitySelector");
            }
            this.f583a = qualitySelector;
            return this;
        }
    }

    public AutoValue_VideoSpec(QualitySelector qualitySelector, Range range, Range range2, int i) {
        this.d = qualitySelector;
        this.e = range;
        this.f = range2;
        this.g = i;
    }

    @Override // androidx.camera.video.VideoSpec
    public final int b() {
        return this.g;
    }

    @Override // androidx.camera.video.VideoSpec
    public final Range c() {
        return this.f;
    }

    @Override // androidx.camera.video.VideoSpec
    public final Range d() {
        return this.e;
    }

    @Override // androidx.camera.video.VideoSpec
    public final QualitySelector e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoSpec)) {
            return false;
        }
        VideoSpec videoSpec = (VideoSpec) obj;
        return this.d.equals(videoSpec.e()) && this.e.equals(videoSpec.d()) && this.f.equals(videoSpec.c()) && this.g == videoSpec.b();
    }

    @Override // androidx.camera.video.VideoSpec
    public final VideoSpec.Builder f() {
        Builder builder = new Builder();
        builder.f583a = this.d;
        builder.b = this.e;
        builder.c = this.f;
        builder.d = Integer.valueOf(this.g);
        return builder;
    }

    public final int hashCode() {
        return ((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.d);
        sb.append(", frameRate=");
        sb.append(this.e);
        sb.append(", bitrate=");
        sb.append(this.f);
        sb.append(", aspectRatio=");
        return YU.a.m(sb, this.g, "}");
    }
}
