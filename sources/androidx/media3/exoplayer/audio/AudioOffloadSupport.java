package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class AudioOffloadSupport {
    public static final AudioOffloadSupport d = new Builder().a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3046a;
    public final boolean b;
    public final boolean c;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3047a;
        public boolean b;
        public boolean c;

        public final AudioOffloadSupport a() {
            if (this.f3047a || !(this.b || this.c)) {
                return new AudioOffloadSupport(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
    }

    public AudioOffloadSupport(Builder builder) {
        this.f3046a = builder.f3047a;
        this.b = builder.b;
        this.c = builder.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AudioOffloadSupport.class != obj.getClass()) {
            return false;
        }
        AudioOffloadSupport audioOffloadSupport = (AudioOffloadSupport) obj;
        return this.f3046a == audioOffloadSupport.f3046a && this.b == audioOffloadSupport.b && this.c == audioOffloadSupport.c;
    }

    public final int hashCode() {
        return ((this.f3046a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
