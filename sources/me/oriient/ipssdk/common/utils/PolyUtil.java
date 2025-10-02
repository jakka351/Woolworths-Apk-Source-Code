package me.oriient.ipssdk.common.utils;

import com.salesforce.marketingcloud.storage.db.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.api.models.IPSGlobalCoordinate;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, d2 = {"Lme/oriient/ipssdk/common/utils/PolyUtil;", "", "", "n", "min", "max", "wrap", "(DDD)D", "x", "m", "mod", "(DD)D", "lat", "mercator", "(D)D", "Lme/oriient/ipssdk/api/models/IPSGlobalCoordinate;", "point", "", "polygon", "", "geodesic", "containsLocation", "(Lme/oriient/ipssdk/api/models/IPSGlobalCoordinate;Ljava/util/List;Z)Z", h.a.b, h.a.c, "(DDLjava/util/List;Z)Z", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PolyUtil {

    @NotNull
    public static final PolyUtil INSTANCE = new PolyUtil();

    private PolyUtil() {
    }

    public final boolean containsLocation(@NotNull IPSGlobalCoordinate point, @NotNull List<? extends IPSGlobalCoordinate> polygon, boolean geodesic) {
        Intrinsics.h(point, "point");
        Intrinsics.h(polygon, "polygon");
        return containsLocation(point.getLatitude(), point.getLongitude(), polygon, geodesic);
    }

    public final double mercator(double lat) {
        return Math.log(Math.tan((lat * 0.5d) + 0.7853981633974483d));
    }

    public final double mod(double x, double m) {
        return ((x % m) + m) % m;
    }

    public final double wrap(double n, double min, double max) {
        return (n < min || n >= max) ? mod(n - min, max - min) + min : n;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsLocation(double r29, double r31, @org.jetbrains.annotations.NotNull java.util.List<? extends me.oriient.ipssdk.api.models.IPSGlobalCoordinate> r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.common.utils.PolyUtil.containsLocation(double, double, java.util.List, boolean):boolean");
    }
}
