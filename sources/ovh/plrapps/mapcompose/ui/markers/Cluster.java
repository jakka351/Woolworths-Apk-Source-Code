package ovh.plrapps.mapcompose.ui.markers;

import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/markers/Cluster;", "Lovh/plrapps/mapcompose/ui/markers/Placeable;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
final /* data */ class Cluster implements Placeable {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Cluster) && Double.compare(0.0d, 0.0d) == 0 && Double.compare(0.0d, 0.0d) == 0) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbN = a.n(0.0d, "Cluster(clusterIdPrefix=null, x=", ", y=");
        sbN.append(0.0d);
        sbN.append(", markers=");
        sbN.append((Object) null);
        sbN.append(")");
        return sbN.toString();
    }
}
