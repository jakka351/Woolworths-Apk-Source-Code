package androidx.camera.core.impl.compat;

import YU.a;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.camera.core.impl.EncoderProfilesProxy;

/* loaded from: classes2.dex */
public final class EncoderProfilesProxyCompat {
    public static EncoderProfilesProxy a(EncoderProfiles encoderProfiles) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return EncoderProfilesProxyCompatApi33Impl.a(encoderProfiles);
        }
        if (i >= 31) {
            return EncoderProfilesProxyCompatApi31Impl.a(encoderProfiles);
        }
        throw new RuntimeException(a.e(i, "Unable to call from(EncoderProfiles) on API ", ". Version 31 or higher required."));
    }
}
