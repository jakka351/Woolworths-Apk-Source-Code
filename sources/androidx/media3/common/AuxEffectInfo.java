package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

@UnstableApi
/* loaded from: classes2.dex */
public final class AuxEffectInfo {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuxEffectInfo.class != obj.getClass()) {
            return false;
        }
        return Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) + 16337;
    }
}
