package androidx.camera.video;

import android.util.Range;
import androidx.camera.video.AudioSpec;

/* loaded from: classes2.dex */
final class AutoValue_AudioSpec extends AudioSpec {
    public final Range c;
    public final int d;
    public final int e;
    public final Range f;
    public final int g;

    public static final class Builder extends AudioSpec.Builder {

        /* renamed from: a, reason: collision with root package name */
        public Range f579a;
        public Integer b;
        public Integer c;
        public Range d;
        public Integer e;

        @Override // androidx.camera.video.AudioSpec.Builder
        public final AudioSpec a() {
            String strG = this.f579a == null ? " bitrate" : "";
            if (this.b == null) {
                strG = strG.concat(" sourceFormat");
            }
            if (this.c == null) {
                strG = YU.a.g(strG, " source");
            }
            if (this.d == null) {
                strG = YU.a.g(strG, " sampleRate");
            }
            if (this.e == null) {
                strG = YU.a.g(strG, " channelCount");
            }
            if (strG.isEmpty()) {
                return new AutoValue_AudioSpec(this.f579a, this.b.intValue(), this.c.intValue(), this.d, this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strG));
        }
    }

    public AutoValue_AudioSpec(Range range, int i, int i2, Range range2, int i3) {
        this.c = range;
        this.d = i;
        this.e = i2;
        this.f = range2;
        this.g = i3;
    }

    @Override // androidx.camera.video.AudioSpec
    public final Range b() {
        return this.c;
    }

    @Override // androidx.camera.video.AudioSpec
    public final int c() {
        return this.g;
    }

    @Override // androidx.camera.video.AudioSpec
    public final Range d() {
        return this.f;
    }

    @Override // androidx.camera.video.AudioSpec
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioSpec)) {
            return false;
        }
        AudioSpec audioSpec = (AudioSpec) obj;
        return this.c.equals(audioSpec.b()) && this.d == audioSpec.f() && this.e == audioSpec.e() && this.f.equals(audioSpec.d()) && this.g == audioSpec.c();
    }

    @Override // androidx.camera.video.AudioSpec
    public final int f() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpec{bitrate=");
        sb.append(this.c);
        sb.append(", sourceFormat=");
        sb.append(this.d);
        sb.append(", source=");
        sb.append(this.e);
        sb.append(", sampleRate=");
        sb.append(this.f);
        sb.append(", channelCount=");
        return YU.a.m(sb, this.g, "}");
    }
}
