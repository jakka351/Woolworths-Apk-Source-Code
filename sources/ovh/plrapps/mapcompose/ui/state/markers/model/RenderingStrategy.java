package ovh.plrapps.mapcompose.ui.state.markers.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lovh/plrapps/mapcompose/ui/state/markers/model/RenderingStrategy;", "", "Clustering", "Default", "LazyLoading", "Lovh/plrapps/mapcompose/ui/state/markers/model/RenderingStrategy$Clustering;", "Lovh/plrapps/mapcompose/ui/state/markers/model/RenderingStrategy$Default;", "Lovh/plrapps/mapcompose/ui/state/markers/model/RenderingStrategy$LazyLoading;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface RenderingStrategy {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/state/markers/model/RenderingStrategy$Clustering;", "Lovh/plrapps/mapcompose/ui/state/markers/model/RenderingStrategy;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Clustering implements RenderingStrategy {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Clustering);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Clustering(clustererId=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/state/markers/model/RenderingStrategy$Default;", "Lovh/plrapps/mapcompose/ui/state/markers/model/RenderingStrategy;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Default implements RenderingStrategy {

        /* renamed from: a, reason: collision with root package name */
        public static final Default f26965a = new Default();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Default);
        }

        public final int hashCode() {
            return 887573670;
        }

        public final String toString() {
            return "Default";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/state/markers/model/RenderingStrategy$LazyLoading;", "Lovh/plrapps/mapcompose/ui/state/markers/model/RenderingStrategy;", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LazyLoading implements RenderingStrategy {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LazyLoading);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "LazyLoading(lazyLoaderId=null)";
        }
    }
}
