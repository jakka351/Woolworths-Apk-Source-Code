package androidx.camera.video.internal.config;

import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.config.MimeInfo;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes2.dex */
public abstract class VideoMimeInfo extends MimeInfo {

    @AutoValue.Builder
    public static abstract class Builder extends MimeInfo.Builder<Builder> {
    }

    public abstract EncoderProfilesProxy.VideoProfileProxy c();
}
