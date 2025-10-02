package androidx.camera.video.internal;

import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@AutoValue
/* loaded from: classes2.dex */
public abstract class VideoValidatedEncoderProfilesProxy implements EncoderProfilesProxy {
    public static VideoValidatedEncoderProfilesProxy e(EncoderProfilesProxy encoderProfilesProxy) {
        int iC = encoderProfilesProxy.c();
        int iA = encoderProfilesProxy.a();
        List listB = encoderProfilesProxy.b();
        List listD = encoderProfilesProxy.d();
        Preconditions.a("Should contain at least one VideoProfile.", !listD.isEmpty());
        return new AutoValue_VideoValidatedEncoderProfilesProxy(iC, iA, Collections.unmodifiableList(new ArrayList(listB)), Collections.unmodifiableList(new ArrayList(listD)), !listB.isEmpty() ? (EncoderProfilesProxy.AudioProfileProxy) listB.get(0) : null, (EncoderProfilesProxy.VideoProfileProxy) listD.get(0));
    }

    public abstract EncoderProfilesProxy.AudioProfileProxy f();

    public abstract EncoderProfilesProxy.VideoProfileProxy g();
}
