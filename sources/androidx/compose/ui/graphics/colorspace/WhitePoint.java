package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WhitePoint {

    /* renamed from: a, reason: collision with root package name */
    public final float f1796a;
    public final float b;

    public WhitePoint(float f, float f2) {
        this.f1796a = f;
        this.b = f2;
    }

    public final float[] a() {
        float f = this.f1796a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhitePoint)) {
            return false;
        }
        WhitePoint whitePoint = (WhitePoint) obj;
        return Float.compare(this.f1796a, whitePoint.f1796a) == 0 && Float.compare(this.b, whitePoint.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f1796a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f1796a);
        sb.append(", y=");
        return android.support.v4.media.session.a.r(sb, this.b, ')');
    }
}
