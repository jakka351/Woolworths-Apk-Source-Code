package androidx.camera.video.internal.audio;

import YU.a;
import androidx.camera.video.internal.audio.AudioSettings;

/* loaded from: classes2.dex */
final class AutoValue_AudioSettings extends AudioSettings {
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public static final class Builder extends AudioSettings.Builder {

        /* renamed from: a, reason: collision with root package name */
        public Integer f611a;
        public Integer b;
        public Integer c;
        public Integer d;

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public final AudioSettings.Builder b(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public final AudioSettings.Builder c(int i) {
            this.f611a = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public final AudioSettings.Builder d(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public final AudioSettings.Builder e(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }
    }

    public AutoValue_AudioSettings(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public final int b() {
        return this.e;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public final int c() {
        return this.b;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public final int d() {
        return this.d;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioSettings)) {
            return false;
        }
        AudioSettings audioSettings = (AudioSettings) obj;
        return this.b == audioSettings.c() && this.c == audioSettings.e() && this.d == audioSettings.d() && this.e == audioSettings.b();
    }

    public final int hashCode() {
        return ((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSettings{audioSource=");
        sb.append(this.b);
        sb.append(", sampleRate=");
        sb.append(this.c);
        sb.append(", channelCount=");
        sb.append(this.d);
        sb.append(", audioFormat=");
        return a.m(sb, this.e, "}");
    }
}
