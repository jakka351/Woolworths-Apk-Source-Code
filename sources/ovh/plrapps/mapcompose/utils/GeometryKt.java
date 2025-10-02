package ovh.plrapps.mapcompose.utils;

import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mapcompose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GeometryKt {
    public static final double a(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d5 - d3;
        double d8 = d6 - d4;
        double d9 = (d8 * d8) + (d7 * d7);
        double d10 = d9 == 0.0d ? -1.0d : (((d2 - d4) * d8) + ((d - d3) * d7)) / d9;
        Pair pair = d10 < 0.0d ? new Pair(Double.valueOf(d3), Double.valueOf(d4)) : d10 > 1.0d ? new Pair(Double.valueOf(d5), Double.valueOf(d6)) : new Pair(Double.valueOf((d7 * d10) + d3), Double.valueOf((d10 * d8) + d4));
        return Math.hypot(d - ((Number) pair.d).doubleValue(), d2 - ((Number) pair.e).doubleValue());
    }
}
