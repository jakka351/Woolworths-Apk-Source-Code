package me.oriient.internal.services.dataManager.common;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.services.dataManager.building.E;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002FGB1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0016\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000J\u001c\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\u001e\u001a\u00020\u0005J\u0013\u0010\u001f\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\"\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001dJ\"\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\"2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0005J\u001c\u0010&\u001a\u0004\u0018\u00010'2\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u001d0\u001dJ\t\u0010)\u001a\u00020\u0003HÖ\u0001J@\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0005H\u0002J \u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0005H\u0002J(\u00104\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\b\b\u0002\u00105\u001a\u00020\u001b2\b\b\u0002\u00106\u001a\u00020\u0005J \u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0005H\u0002J\u000e\u0010:\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0000J\t\u0010<\u001a\u00020=HÖ\u0001J&\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DHÁ\u0001¢\u0006\u0002\bER\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006H"}, d2 = {"Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "", "seen1", "", "x", "", "y", "z", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DDD)V", "getX", "()D", "getY", "getZ", "closestPointOnSegment", "p1", "p2", "component1", "component2", "component3", "copy", "distanceToInterval", "start", "end", "doesIntersectWithPolygon", "", "polygon", "", "radiusMeters", "equals", "other", "findClosestPoint", "Lkotlin/Pair;", "findClosestPointOnCircle", "center", "radius", "findClosestPolygon", "Lme/oriient/internal/services/dataManager/common/FindPolygonResult;", "polygons", "hashCode", "isLineIntersectingCircle", "startPointX", "startPointY", "endPointX", "endPointY", "circleCenterX", "circleCenterY", "circleRadius", "isPointInsideCircle", "point", "isPointInsidePolygon", "includePointOnEdges", "precision", "isPointOnEdge", "vertex1", "vertex2", "plainDistanceTo", "to", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class IndoorCoordinate {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final double x;
    private final double y;
    private final double z;

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J&\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u001e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010HÆ\u0001¨\u0006\u0011"}, d2 = {"Lme/oriient/internal/services/dataManager/common/IndoorCoordinate$Companion;", "", "()V", "angleBetweenVectors", "", "start1", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "end1", "start2", "end2", "angleBetweenVectorsFromPiToMinusPiDegrees", "getPointOnInterval", "from", "to", "maxDistanceFromStart", "serializer", "Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final double angleBetweenVectors(@NotNull IndoorCoordinate start1, @NotNull IndoorCoordinate end1, @NotNull IndoorCoordinate start2, @NotNull IndoorCoordinate end2) {
            Intrinsics.h(start1, "start1");
            Intrinsics.h(end1, "end1");
            Intrinsics.h(start2, "start2");
            Intrinsics.h(end2, "end2");
            double x = end1.getX() - start1.getX();
            double y = end1.getY() - start1.getY();
            return Math.atan2(end2.getY() - start2.getY(), end2.getX() - start2.getX()) - Math.atan2(y, x);
        }

        public final double angleBetweenVectorsFromPiToMinusPiDegrees(@NotNull IndoorCoordinate start1, @NotNull IndoorCoordinate end1, @NotNull IndoorCoordinate start2, @NotNull IndoorCoordinate end2) {
            Intrinsics.h(start1, "start1");
            Intrinsics.h(end1, "end1");
            Intrinsics.h(start2, "start2");
            Intrinsics.h(end2, "end2");
            double dAngleBetweenVectors = angleBetweenVectors(start1, end1, start2, end2);
            if (dAngleBetweenVectors > 3.141592653589793d) {
                dAngleBetweenVectors -= 6.283185307179586d;
            } else if (dAngleBetweenVectors < -3.141592653589793d) {
                dAngleBetweenVectors += 6.283185307179586d;
            }
            return Math.toDegrees(dAngleBetweenVectors);
        }

        @NotNull
        public final IndoorCoordinate getPointOnInterval(@NotNull IndoorCoordinate from, @NotNull IndoorCoordinate to, double maxDistanceFromStart) {
            Intrinsics.h(from, "from");
            Intrinsics.h(to, "to");
            double dPlainDistanceTo = from.plainDistanceTo(to);
            if (dPlainDistanceTo < maxDistanceFromStart || dPlainDistanceTo < 1.0E-4d) {
                return to;
            }
            double d = maxDistanceFromStart / dPlainDistanceTo;
            return new IndoorCoordinate(from.getX() + ((to.getX() - from.getX()) * d), from.getY() + ((to.getY() - from.getY()) * d), from.getZ());
        }

        @NotNull
        public final KSerializer<IndoorCoordinate> serializer() {
            return IndoorCoordinate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public IndoorCoordinate(double d, double d2, double d3) {
        this.x = d;
        this.y = d2;
        this.z = d3;
    }

    public static /* synthetic */ IndoorCoordinate copy$default(IndoorCoordinate indoorCoordinate, double d, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = indoorCoordinate.x;
        }
        double d4 = d;
        if ((i & 2) != 0) {
            d2 = indoorCoordinate.y;
        }
        double d5 = d2;
        if ((i & 4) != 0) {
            d3 = indoorCoordinate.z;
        }
        return indoorCoordinate.copy(d4, d5, d3);
    }

    private final boolean isLineIntersectingCircle(double startPointX, double startPointY, double endPointX, double endPointY, double circleCenterX, double circleCenterY, double circleRadius) {
        double d = endPointX - startPointX;
        double d2 = endPointY - startPointY;
        double d3 = startPointX - circleCenterX;
        double d4 = startPointY - circleCenterY;
        double d5 = (d2 * d2) + (d * d);
        double d6 = 2;
        double d7 = ((d2 * d4) + (d * d3)) * d6;
        double d8 = (d7 * d7) - ((4 * d5) * (((d4 * d4) + (d3 * d3)) - (circleRadius * circleRadius)));
        if (d8 < 0.0d) {
            return false;
        }
        double d9 = -d7;
        double d10 = d6 * d5;
        double dSqrt = (d9 - Math.sqrt(d8)) / d10;
        double dSqrt2 = (Math.sqrt(d8) + d9) / d10;
        if (0.0d > dSqrt || dSqrt > 1.0d) {
            return 0.0d <= dSqrt2 && dSqrt2 <= 1.0d;
        }
        return true;
    }

    private final boolean isPointInsideCircle(IndoorCoordinate point, IndoorCoordinate center, double radius) {
        return point.plainDistanceTo(center) <= radius;
    }

    public static /* synthetic */ boolean isPointInsidePolygon$default(IndoorCoordinate indoorCoordinate, List list, boolean z, double d, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            d = 1.0E-6d;
        }
        return indoorCoordinate.isPointInsidePolygon(list, z, d);
    }

    private final boolean isPointOnEdge(IndoorCoordinate vertex1, IndoorCoordinate vertex2, double precision) {
        double dMin = Math.min(vertex1.x, vertex2.x);
        double dMax = Math.max(vertex1.x, vertex2.x);
        double dMin2 = Math.min(vertex1.y, vertex2.y);
        double dMax2 = Math.max(vertex1.y, vertex2.y);
        double d = vertex1.x;
        double d2 = vertex2.x;
        if (d == d2) {
            return this.x == d && RangesKt.i(dMin2, dMax2).contains(Double.valueOf(this.y));
        }
        double d3 = vertex1.y;
        double d4 = vertex2.y;
        return d3 == d4 ? this.y == d3 && RangesKt.i(dMin, dMax).contains(Double.valueOf(this.x)) : Math.abs(((d4 - d3) / (d2 - d)) - ((this.y - d3) / (this.x - d))) < precision && RangesKt.i(dMin, dMax).contains(Double.valueOf(this.x)) && RangesKt.i(dMin2, dMax2).contains(Double.valueOf(this.y));
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(IndoorCoordinate self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.G(serialDesc, 0, self.x);
        output.G(serialDesc, 1, self.y);
        if (!output.q(serialDesc, 2) && Double.compare(self.z, 0.0d) == 0) {
            return;
        }
        output.G(serialDesc, 2, self.z);
    }

    @NotNull
    public final IndoorCoordinate closestPointOnSegment(@NotNull IndoorCoordinate p1, @NotNull IndoorCoordinate p2) {
        Intrinsics.h(p1, "p1");
        Intrinsics.h(p2, "p2");
        double d = p2.x;
        double d2 = p1.x;
        double d3 = d - d2;
        double d4 = p2.y;
        double d5 = p1.y;
        double d6 = d4 - d5;
        if (d3 == 0.0d && d6 == 0.0d) {
            return p1;
        }
        double dMax = Math.max(0.0d, Math.min(1.0d, (((this.y - d5) * d6) + ((this.x - d2) * d3)) / ((d6 * d6) + (d3 * d3))));
        return new IndoorCoordinate((d3 * dMax) + p1.x, (dMax * d6) + p1.y, 0.0d, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: component1, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final double getY() {
        return this.y;
    }

    /* renamed from: component3, reason: from getter */
    public final double getZ() {
        return this.z;
    }

    @NotNull
    public final IndoorCoordinate copy(double x, double y, double z) {
        return new IndoorCoordinate(x, y, z);
    }

    public final double distanceToInterval(@NotNull IndoorCoordinate start, @NotNull IndoorCoordinate end) {
        Intrinsics.h(start, "start");
        Intrinsics.h(end, "end");
        double dPlainDistanceTo = start.plainDistanceTo(end);
        if (dPlainDistanceTo <= 9.999999747378752E-6d) {
            return start.plainDistanceTo(this);
        }
        Companion companion = INSTANCE;
        double dAbs = Math.abs(companion.angleBetweenVectors(start, end, start, this));
        if (dAbs > 1.5707963267948966d && dAbs < 4.71238898038469d) {
            return start.plainDistanceTo(this);
        }
        double dAbs2 = Math.abs(companion.angleBetweenVectors(end, start, end, this));
        if (dAbs2 > 1.5707963267948966d && dAbs2 < 4.71238898038469d) {
            return end.plainDistanceTo(this);
        }
        double d = (end.y - start.y) * this.x;
        double d2 = end.x;
        double d3 = start.x;
        return ((float) Math.abs(((d2 * r6) + (d - ((d2 - d3) * this.y))) - (r4 * d3))) / dPlainDistanceTo;
    }

    public final boolean doesIntersectWithPolygon(@NotNull List<IndoorCoordinate> polygon, double radiusMeters) {
        Intrinsics.h(polygon, "polygon");
        if (isPointInsidePolygon$default(this, polygon, true, 0.0d, 4, null)) {
            return true;
        }
        int size = polygon.size();
        int i = 0;
        while (i < size) {
            IndoorCoordinate indoorCoordinate = polygon.get(i);
            int i2 = i + 1;
            IndoorCoordinate indoorCoordinate2 = polygon.get(i2 % polygon.size());
            int i3 = size;
            if (isLineIntersectingCircle(indoorCoordinate.x, indoorCoordinate.y, indoorCoordinate2.x, indoorCoordinate2.y, this.x, this.y, radiusMeters)) {
                return true;
            }
            i = i2;
            size = i3;
        }
        int size2 = polygon.size();
        for (int i4 = 0; i4 < size2; i4++) {
            if (isPointInsideCircle(polygon.get(i4), this, radiusMeters)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndoorCoordinate)) {
            return false;
        }
        IndoorCoordinate indoorCoordinate = (IndoorCoordinate) other;
        return Double.compare(this.x, indoorCoordinate.x) == 0 && Double.compare(this.y, indoorCoordinate.y) == 0 && Double.compare(this.z, indoorCoordinate.z) == 0;
    }

    @Nullable
    public final Pair<IndoorCoordinate, Double> findClosestPoint(@NotNull List<IndoorCoordinate> polygon) {
        Intrinsics.h(polygon, "polygon");
        if (polygon.size() <= 2) {
            return null;
        }
        int i = 0;
        IndoorCoordinate indoorCoordinate = polygon.get(0);
        double dPlainDistanceTo = plainDistanceTo(indoorCoordinate);
        int size = polygon.size();
        while (i < size) {
            IndoorCoordinate indoorCoordinate2 = polygon.get(i);
            i++;
            IndoorCoordinate indoorCoordinateClosestPointOnSegment = closestPointOnSegment(indoorCoordinate2, polygon.get(i % polygon.size()));
            double dPlainDistanceTo2 = plainDistanceTo(indoorCoordinateClosestPointOnSegment);
            if (dPlainDistanceTo2 < dPlainDistanceTo) {
                indoorCoordinate = indoorCoordinateClosestPointOnSegment;
                dPlainDistanceTo = dPlainDistanceTo2;
            }
        }
        return new Pair<>(indoorCoordinate, Double.valueOf(dPlainDistanceTo));
    }

    @NotNull
    public final Pair<IndoorCoordinate, Double> findClosestPointOnCircle(@NotNull IndoorCoordinate center, double radius) {
        Intrinsics.h(center, "center");
        double d = this.x - center.x;
        double d2 = this.y - center.y;
        double dHypot = Math.hypot(d, d2);
        if (dHypot == 0.0d) {
            return new Pair<>(new IndoorCoordinate(center.x + radius, center.y, 0.0d, 4, (DefaultConstructorMarker) null), Double.valueOf(radius));
        }
        double d3 = radius / dHypot;
        return new Pair<>(new IndoorCoordinate((d * d3) + center.x, (d2 * d3) + center.y, 0.0d, 4, (DefaultConstructorMarker) null), Double.valueOf(Math.abs(dHypot - radius)));
    }

    @Nullable
    public final FindPolygonResult findClosestPolygon(@NotNull List<? extends List<IndoorCoordinate>> polygons) {
        Intrinsics.h(polygons, "polygons");
        double d = Double.MAX_VALUE;
        List<IndoorCoordinate> list = null;
        IndoorCoordinate indoorCoordinate = null;
        for (List<IndoorCoordinate> list2 : polygons) {
            Pair<IndoorCoordinate, Double> pairFindClosestPoint = findClosestPoint(list2);
            if (pairFindClosestPoint != null) {
                IndoorCoordinate indoorCoordinate2 = (IndoorCoordinate) pairFindClosestPoint.d;
                double dDoubleValue = ((Number) pairFindClosestPoint.e).doubleValue();
                if (dDoubleValue < d) {
                    list = list2;
                    indoorCoordinate = indoorCoordinate2;
                    d = dDoubleValue;
                }
            }
        }
        if (list == null || indoorCoordinate == null) {
            return null;
        }
        return new FindPolygonResult(list, indoorCoordinate, d);
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public final double getZ() {
        return this.z;
    }

    public int hashCode() {
        return Double.hashCode(this.z) + J.a(this.y, Double.hashCode(this.x) * 31, 31);
    }

    public final boolean isPointInsidePolygon(@NotNull List<IndoorCoordinate> polygon, boolean includePointOnEdges, double precision) {
        IndoorCoordinate indoorCoordinate = this;
        List<IndoorCoordinate> polygon2 = polygon;
        Intrinsics.h(polygon2, "polygon");
        int size = polygon2.size() - 1;
        int size2 = polygon2.size();
        boolean z = false;
        int i = size;
        int i2 = 0;
        while (i2 < size2) {
            IndoorCoordinate indoorCoordinate2 = polygon2.get(i2);
            IndoorCoordinate indoorCoordinate3 = polygon2.get(i);
            if (indoorCoordinate.isPointOnEdge(indoorCoordinate2, indoorCoordinate3, precision)) {
                return includePointOnEdges;
            }
            double d = indoorCoordinate2.y;
            double d2 = indoorCoordinate.y;
            if ((d < d2 && indoorCoordinate3.y >= d2) || (indoorCoordinate3.y < d2 && d >= d2)) {
                double d3 = indoorCoordinate.x;
                double d4 = indoorCoordinate2.x;
                if (d3 < (((indoorCoordinate3.x - d4) * (d2 - d)) / (indoorCoordinate3.y - d)) + d4) {
                    z = !z;
                }
            }
            polygon2 = polygon;
            i = i2;
            i2++;
            indoorCoordinate = this;
        }
        return z;
    }

    public final double plainDistanceTo(@NotNull IndoorCoordinate to) {
        Intrinsics.h(to, "to");
        double d = 2;
        return Math.sqrt(Math.pow(this.y - to.y, d) + Math.pow(this.x - to.x, d));
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("IndoorCoordinate(x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", z=");
        return E.a(sb, this.z, ')');
    }

    @Deprecated
    public /* synthetic */ IndoorCoordinate(int i, double d, double d2, double d3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, IndoorCoordinate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.x = d;
        this.y = d2;
        if ((i & 4) == 0) {
            this.z = 0.0d;
        } else {
            this.z = d3;
        }
    }

    public /* synthetic */ IndoorCoordinate(double d, double d2, double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i & 4) != 0 ? 0.0d : d3);
    }
}
