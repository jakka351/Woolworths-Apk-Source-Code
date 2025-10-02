package androidx.media3.common;

import androidx.media3.common.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class PercentageRating extends Rating {
    static {
        Util.E(1);
    }

    public final boolean equals(Object obj) {
        return obj instanceof PercentageRating;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(BitmapDescriptorFactory.HUE_RED));
    }
}
