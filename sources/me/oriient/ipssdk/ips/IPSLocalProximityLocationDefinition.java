package me.oriient.ipssdk.ips;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.ipssdk.api.models.IPSCircularShape;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import me.oriient.ipssdk.api.models.IPSPolygonalShape;
import me.oriient.ipssdk.api.models.IPSRectangularShape;
import me.oriient.ipssdk.api.models.IPSRegion;
import me.oriient.ipssdk.api.models.IPSRegionPlacement;
import me.oriient.ipssdk.api.models.IPSShape;
import me.oriient.ipssdk.realtime.ips.BuildingExtKt;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityLocationDefinition;
import me.oriient.ipssdk.realtime.ips.proximity.local.PointProximityEventAreaRadius;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lme/oriient/ipssdk/ips/IPSLocalProximityLocationDefinition;", "", "locationDefinition", "Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition;", "(Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition;)V", "getLocationDefinition$me_oriient_sdk_realtime", "()Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityLocationDefinition;", "toString", "", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IPSLocalProximityLocationDefinition {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final LocalProximityLocationDefinition locationDefinition;

    @Keep
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006¨\u0006\u0016"}, d2 = {"Lme/oriient/ipssdk/ips/IPSLocalProximityLocationDefinition$Companion;", "", "()V", "areaCircle", "Lme/oriient/ipssdk/ips/IPSLocalProximityLocationDefinition;", "center", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "radiusMeters", "", "areaPolygon", "vertices", "", "areaRectangle", "topRight", "bottomLeft", "closeWalkingDistance", "from", "fromIpsRegion", "ipsRegion", "Lme/oriient/ipssdk/api/models/IPSRegion;", "longWalkingDistance", "mediumWalkingDistance", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IPSLocalProximityLocationDefinition areaCircle(@NotNull IPSCoordinate center, double radiusMeters) {
            Intrinsics.h(center, "center");
            return new IPSLocalProximityLocationDefinition(new LocalProximityLocationDefinition.AreaCircle(center, radiusMeters));
        }

        @NotNull
        public final IPSLocalProximityLocationDefinition areaPolygon(@NotNull List<? extends IPSCoordinate> vertices) {
            Intrinsics.h(vertices, "vertices");
            ArrayList arrayList = new ArrayList(CollectionsKt.s(vertices, 10));
            Iterator<T> it = vertices.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildingExtKt.toIndoorCoordinate((IPSCoordinate) it.next()));
            }
            return new IPSLocalProximityLocationDefinition(new LocalProximityLocationDefinition.AreaPolygon(arrayList));
        }

        @NotNull
        public final IPSLocalProximityLocationDefinition areaRectangle(@NotNull IPSCoordinate topRight, @NotNull IPSCoordinate bottomLeft) {
            Intrinsics.h(topRight, "topRight");
            Intrinsics.h(bottomLeft, "bottomLeft");
            return new IPSLocalProximityLocationDefinition(new LocalProximityLocationDefinition.AreaRectangle(topRight, bottomLeft));
        }

        @NotNull
        public final IPSLocalProximityLocationDefinition closeWalkingDistance(@NotNull IPSCoordinate from) {
            Intrinsics.h(from, "from");
            return new IPSLocalProximityLocationDefinition(new LocalProximityLocationDefinition.WalkingDistance(from, PointProximityEventAreaRadius.SMALL));
        }

        @Nullable
        public final IPSLocalProximityLocationDefinition fromIpsRegion(@NotNull IPSRegion ipsRegion) {
            Intrinsics.h(ipsRegion, "ipsRegion");
            List<? extends IPSRegionPlacement> placements = ipsRegion.getPlacements();
            Intrinsics.g(placements, "getPlacements(...)");
            IPSRegionPlacement iPSRegionPlacement = (IPSRegionPlacement) CollectionsKt.F(placements);
            if (iPSRegionPlacement == null) {
                return null;
            }
            IPSShape shape = iPSRegionPlacement.getShape();
            Intrinsics.g(shape, "getShape(...)");
            if (shape instanceof IPSCircularShape) {
                IPSCircularShape iPSCircularShape = (IPSCircularShape) shape;
                IPSCoordinate center = iPSCircularShape.getCenter();
                Intrinsics.g(center, "getCenter(...)");
                return areaCircle(center, iPSCircularShape.getRadiusMeters());
            }
            if (!(shape instanceof IPSRectangularShape)) {
                if (!(shape instanceof IPSPolygonalShape)) {
                    return null;
                }
                List<IPSCoordinate> points = ((IPSPolygonalShape) shape).getPoints();
                Intrinsics.g(points, "getPoints(...)");
                return areaPolygon(points);
            }
            IPSRectangularShape iPSRectangularShape = (IPSRectangularShape) shape;
            IPSCoordinate topRight = iPSRectangularShape.getF26201a();
            Intrinsics.g(topRight, "getTopRight(...)");
            IPSCoordinate bottomLeft = iPSRectangularShape.getB();
            Intrinsics.g(bottomLeft, "getBottomLeft(...)");
            return areaRectangle(topRight, bottomLeft);
        }

        @NotNull
        public final IPSLocalProximityLocationDefinition longWalkingDistance(@NotNull IPSCoordinate from) {
            Intrinsics.h(from, "from");
            return new IPSLocalProximityLocationDefinition(new LocalProximityLocationDefinition.WalkingDistance(from, PointProximityEventAreaRadius.LARGE));
        }

        @NotNull
        public final IPSLocalProximityLocationDefinition mediumWalkingDistance(@NotNull IPSCoordinate from) {
            Intrinsics.h(from, "from");
            return new IPSLocalProximityLocationDefinition(new LocalProximityLocationDefinition.WalkingDistance(from, PointProximityEventAreaRadius.MEDIUM));
        }

        private Companion() {
        }
    }

    public IPSLocalProximityLocationDefinition(@NotNull LocalProximityLocationDefinition locationDefinition) {
        Intrinsics.h(locationDefinition, "locationDefinition");
        this.locationDefinition = locationDefinition;
    }

    @NotNull
    /* renamed from: getLocationDefinition$me_oriient_sdk_realtime, reason: from getter */
    public final LocalProximityLocationDefinition getLocationDefinition() {
        return this.locationDefinition;
    }

    @NotNull
    public String toString() {
        return "IPSLocalProximityLocationDefinition(locationDefinition=" + this.locationDefinition + ')';
    }
}
