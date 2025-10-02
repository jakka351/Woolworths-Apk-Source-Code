package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/shape/RoundedCornerShape;", "Landroidx/compose/foundation/shape/CornerBasedShape;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RoundedCornerShape extends CornerBasedShape {
    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public final CornerBasedShape b(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new RoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public final Outline d(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        if (f + f2 + f3 + f4 == BitmapDescriptorFactory.HUE_RED) {
            return new Outline.Rectangle(RectKt.a(0L, j));
        }
        Rect rectA = RectKt.a(0L, j);
        LayoutDirection layoutDirection2 = LayoutDirection.d;
        float f5 = layoutDirection == layoutDirection2 ? f : f2;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
        float f6 = layoutDirection == layoutDirection2 ? f2 : f;
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
        float f7 = layoutDirection == layoutDirection2 ? f3 : f4;
        long jFloatToRawIntBits3 = (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L);
        float f8 = layoutDirection == layoutDirection2 ? f4 : f3;
        return new Outline.Rounded(RoundRectKt.a(rectA, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj;
        return Intrinsics.c(this.f1097a, roundedCornerShape.f1097a) && Intrinsics.c(this.b, roundedCornerShape.b) && Intrinsics.c(this.c, roundedCornerShape.c) && Intrinsics.c(this.d, roundedCornerShape.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f1097a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f1097a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
