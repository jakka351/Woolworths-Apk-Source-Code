package ovh.plrapps.mapcompose.api;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lovh/plrapps/mapcompose/api/ClusterScaleThreshold;", "", "FixedScale", "MaxScale", "Lovh/plrapps/mapcompose/api/ClusterScaleThreshold$FixedScale;", "Lovh/plrapps/mapcompose/api/ClusterScaleThreshold$MaxScale;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ClusterScaleThreshold {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/api/ClusterScaleThreshold$FixedScale;", "Lovh/plrapps/mapcompose/api/ClusterScaleThreshold;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FixedScale implements ClusterScaleThreshold {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FixedScale) && Double.compare(0.0d, 0.0d) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(0.0d);
        }

        public final String toString() {
            return "FixedScale(scale=0.0)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/api/ClusterScaleThreshold$MaxScale;", "Lovh/plrapps/mapcompose/api/ClusterScaleThreshold;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MaxScale implements ClusterScaleThreshold {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MaxScale);
        }

        public final int hashCode() {
            return -1962429966;
        }

        public final String toString() {
            return "MaxScale";
        }
    }
}
