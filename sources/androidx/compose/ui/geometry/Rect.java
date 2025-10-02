package androidx.compose.ui.geometry;

import android.support.v4.media.session.a;
import androidx.compose.runtime.Immutable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final /* data */ class Rect {
    public static final Rect e = new Rect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* renamed from: a, reason: collision with root package name */
    public final float f1752a;
    public final float b;
    public final float c;
    public final float d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/geometry/Rect$Companion;", "", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public Rect(float f, float f2, float f3, float f4) {
        this.f1752a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static Rect b(Rect rect, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = rect.f1752a;
        }
        if ((i & 2) != 0) {
            f2 = rect.b;
        }
        if ((i & 4) != 0) {
            f3 = rect.c;
        }
        if ((i & 8) != 0) {
            f4 = rect.d;
        }
        rect.getClass();
        return new Rect(f, f2, f3, f4);
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.f1752a) & (fIntBitsToFloat < this.c) & (fIntBitsToFloat2 >= this.b) & (fIntBitsToFloat2 < this.d);
    }

    public final long c() {
        float f = this.c;
        float f2 = this.f1752a;
        return (Float.floatToRawIntBits(((f - f2) / 2.0f) + f2) << 32) | (Float.floatToRawIntBits(this.d) & 4294967295L);
    }

    public final long d() {
        float f = this.c;
        float f2 = this.f1752a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long e() {
        float f = this.c - this.f1752a;
        float f2 = this.d - this.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        return Float.compare(this.f1752a, rect.f1752a) == 0 && Float.compare(this.b, rect.b) == 0 && Float.compare(this.c, rect.c) == 0 && Float.compare(this.d, rect.d) == 0;
    }

    public final long f() {
        return (Float.floatToRawIntBits(this.f1752a) << 32) | (Float.floatToRawIntBits(this.b) & 4294967295L);
    }

    public final Rect g(Rect rect) {
        return new Rect(Math.max(this.f1752a, rect.f1752a), Math.max(this.b, rect.b), Math.min(this.c, rect.c), Math.min(this.d, rect.d));
    }

    public final boolean h() {
        return (this.f1752a >= this.c) | (this.b >= this.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + a.b(this.c, a.b(this.b, Float.hashCode(this.f1752a) * 31, 31), 31);
    }

    public final boolean i(Rect rect) {
        return (this.f1752a < rect.c) & (rect.f1752a < this.c) & (this.b < rect.d) & (rect.b < this.d);
    }

    public final Rect j(float f, float f2) {
        return new Rect(this.f1752a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final Rect k(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new Rect(Float.intBitsToFloat(i) + this.f1752a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.a(this.f1752a) + ", " + GeometryUtilsKt.a(this.b) + ", " + GeometryUtilsKt.a(this.c) + ", " + GeometryUtilsKt.a(this.d) + ')';
    }
}
