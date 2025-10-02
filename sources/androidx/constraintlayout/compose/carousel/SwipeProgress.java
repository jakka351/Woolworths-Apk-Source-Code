package androidx.constraintlayout.compose.carousel;

import androidx.compose.runtime.Immutable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/constraintlayout/compose/carousel/SwipeProgress;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwipeProgress<T> {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SwipeProgress);
    }

    public final int hashCode() {
        return Float.hashCode(BitmapDescriptorFactory.HUE_RED);
    }

    public final String toString() {
        return "SwipeProgress(from=null, to=null, fraction=0.0)";
    }
}
