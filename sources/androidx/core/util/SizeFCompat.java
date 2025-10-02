package androidx.core.util;

import androidx.annotation.RequiresApi;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class SizeFCompat {

    @RequiresApi
    public static final class Api21Impl {
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SizeFCompat);
    }

    public final int hashCode() {
        return Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) ^ Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED);
    }

    public final String toString() {
        return "0.0x0.0";
    }
}
