package androidx.media3.common;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class PlaybackParameters {
    public static final PlaybackParameters d = new PlaybackParameters(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f2871a;
    public final float b;
    public final int c;

    static {
        Util.E(0);
        Util.E(1);
    }

    public PlaybackParameters(float f, float f2) {
        Assertions.b(f > BitmapDescriptorFactory.HUE_RED);
        Assertions.b(f2 > BitmapDescriptorFactory.HUE_RED);
        this.f2871a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PlaybackParameters.class == obj.getClass()) {
            PlaybackParameters playbackParameters = (PlaybackParameters) obj;
            if (this.f2871a == playbackParameters.f2871a && this.b == playbackParameters.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.f2871a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f2871a), Float.valueOf(this.b)};
        int i = Util.f2928a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
