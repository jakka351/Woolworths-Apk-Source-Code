package androidx.camera.video.internal.encoder;

import android.util.Size;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;

/* loaded from: classes2.dex */
final class AutoValue_VideoEncoderConfig extends VideoEncoderConfig {

    /* renamed from: a, reason: collision with root package name */
    public final String f622a;
    public final int b;
    public final Timebase c;
    public final Size d;
    public final int e;
    public final VideoEncoderDataSpace f;
    public final int g;
    public final int h;
    public final int i;

    public static final class Builder extends VideoEncoderConfig.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f623a;
        public Integer b;
        public Timebase c;
        public Size d;
        public Integer e;
        public VideoEncoderDataSpace f;
        public Integer g;
        public Integer h;
        public Integer i;

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final VideoEncoderConfig a() {
            String strG = this.f623a == null ? " mimeType" : "";
            if (this.b == null) {
                strG = strG.concat(" profile");
            }
            if (this.c == null) {
                strG = YU.a.g(strG, " inputTimebase");
            }
            if (this.d == null) {
                strG = YU.a.g(strG, " resolution");
            }
            if (this.e == null) {
                strG = YU.a.g(strG, " colorFormat");
            }
            if (this.f == null) {
                strG = YU.a.g(strG, " dataSpace");
            }
            if (this.g == null) {
                strG = YU.a.g(strG, " frameRate");
            }
            if (this.h == null) {
                strG = YU.a.g(strG, " IFrameInterval");
            }
            if (this.i == null) {
                strG = YU.a.g(strG, " bitrate");
            }
            if (strG.isEmpty()) {
                return new AutoValue_VideoEncoderConfig(this.f623a, this.b.intValue(), this.c, this.d, this.e.intValue(), this.f, this.g.intValue(), this.h.intValue(), this.i.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strG));
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final VideoEncoderConfig.Builder b(int i) {
            this.i = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final VideoEncoderConfig.Builder c(VideoEncoderDataSpace videoEncoderDataSpace) {
            this.f = videoEncoderDataSpace;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final VideoEncoderConfig.Builder d(int i) {
            this.g = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final VideoEncoderConfig.Builder e(Timebase timebase) {
            if (timebase == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.c = timebase;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final VideoEncoderConfig.Builder f(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f623a = str;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final VideoEncoderConfig.Builder g(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        public final VideoEncoderConfig.Builder h(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.d = size;
            return this;
        }
    }

    public AutoValue_VideoEncoderConfig(String str, int i, Timebase timebase, Size size, int i2, VideoEncoderDataSpace videoEncoderDataSpace, int i3, int i4, int i5) {
        this.f622a = str;
        this.b = i;
        this.c = timebase;
        this.d = size;
        this.e = i2;
        this.f = videoEncoderDataSpace;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final String a() {
        return this.f622a;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public final Timebase b() {
        return this.c;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public final int e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoEncoderConfig)) {
            return false;
        }
        VideoEncoderConfig videoEncoderConfig = (VideoEncoderConfig) obj;
        AutoValue_VideoEncoderConfig autoValue_VideoEncoderConfig = (AutoValue_VideoEncoderConfig) videoEncoderConfig;
        return this.f622a.equals(autoValue_VideoEncoderConfig.f622a) && this.b == videoEncoderConfig.j() && this.c.equals(autoValue_VideoEncoderConfig.c) && this.d.equals(videoEncoderConfig.k()) && this.e == videoEncoderConfig.f() && this.f.equals(videoEncoderConfig.g()) && this.g == videoEncoderConfig.h() && this.h == videoEncoderConfig.i() && this.i == videoEncoderConfig.e();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public final int f() {
        return this.e;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public final VideoEncoderDataSpace g() {
        return this.f;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f622a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public final int i() {
        return this.h;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public final int j() {
        return this.b;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    public final Size k() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.f622a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", resolution=");
        sb.append(this.d);
        sb.append(", colorFormat=");
        sb.append(this.e);
        sb.append(", dataSpace=");
        sb.append(this.f);
        sb.append(", frameRate=");
        sb.append(this.g);
        sb.append(", IFrameInterval=");
        sb.append(this.h);
        sb.append(", bitrate=");
        return YU.a.m(sb, this.i, "}");
    }
}
