package me.oriient.ipssdk.realtime.utils;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSCoordinate;
import me.oriient.ipssdk.realtime.utils.models.Coordinate;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lme/oriient/ipssdk/realtime/utils/MathUtils;", "", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "c1", "c2", "", "plainDistance", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/api/models/IPSCoordinate;)D", "start1", "end1", "start2", "end2", "", "angleBetweenVectors", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/api/models/IPSCoordinate;)F", "point", "start", "end", "distanceFromPointToInterval", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/api/models/IPSCoordinate;)D", "maxDistanceFromStart", "getPointOnInterval", "(Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/api/models/IPSCoordinate;F)Lme/oriient/ipssdk/api/models/IPSCoordinate;", "vectorDistance", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MathUtils {

    @NotNull
    public static final MathUtils INSTANCE = new MathUtils();

    private MathUtils() {
    }

    @JvmStatic
    public static final float angleBetweenVectors(@NotNull IPSCoordinate start1, @NotNull IPSCoordinate end1, @NotNull IPSCoordinate start2, @NotNull IPSCoordinate end2) {
        Intrinsics.h(start1, "start1");
        Intrinsics.h(end1, "end1");
        Intrinsics.h(start2, "start2");
        Intrinsics.h(end2, "end2");
        double x = end1.getX() - start1.getX();
        double y = end1.getY() - start1.getY();
        return (float) (Math.atan2(end2.getY() - start2.getY(), end2.getX() - start2.getX()) - Math.atan2(y, x));
    }

    @JvmStatic
    public static final double distanceFromPointToInterval(@NotNull IPSCoordinate point, @NotNull IPSCoordinate start, @NotNull IPSCoordinate end) {
        Intrinsics.h(point, "point");
        Intrinsics.h(start, "start");
        Intrinsics.h(end, "end");
        double dPlainDistance = plainDistance(start, end);
        if (dPlainDistance <= 9.999999747378752E-6d) {
            return plainDistance(start, point);
        }
        double dAbs = Math.abs(angleBetweenVectors(start, end, start, point));
        if (dAbs > 1.5707963267948966d && dAbs < 4.71238898038469d) {
            return plainDistance(start, point);
        }
        double dAbs2 = Math.abs(angleBetweenVectors(end, start, end, point));
        if (dAbs2 > 1.5707963267948966d && dAbs2 < 4.71238898038469d) {
            return plainDistance(end, point);
        }
        return Math.abs(((start.getY() * end.getX()) + ((point.getX() * (end.getY() - start.getY())) - (point.getY() * (end.getX() - start.getX())))) - (start.getX() * end.getY())) / dPlainDistance;
    }

    @JvmStatic
    @NotNull
    public static final IPSCoordinate getPointOnInterval(@NotNull IPSCoordinate start, @NotNull IPSCoordinate end, float maxDistanceFromStart) {
        Intrinsics.h(start, "start");
        Intrinsics.h(end, "end");
        double dPlainDistance = plainDistance(start, end);
        double d = maxDistanceFromStart;
        if (dPlainDistance < d || dPlainDistance < 1.0E-4d) {
            return end;
        }
        double d2 = d / dPlainDistance;
        return new Coordinate(((end.getX() - start.getX()) * d2) + start.getX(), ((end.getY() - start.getY()) * d2) + start.getY(), start.getZ());
    }

    @JvmStatic
    public static final double plainDistance(@NotNull IPSCoordinate c1, @NotNull IPSCoordinate c2) {
        Intrinsics.h(c1, "c1");
        Intrinsics.h(c2, "c2");
        return Math.sqrt(Math.pow(c1.getY() - c2.getY(), 2.0d) + Math.pow(c1.getX() - c2.getX(), 2.0d));
    }

    public final double vectorDistance(@NotNull IPSCoordinate c1, @NotNull IPSCoordinate c2) {
        Intrinsics.h(c1, "c1");
        Intrinsics.h(c2, "c2");
        return Math.sqrt(Math.pow(c1.getZ() - c2.getZ(), 2.0d) + plainDistance(c1, c2));
    }
}
