package androidx.camera.video.internal.config;

import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.config.VideoMimeInfo;

/* loaded from: classes2.dex */
final class AutoValue_VideoMimeInfo extends VideoMimeInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f617a;
    public final int b;
    public final EncoderProfilesProxy.VideoProfileProxy c;

    public static final class Builder extends VideoMimeInfo.Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f618a;
        public Integer b;
        public EncoderProfilesProxy.VideoProfileProxy c;
    }

    public AutoValue_VideoMimeInfo(String str, int i, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.f617a = str;
        this.b = i;
        this.c = videoProfileProxy;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public final String a() {
        return this.f617a;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public final int b() {
        return this.b;
    }

    @Override // androidx.camera.video.internal.config.VideoMimeInfo
    public final EncoderProfilesProxy.VideoProfileProxy c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoMimeInfo)) {
            return false;
        }
        VideoMimeInfo videoMimeInfo = (VideoMimeInfo) obj;
        if (!this.f617a.equals(videoMimeInfo.a()) || this.b != videoMimeInfo.b()) {
            return false;
        }
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.c;
        return videoProfileProxy == null ? videoMimeInfo.c() == null : videoProfileProxy.equals(videoMimeInfo.c());
    }

    public final int hashCode() {
        int iHashCode = (((this.f617a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.c;
        return iHashCode ^ (videoProfileProxy == null ? 0 : videoProfileProxy.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.f617a + ", profile=" + this.b + ", compatibleVideoProfile=" + this.c + "}";
    }
}
