package androidx.media3.common;

import android.media.AudioAttributes;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Util;

/* loaded from: classes2.dex */
public final class AudioAttributes {
    public static final AudioAttributes b = new AudioAttributes();

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributesV21 f2845a;

    @RequiresApi
    public static final class Api29 {
    }

    @RequiresApi
    public static final class Api32 {
    }

    public static final class AudioAttributesV21 {

        /* renamed from: a, reason: collision with root package name */
        public final android.media.AudioAttributes f2846a;

        public AudioAttributesV21(AudioAttributes audioAttributes) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i = Util.f2928a;
            if (i >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            if (i >= 32) {
                usage.setSpatializationBehavior(0);
            }
            this.f2846a = usage.build();
        }
    }

    public static final class Builder {
    }

    static {
        androidx.compose.ui.input.pointer.a.r(0, 1, 2, 3, 4);
    }

    public final AudioAttributesV21 a() {
        if (this.f2845a == null) {
            this.f2845a = new AudioAttributesV21(this);
        }
        return this.f2845a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AudioAttributes.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 486696559;
    }
}
