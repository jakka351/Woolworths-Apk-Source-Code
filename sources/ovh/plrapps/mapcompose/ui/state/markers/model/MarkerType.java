package ovh.plrapps.mapcompose.ui.state.markers.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lovh/plrapps/mapcompose/ui/state/markers/model/MarkerType;", "", "Callout", "Cluster", "Marker", "Lovh/plrapps/mapcompose/ui/state/markers/model/MarkerType$Callout;", "Lovh/plrapps/mapcompose/ui/state/markers/model/MarkerType$Cluster;", "Lovh/plrapps/mapcompose/ui/state/markers/model/MarkerType$Marker;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface MarkerType {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/state/markers/model/MarkerType$Callout;", "Lovh/plrapps/mapcompose/ui/state/markers/model/MarkerType;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Callout implements MarkerType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Callout);
        }

        public final int hashCode() {
            return 1295911394;
        }

        public final String toString() {
            return "Callout";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/state/markers/model/MarkerType$Cluster;", "Lovh/plrapps/mapcompose/ui/state/markers/model/MarkerType;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Cluster implements MarkerType {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Cluster) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/state/markers/model/MarkerType$Marker;", "Lovh/plrapps/mapcompose/ui/state/markers/model/MarkerType;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Marker implements MarkerType {

        /* renamed from: a, reason: collision with root package name */
        public static final Marker f26964a = new Marker();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Marker);
        }

        public final int hashCode() {
            return 743914568;
        }

        public final String toString() {
            return "Marker";
        }
    }
}
