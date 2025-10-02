package androidx.camera.video.internal;

import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.List;

/* loaded from: classes2.dex */
final class AutoValue_VideoValidatedEncoderProfilesProxy extends VideoValidatedEncoderProfilesProxy {

    /* renamed from: a, reason: collision with root package name */
    public final int f607a;
    public final int b;
    public final List c;
    public final List d;
    public final EncoderProfilesProxy.AudioProfileProxy e;
    public final EncoderProfilesProxy.VideoProfileProxy f;

    public AutoValue_VideoValidatedEncoderProfilesProxy(int i, int i2, List list, List list2, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.f607a = i;
        this.b = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.d = list2;
        this.e = audioProfileProxy;
        if (videoProfileProxy == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f = videoProfileProxy;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int a() {
        return this.b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final List b() {
        return this.c;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int c() {
        return this.f607a;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoValidatedEncoderProfilesProxy)) {
            return false;
        }
        VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy = (VideoValidatedEncoderProfilesProxy) obj;
        AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) videoValidatedEncoderProfilesProxy;
        if (this.f607a != autoValue_VideoValidatedEncoderProfilesProxy.f607a || this.b != autoValue_VideoValidatedEncoderProfilesProxy.b || !this.c.equals(autoValue_VideoValidatedEncoderProfilesProxy.c) || !this.d.equals(autoValue_VideoValidatedEncoderProfilesProxy.d)) {
            return false;
        }
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.e;
        if (audioProfileProxy == null) {
            if (videoValidatedEncoderProfilesProxy.f() != null) {
                return false;
            }
        } else if (!audioProfileProxy.equals(videoValidatedEncoderProfilesProxy.f())) {
            return false;
        }
        return this.f.equals(videoValidatedEncoderProfilesProxy.g());
    }

    @Override // androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
    public final EncoderProfilesProxy.AudioProfileProxy f() {
        return this.e;
    }

    @Override // androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
    public final EncoderProfilesProxy.VideoProfileProxy g() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f607a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.e;
        return ((iHashCode ^ (audioProfileProxy == null ? 0 : audioProfileProxy.hashCode())) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f607a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.c + ", videoProfiles=" + this.d + ", defaultAudioProfile=" + this.e + ", defaultVideoProfile=" + this.f + "}";
    }
}
