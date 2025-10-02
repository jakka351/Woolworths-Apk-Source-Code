package androidx.compose.material3.carousel;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/carousel/ShiftPointRange;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class ShiftPointRange {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShiftPointRange) && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(BitmapDescriptorFactory.HUE_RED) + b.a(0, Integer.hashCode(0) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShiftPointRange(fromStepIndex=");
        sb.append(0);
        sb.append(", toStepIndex=");
        sb.append(0);
        sb.append(", steppedInterpolation=");
        return a.r(sb, BitmapDescriptorFactory.HUE_RED, ')');
    }
}
