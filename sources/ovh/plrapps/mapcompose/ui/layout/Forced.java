package ovh.plrapps.mapcompose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/layout/Forced;", "Lovh/plrapps/mapcompose/ui/layout/MinimumScaleMode;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Forced extends MinimumScaleMode {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Forced) && Double.compare(0.0d, 0.0d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(0.0d);
    }

    public final String toString() {
        return "Forced(scale=0.0)";
    }
}
