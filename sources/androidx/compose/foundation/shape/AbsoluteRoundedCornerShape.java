package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/shape/AbsoluteRoundedCornerShape;", "Landroidx/compose/foundation/shape/CornerBasedShape;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AbsoluteRoundedCornerShape extends CornerBasedShape {
    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public final CornerBasedShape b(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new AbsoluteRoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public final Outline d(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        if (f + f2 + f3 + f4 == BitmapDescriptorFactory.HUE_RED) {
            return new Outline.Rectangle(RectKt.a(0L, j));
        }
        return new Outline.Rounded(RoundRectKt.a(RectKt.a(0L, j), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteRoundedCornerShape)) {
            return false;
        }
        AbsoluteRoundedCornerShape absoluteRoundedCornerShape = (AbsoluteRoundedCornerShape) obj;
        return Intrinsics.c(this.f1097a, absoluteRoundedCornerShape.f1097a) && Intrinsics.c(this.b, absoluteRoundedCornerShape.b) && Intrinsics.c(this.c, absoluteRoundedCornerShape.c) && Intrinsics.c(this.d, absoluteRoundedCornerShape.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f1097a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + this.f1097a + ", topRight = " + this.b + ", bottomRight = " + this.c + ", bottomLeft = " + this.d + ')';
    }
}
