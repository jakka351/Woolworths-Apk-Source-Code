package androidx.compose.ui.geometry;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final /* data */ class RoundRect {

    /* renamed from: a, reason: collision with root package name */
    public final float f1753a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        RoundRectKt.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L);
    }

    public RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f1753a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.f1753a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) obj;
        return Float.compare(this.f1753a, roundRect.f1753a) == 0 && Float.compare(this.b, roundRect.b) == 0 && Float.compare(this.c, roundRect.c) == 0 && Float.compare(this.d, roundRect.d) == 0 && CornerRadius.a(this.e, roundRect.e) && CornerRadius.a(this.f, roundRect.f) && CornerRadius.a(this.g, roundRect.g) && CornerRadius.a(this.h, roundRect.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + b.b(b.b(b.b(a.b(this.d, a.b(this.c, a.b(this.b, Float.hashCode(this.f1753a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str = GeometryUtilsKt.a(this.f1753a) + ", " + GeometryUtilsKt.a(this.b) + ", " + GeometryUtilsKt.a(this.c) + ", " + GeometryUtilsKt.a(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean zA = CornerRadius.a(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!zA || !CornerRadius.a(j2, j3) || !CornerRadius.a(j3, j4)) {
            StringBuilder sbU = YU.a.u("RoundRect(rect=", str, ", topLeft=");
            sbU.append((Object) CornerRadius.b(j));
            sbU.append(", topRight=");
            sbU.append((Object) CornerRadius.b(j2));
            sbU.append(", bottomRight=");
            sbU.append((Object) CornerRadius.b(j3));
            sbU.append(", bottomLeft=");
            sbU.append((Object) CornerRadius.b(j4));
            sbU.append(')');
            return sbU.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sbU2 = YU.a.u("RoundRect(rect=", str, ", radius=");
            sbU2.append(GeometryUtilsKt.a(Float.intBitsToFloat(i)));
            sbU2.append(')');
            return sbU2.toString();
        }
        StringBuilder sbU3 = YU.a.u("RoundRect(rect=", str, ", x=");
        sbU3.append(GeometryUtilsKt.a(Float.intBitsToFloat(i)));
        sbU3.append(", y=");
        sbU3.append(GeometryUtilsKt.a(Float.intBitsToFloat(i2)));
        sbU3.append(')');
        return sbU3.toString();
    }
}
