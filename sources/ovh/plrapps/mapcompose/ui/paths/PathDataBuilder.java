package ovh.plrapps.mapcompose.ui.paths;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import ovh.plrapps.mapcompose.utils.Point;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/ui/paths/PathDataBuilder;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PathDataBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final int f26949a;
    public final int b;
    public final ArrayList c = new ArrayList();
    public Double d;
    public Double e;
    public Double f;
    public Double g;

    public PathDataBuilder(int i, int i2) {
        this.f26949a = i;
        this.b = i2;
    }

    public final Point a(double d, double d2) {
        Double dValueOf;
        Double dValueOf2;
        double d3 = d * this.f26949a;
        double d4 = d2 * this.b;
        Point point = new Point(d3, d4);
        Double d5 = this.d;
        if (d5 != null) {
            double dDoubleValue = d5.doubleValue();
            if (dDoubleValue > d3) {
                dDoubleValue = d3;
            }
            dValueOf = Double.valueOf(dDoubleValue);
        } else {
            dValueOf = Double.valueOf(d3);
        }
        this.d = dValueOf;
        Double d6 = this.e;
        if (d6 != null) {
            double dDoubleValue2 = d6.doubleValue();
            if (dDoubleValue2 >= d3) {
                d3 = dDoubleValue2;
            }
        }
        this.e = Double.valueOf(d3);
        Double d7 = this.f;
        if (d7 != null) {
            double dDoubleValue3 = d7.doubleValue();
            if (dDoubleValue3 > d4) {
                dDoubleValue3 = d4;
            }
            dValueOf2 = Double.valueOf(dDoubleValue3);
        } else {
            dValueOf2 = Double.valueOf(d4);
        }
        this.f = dValueOf2;
        Double d8 = this.g;
        if (d8 != null) {
            double dDoubleValue4 = d8.doubleValue();
            if (dDoubleValue4 >= d4) {
                d4 = dDoubleValue4;
            }
        }
        this.g = Double.valueOf(d4);
        return point;
    }
}
