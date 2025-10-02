package androidx.media3.common;

import androidx.media3.common.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class StarRating extends Rating {
    static {
        Util.E(1);
        Util.E(2);
    }

    public final boolean equals(Object obj) {
        return obj instanceof StarRating;
    }

    public final int hashCode() {
        return Objects.hash(0, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
    }
}
