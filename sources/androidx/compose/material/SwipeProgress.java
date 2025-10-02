package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.compose.runtime.Immutable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/SwipeProgress;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
@Immutable
@ExperimentalMaterialApi
/* loaded from: classes2.dex */
public final class SwipeProgress<T> {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SwipeProgress) && Intrinsics.c(null, null) && Intrinsics.c(null, null) && BitmapDescriptorFactory.HUE_RED == BitmapDescriptorFactory.HUE_RED;
    }

    public final int hashCode() {
        return Float.hashCode(BitmapDescriptorFactory.HUE_RED) + (((0 * 31) + 0) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SwipeProgress(from=");
        sb.append((Object) null);
        sb.append(", to=");
        sb.append((Object) null);
        sb.append(", fraction=");
        return a.r(sb, BitmapDescriptorFactory.HUE_RED, ')');
    }
}
