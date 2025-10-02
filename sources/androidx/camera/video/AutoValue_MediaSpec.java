package androidx.camera.video;

import androidx.camera.video.MediaSpec;

/* loaded from: classes2.dex */
final class AutoValue_MediaSpec extends MediaSpec {

    /* renamed from: a, reason: collision with root package name */
    public final VideoSpec f580a;
    public final AudioSpec b;
    public final int c;

    public static final class Builder extends MediaSpec.Builder {

        /* renamed from: a, reason: collision with root package name */
        public VideoSpec f581a;
        public AudioSpec b;
        public Integer c;

        @Override // androidx.camera.video.MediaSpec.Builder
        public final MediaSpec a() {
            String strG = this.f581a == null ? " videoSpec" : "";
            if (this.b == null) {
                strG = strG.concat(" audioSpec");
            }
            if (this.c == null) {
                strG = YU.a.g(strG, " outputFormat");
            }
            if (strG.isEmpty()) {
                return new AutoValue_MediaSpec(this.f581a, this.b, this.c.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strG));
        }

        @Override // androidx.camera.video.MediaSpec.Builder
        public final VideoSpec b() {
            VideoSpec videoSpec = this.f581a;
            if (videoSpec != null) {
                return videoSpec;
            }
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }

        @Override // androidx.camera.video.MediaSpec.Builder
        public final MediaSpec.Builder c(VideoSpec videoSpec) {
            if (videoSpec == null) {
                throw new NullPointerException("Null videoSpec");
            }
            this.f581a = videoSpec;
            return this;
        }
    }

    public AutoValue_MediaSpec(VideoSpec videoSpec, AudioSpec audioSpec, int i) {
        this.f580a = videoSpec;
        this.b = audioSpec;
        this.c = i;
    }

    @Override // androidx.camera.video.MediaSpec
    public final AudioSpec b() {
        return this.b;
    }

    @Override // androidx.camera.video.MediaSpec
    public final int c() {
        return this.c;
    }

    @Override // androidx.camera.video.MediaSpec
    public final VideoSpec d() {
        return this.f580a;
    }

    @Override // androidx.camera.video.MediaSpec
    public final MediaSpec.Builder e() {
        Builder builder = new Builder();
        builder.f581a = this.f580a;
        builder.b = this.b;
        builder.c = Integer.valueOf(this.c);
        return builder;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaSpec)) {
            return false;
        }
        MediaSpec mediaSpec = (MediaSpec) obj;
        return this.f580a.equals(mediaSpec.d()) && this.b.equals(mediaSpec.b()) && this.c == mediaSpec.c();
    }

    public final int hashCode() {
        return ((((this.f580a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.f580a);
        sb.append(", audioSpec=");
        sb.append(this.b);
        sb.append(", outputFormat=");
        return YU.a.m(sb, this.c, "}");
    }
}
