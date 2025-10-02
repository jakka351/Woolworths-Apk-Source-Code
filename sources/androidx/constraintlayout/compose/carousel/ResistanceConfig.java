package androidx.constraintlayout.compose.carousel;

import android.support.v4.media.session.a;
import androidx.compose.runtime.Immutable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/constraintlayout/compose/carousel/ResistanceConfig;", "", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResistanceConfig {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResistanceConfig) && BitmapDescriptorFactory.HUE_RED == BitmapDescriptorFactory.HUE_RED;
    }

    public final int hashCode() {
        return Float.hashCode(10.0f) + a.b(10.0f, Float.hashCode(BitmapDescriptorFactory.HUE_RED) * 31, 31);
    }

    public final String toString() {
        return a.j(BitmapDescriptorFactory.HUE_RED, ", factorAtMin=10.0, factorAtMax=10.0)", new StringBuilder("ResistanceConfig(basis="));
    }
}
