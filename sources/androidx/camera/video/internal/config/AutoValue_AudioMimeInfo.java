package androidx.camera.video.internal.config;

import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.config.AudioMimeInfo;

/* loaded from: classes2.dex */
final class AutoValue_AudioMimeInfo extends AudioMimeInfo {

    public static final class Builder extends AudioMimeInfo.Builder {
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public final String a() {
        return null;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public final int b() {
        return 0;
    }

    @Override // androidx.camera.video.internal.config.AudioMimeInfo
    public final EncoderProfilesProxy.AudioProfileProxy c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioMimeInfo)) {
            return false;
        }
        ((AudioMimeInfo) obj).a();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "AudioMimeInfo{mimeType=" + ((String) null) + ", profile=0, compatibleAudioProfile=" + ((Object) null) + "}";
    }
}
