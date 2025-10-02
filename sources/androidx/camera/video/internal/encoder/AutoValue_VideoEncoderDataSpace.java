package androidx.camera.video.internal.encoder;

/* loaded from: classes2.dex */
final class AutoValue_VideoEncoderDataSpace extends VideoEncoderDataSpace {
    public final int e;
    public final int f;
    public final int g;

    public AutoValue_VideoEncoderDataSpace(int i, int i2, int i3) {
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public final int a() {
        return this.g;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public final int b() {
        return this.e;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public final int c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoEncoderDataSpace)) {
            return false;
        }
        VideoEncoderDataSpace videoEncoderDataSpace = (VideoEncoderDataSpace) obj;
        return this.e == videoEncoderDataSpace.b() && this.f == videoEncoderDataSpace.c() && this.g == videoEncoderDataSpace.a();
    }

    public final int hashCode() {
        return ((((this.e ^ 1000003) * 1000003) ^ this.f) * 1000003) ^ this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append(this.e);
        sb.append(", transfer=");
        sb.append(this.f);
        sb.append(", range=");
        return YU.a.m(sb, this.g, "}");
    }
}
