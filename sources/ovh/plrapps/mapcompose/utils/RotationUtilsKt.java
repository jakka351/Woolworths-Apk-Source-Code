package ovh.plrapps.mapcompose.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003*\n\u0010\u0001\"\u00020\u00002\u00020\u0000*\n\u0010\u0002\"\u00020\u00002\u00020\u0000¨\u0006\u0003"}, d2 = {"", "AngleDegree", "AngleRad", "mapcompose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class RotationUtilsKt {
    public static final double a(double d, double d2, double d3, double d4, float f) {
        double d5 = f;
        return (((d - d3) * ((float) Math.cos(d5))) + d3) - ((d2 - d4) * ((float) Math.sin(d5)));
    }

    public static final double b(double d, double d2, double d3, double d4, float f) {
        double d5 = d - d3;
        double d6 = f;
        return ((d2 - d4) * ((float) Math.cos(d6))) + (d5 * ((float) Math.sin(d6))) + d4;
    }

    public static final double c(double d, double d2, float f) {
        double d3 = f;
        return (d * ((float) Math.cos(d3))) - (d2 * ((float) Math.sin(d3)));
    }

    public static final double d(double d, double d2, float f) {
        double d3 = f;
        return (d2 * ((float) Math.cos(d3))) + (d * ((float) Math.sin(d3)));
    }
}
